Ext.onReady(function(){

    Ext.MessageBox.alert('INFO','Hello world');

/*
    new Ext.form.FormPanel({
        title : "가입정보",
        layout : 'fit',
        width : 300,
        renderTo : document.body, 
        frame : true,
        items : [{
          xtype : 'fieldset',
          title : '기본정보',
          autoHeight : true,
          items : [{
             xtype : 'textfield',
             fieldLabel : '도서명',
             name : 'name'
          }, { 
              xtype : 'textfield',
              fieldLabel : '저자명',
              name : 'author'
           }, {
              xtype : 'datefield',
              fieldLabel : '출판일',
              name : 'published'
          },{
        	  xtype : 'numberfield',
              fieldLabel : '가격',
              name : 'price'
          }] 
        }] 
      }); 
*/
	
    
	
/*
	var BookRecord = Ext.data.Record.create([
          {name : 'name' , mapping : 'name', type : 'string'},
          {name : 'author'},
          {name : 'price', defaultValue : 0}
      ]);

      var bookReader = new Ext.data.JsonReader({
          totalProperty : 'results',
          root : 'list',
          id : 'id'
      }, BookRecord);

	
      var grid = new Ext.grid.GridPanel({
    	    title : '책 정보',
    	    region : 'center',
    	    frame : true,
    	    store : new Ext.data.Store({
    	        url : 'FindAllBookListServlet',
    	        autoLoad : true,
    	        reader : bookReader
    	    }),
    	    columns : [
    	        {header: 'name', width: 300, sortable: true, align: 'center', dataIndex:'name' },
    	        {header: 'author', width: 150, sortable: true, align: 'center', dataIndex:'author'},
    	        {header: 'price', sortable: true, align: 'right', dataIndex:'price'}
    	     ],
    	     sm : new Ext.grid.RowSelectionModel({
    	         singleSelect : true
    	     })
    	 });

      
      var bookForm = new Ext.form.Form({ 
  	        region : 'east',
  	        title : '도서 정보',
  	        width : 300,
  	        frame : true,
  	        split :true,
  	        items :[{
	    	        	 xtype : 'textfield',
	    	             fieldLabel : '도서명',
	    	             name : 'name'
	    	        },{
	    	        	 xtype : 'textfield',
	    	             fieldLabel : '저자',
	    	             name : 'author'
	    	        },{
	    	        	 xtype : 'numberfield',
	    	             fieldLabel : '가격',
	    	             name : 'price'
	    	        }
  	        ],
  	        buttons : [{
  	            text : '저장',
  	            handler : function(){
  	        		
	  	        	Ext.Ajax.request({
	  	        	    url: 'http://localhost:8080/getMovieList',
	  	        	    params: {
	  	        	        director : 'Mike Judge'
	  	        	    },
	  	        	    method : 'GET',
	  	        	    success : successCallbackFn,
	  	        	    failure : failureCallbackFn
	  	        	});
  	        	}
  	        },{
  	        	text : '취소',
  	        	handler : function(){}
  	        }]
      });
      
      
      var successCallbackFn = function(){
    	  
      };
      
      var failureCallbackFn = function(){
      };
      
      
      var viewport = new Ext.Viewport({
    	    layout : 'border',
    	    renderTo : document.body,
    	    id : 'movieView',
    	    items : [bookForm,grid]
    	});
*/
    
    
});

