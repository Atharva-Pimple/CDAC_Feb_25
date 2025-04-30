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
};

function fetchData(url,callback){
    console.log("Fetching data...");
    setTimeout(()=>{
        const parts=url.split("/");
        const data=func(parts[2]);
        callback(data);
    },2000);
    
}

fetchData("api/data/101",(data)=>{
    console.log(data);
});
