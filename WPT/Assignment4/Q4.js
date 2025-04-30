const data=[
    {
        id:101,
        name:"Atharva",
        age:22
    },{
        id:102,
        name:"Kishor",
        age:55
    },{
        id:103,
        name:"Pimple",
        age:80
    }
];

const func=(id)=>{
    for(var i=0;i<data.length;i++){
        if(id==data[i].id){
            return data[i];
        }
    }
    return {error:"no data"};
};

function fetchData(url,callback){
    return new Promise((resolve,reject)=>{
        console.log("Fetching data...")
        setTimeout(()=>{
        const parts=url.split("/");
        const data=callback(parts[2]);
        if(data.error){
            reject(data);
        }else{
            resolve(data);
        }
        },3000);
    });
}

fetchData("api/data/101",func)
.then((data)=>{
    console.log(data);
})
.catch((data)=>{
    console.log("Error occured!!!");
})
