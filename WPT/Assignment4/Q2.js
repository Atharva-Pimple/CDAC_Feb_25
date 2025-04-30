const arr=[1,2,3,4,5,6,7,8,9,10];

function forEachElement(arr,callback){
    for(var i=0;i<arr.length;i++){
        console.log(callback(arr[i]));
    }
}

forEachElement(arr,(num)=>num*2);