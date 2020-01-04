import {Component} from '@angular/core';
import {HttpClient} from '@angular/common/http'
@Component({
        selector:'pnr-component',
        template:`
        <form (ngSubmit)="check()">
            Enter PRN No:<input [(ngModel)]=pnrNo name="pnrNo"/><br/>
            <button type="submit">Show Status</button>
        </form>
        <div *ngIf="data">
            {{data.travelDate}}
        </div>
        ` 
})
export class PnrComponent{
    pnrNo:number;
    data: any;
    
    //DI
    //Actually communication with server/rest api
    //should be done in sevice class
    //HttpClient is thr name of Angular's Ajax API

    constructor(private http:HttpClient){

    }
    check(){
        //alert("chalo chalo");
        //alert(this.pnrNo);
        var url="http://localhost:9090/RestDemo/app/pnr?pnrNo="+this.pnrNo;
        this.http.get(url).subscribe(response=>{
            //alert(JSON.stringify(response));
            this.data=response;
        })
    }
}