
//诊断平台的下控界面使用的函数  分别进行查询数据以及一些动画的效果
//-----------------------------------------------------------------
	 function selectSchoolName(obj){
			$("#deviceNo").html("");
			var spanStr = "";
			var schoolName=obj.value;
			if(schoolName==null){
				schoolName=obj;
			}
		    $.ajax({
		            url:"/robot/find/selectSchoolName／"+schoolName, 
		            type:'post',
		            dataType:'json',
		            contentType: "application/json; charset=utf-8",
		           	success:function(data){
		                $.each(data,function(title,obj){
		                    spanStr += '<option>'+obj.deviceNo+'</option>';
		                });
		                $("#deviceNo").append(spanStr);
		            },
		            error:function(){
		                alert("error");
		            },
		    });
		}
	 
	//-----------------------------------------------------------------
	 function queryVersionInfoAll(){
		var tr="<tr><td>机器人编号</td><td>表情包版本</td><td>语音包版本</td><td>安卓软件版本</td><td>安卓操作系统版本</td><td>linux软件版本</td><td>linux操作系统版本</td><td>运动控制板软件版本</td><td>上传的时间</td></tr>";
		 $.ajax({
	            url:"/robot/find/queryVersionInfoAll", 
	            type:'post',
	            dataType:'json',
	            contentType: "application/json; charset=utf-8",
	           	success:function(data){
	                 $.each(data,function(i,obj){
	                	if(i==data.length-1){
	                		tr+='<tr><td>'+obj.deviceNo+'</td><td>'+obj.emotionZipVersion+'</td><td>'+obj.voiceZipVersion+'</td><td>'+obj.androidVersion+'</td><td>'+obj.androidSystemVersion+'</td><td>'+obj.linuxSoftVersion+'</td><td>'+obj.linuxSystemVersion+'</td><td>'+obj.motionControlVersion+'</td><td>'+obj.createDate+'</td></tr>';
							 $("#methodName").append(tr);
	                	}
	                });
	            },
	            error:function(){
	                alert("error");
	            },
	    });
	 }
	//-----------------------------------------------------------------
	 function queryHardwareInfoAll(){
		var tr='<tr><td>机器人编号</td><td>安卓核心板</td><td>linux核心板</td><td>1号个摄像头</td><td>2号个摄像头</td><td>热像仪</td><td>RFID读卡器</td><td>液晶屏</td><td>上传的时间</td></tr>';
		 $.ajax({
	            url:"/robot/find/queryHardwareInfoAll", 
	            type:'post',
	            dataType:'json',
	            contentType: "application/json; charset=utf-8",
	           	success:function(data){
	                 $.each(data,function(i,obj){
	                	if(i==data.length-1){
	                		tr+='<tr><td>'+obj.deviceNo+'</td><td>'+obj.androidCoreBoard+'</td><td>'+obj.linuxCoreBoard+'</td><td>'+obj.oneCamera+'</td><td>'+obj.twoCamera+'</td><td>'+obj.thermalImager+'</td><td>'+obj.rfidCardReader+'</td><td>'+obj.liquidCrystalDisplay+'</td><td>'+obj.createDate+'</td></tr>';
							 $("#methodName").append(tr);
	                	}
	                });
	            },
	            error:function(){
	                alert("error");
	            },
	    });
	 }
	//-----------------------------------------------------------------
	
	 function queryTemperatureInfoAll(){
		var tr='<tr><td>机器人编号</td><td>环境温度</td><td>CPU温度</td><td>上传的时间</td></tr>';
		 $.ajax({
	            url:"/robot/find/queryTemperatureInfoAll", 
	            type:'post',
	            dataType:'json',
	            contentType: "application/json; charset=utf-8",
	           	success:function(data){
	                 $.each(data,function(i,obj){
	                	if(i==data.length-1){
	                		tr+='<tr><td>'+obj.deviceNo+'</td><td>'+obj.environmentTemperature+'</td><td>'+obj.cPUTemperature+'</td><td>'+obj.createDate+'</td>';													 $("#methodName").append(tr);
	                	}
	                });
	            },
	            error:function(){
	                alert("error");
	            },
	    });
	 }
	 //-----------------------------------------------------------------
	 function queryOperationInfoAll(){
		var tr='<tr><td>机器人编号</td><td>安卓CPU占用</td><td>安卓内存</td><td>flash占用情况</td><td>Linux的CPU</td><td>Linux的内存</td><td>Linux的flash占用情况</td><td>wifi信号比</td><td>上传的时间</td></tr>';
		 $.ajax({
	            url:"/robot/find/queryOperationInfoAll", 
	            type:'post',
	            dataType:'json',
	            contentType: "application/json; charset=utf-8",
	           	success:function(data){
	                 $.each(data,function(i,obj){
	                	if(i==data.length-1){
	                		tr+='<tr><td>'+obj.deviceNo+'</td><td>'+obj.androidCPU+'</td><td>'+obj.androidBoardMemory+'</td><td>'+obj.androidFlashOccupation+'</td><td>'+obj.linuxCPU+'</td><td>'+obj.linuxBoardMemory+'</td><td>'+obj.linuxFlashOccupation+'</td><td>'+obj.wifiSignalRation+'</td><td>'+obj.createDate+'</td></tr>';													 
	                		$("#methodName").append(tr);
	                	}
	                });
	            },
	            error:function(){
	                alert("error");
	            },
	    });
	 }
	//-----------------------------------------------------------------
	function queryManageInfoAll(){
		var tr="<tr><td>机器人编号</td><td>小诺注册密码</td><td>上传的时间</td></tr>";
		 $.ajax({
	            url:"/robot/find/queryManageInfoAll", 
	            type:'post',
	            dataType:'json',
	            contentType: "application/json; charset=utf-8",
	           	success:function(data){
	                 $.each(data,function(i,obj){
	                	if(i==data.length-1){
	                		tr+='<tr><td>'+obj.deviceNo+'</td><td>'+obj.registerPassword+'</td><td>'+obj.createDate+'</td></tr>';													 
	                		$("#methodName").append(tr);
	                	}
	                });
	            },
	            error:function(){
	                alert("error");
	            },
	    });
	 }
	//-----------------------------------------------------------------
	function querySelfLnspectionInfoAll(){
		var tr="<tr><td>机器人编号</td><td>液晶屏</td><td>摄像头1</td><td>摄像头2</td><td>热像仪</td><td>运动控制模块</td><td>语音模块</td><td>rfid</td><td>上次启动的时间</td><td>本次启动的时间</td><td>启动的原因</td><td>上传的时间</td></tr>";
		$.ajax({
	            url:"/robot/find/querySelfLnspectionInfoAll", 
	            type:'post',
	            dataType:'json',
	            contentType: "application/json; charset=utf-8",
	           	success:function(data){
	                 $.each(data,function(i,obj){
	                	if(i==data.length-1){
	                		tr+='<tr><td>'+obj.deviceNo+'</td><td>'+obj.siLiquidCrystalDisplay+'</td><td>'+obj.siOneCamera+'</td><td>'+obj.siTowcamera+'</td><td>'+obj.siThermalImager+'</td><td>'+obj.siMovementModule+'</td><td>'+obj.siVoiceModule+'</td><td>'+obj.siRfid+'</td><td>'+obj.siTheLastTime+'</td><td>'+obj.siTheStartTime+'</td><td>'+obj.siStartTheReason+'</td><td>'+obj.createDate+'</td></tr>';													 
	                		$("#methodName").append(tr);
	                	}
	                });
	            },
	            error:function(){
	                alert("error");
	            },
	    });
	 }
	//-----------------------------------------------------------------
	function queryMeetSpeedInfoAll(){
		var tr="<tr><td>机器人编号</td><td>最大识别时间</td><td>最小识别时间</td><td>平均识别时间</td><td>上传的时间</td></tr>";
		 $.ajax({
	            url:"/robot/find/queryMeetSpeedInfoAll", 
	            type:'post',
	            dataType:'json',
	            contentType: "application/json; charset=utf-8",
	           	success:function(data){
	                 $.each(data,function(i,obj){
	                	if(i==data.length-1){
	                		tr+='<tr><td>'+obj.deviceNo+'</td><td>'+obj.maximumMeetTime+'</td><td>'+obj.minimumMeetTime+'</td><td>'+obj.vaerageMeetTime+'</td><td>'+obj.createDate+'</td></tr>';													 
	                		$("#methodName").append(tr);
	                	}
	                });
	            },
	            error:function(){
	                alert("error");
	            },
	    });
	 }
	//-----------------------------------------------------------------
	function queryMeetPropertyInfoAll(){
		var tr="<tr><td>机器人编号</td><td>园区注册人数</td><td>当天检测人数</td><td>成功检测人数</td><td>识别人数</td><td>重复识别人数</td><td>接送人数</td><td>上传的时间</td></tr>";
		 $.ajax({
	            url:"/robot/find/queryMeetPropertyInfoAll", 
	            type:'post',
	            dataType:'json',
	            contentType: "application/json; charset=utf-8",
	           	success:function(data){
	                 $.each(data,function(i,obj){
	                	if(i==data.length-1){
	                		tr+='<tr><td>'+obj.deviceNo+'</td><td>'+obj.theRegistrationNumber+'</td><td>'+obj.theNumberTest+'</td><td>'+obj.successFulTestNumber+'</td><td>'+obj.meetTheNumber+'</td><td>'+obj.repeatIdentificationNumber+'</td><td>'+obj.takeTheNumber+'</td><td>'+obj.createDate+'</td></tr>';													 
	                		$("#methodName").append(tr);
	                	}
	                });
	            },
	            error:function(){
	                alert("error");
	            },
	    });
	 }
	//-----------------------------------------------------------------
	function queryOnLineInfoAll(){
		var  tr="<tr><td>机器人编号</td><td>Linux在线</td><td>安卓在线</td><td>运行控制模版在线</td><td>上传的时间</td></tr>";
		 $.ajax({
	            url:"/robot/find/queryOnLineInfoAll", 
	            type:'post',
	            dataType:'json',
	            contentType: "application/json; charset=utf-8",
	           	success:function(data){
	                 $.each(data,function(i,obj){
	                	if(i==data.length-1){
	                		tr+='<tr><td>'+obj.deviceNo+'</td><td>'+obj.linuxOnLine+'</td><td>'+obj.androidOnLine+'</td><td>'+obj.exerciseOnline+'</td><td>'+obj.createDate+'</td></tr>';													 
	                		$("#methodName").append(tr);
	                	}
	                });
	            },
	            error:function(){
	                alert("error");
	            },
	    });
	 }
	//-----------------------------------------------------------------
	function queryPhotographicQualityInfoAll(){
		var tr="<tr><td>机器人编号</td><td>平均的信心指数</td><td>最大信心指数</td><td>最小信心指数</td><td>上传的时间</td></tr>";
		 $.ajax({
	            url:"/robot/find/queryPhotographicQualityInfoAll", 
	            type:'post',
	            dataType:'json',
	            contentType: "application/json; charset=utf-8",
	           	success:function(data){
	                 $.each(data,function(i,obj){
	                	if(i==data.length-1){
	                		tr+='<tr><td>'+obj.deviceNo+'</td><td>'+obj.acerageConfidenceIndex+'</td><td>'+obj.maximumConfidenceInfo+'</td><td>'+obj.minimumConfidenceInfo+'</td><td>'+obj.createDate+'</td></tr>';													 
	                		$("#methodName").append(tr);
	                	}
	                });
	            },
	            error:function(){
	                alert("error");
	            },
	    });
	 }
	//-----------------------------------------------------------------
	function execute(){
		//清空内容
		$("#methodName").html("");
		//得到方法名
		var methodName=$("#typeName").val();
		//得到参数
		var deviceNo=$("#deviceNo").val();
		 $.ajax({
	            url:"/robot/down/"+methodName+"/"+deviceNo, 
	            type:'post',
	            dataType:'json',
	           	timeout: 5000,
	           	success:function(data){
					if(data.message=="执行控制命令成功"){
						 //组合不同的表头
						 if(methodName=="reportVersionInfo"){//版本信息
							 queryVersionInfoAll();
						 }else if(methodName=="reporThardwareInfo"){//硬件信息
							 queryHardwareInfoAll();
						 }else if(methodName=="reportTemperatureInfo"){//温度信息
							 queryTemperatureInfoAll();
						 }else if(methodName=="reportOperationInfo"){//运行环境信息
							 queryOperationInfoAll();
						 }else if(methodName=="reportManageInfo"){//机器管理信息
							 queryManageInfoAll();
						 }else if(methodName=="reportSelfLnspectionInfo"){//自检信息
							 querySelfLnspectionInfoAll();
						 }else if(methodName=="reportMeetSpeedInfo"){//识别速度信息
							 queryMeetSpeedInfoAll();
						 }else if(methodName=="reportMeetPropertyInfo"){//识别性能信息
							 queryMeetPropertyInfoAll();
						 }else if(methodName=="reportOnLineInfo"){//运行在线信息
							 queryOnLineInfoAll();
						 }else if(methodName=="reportPhotographicQualityInfo"){//照片质量信息信息
							 queryPhotographicQualityInfoAll();
						 }
					}else{
						alert(data.message);
					}
	            },
	            error:function(){
	                alert("程序发送错误！");
	            },
	    });
	};