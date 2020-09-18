# Android_ToolBox
Android常用工具类  常用自定义控件

添加工程依赖

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
	
  添加Module依赖
  
	dependencies {
	        implementation 'com.github.Ivor-tan:Android_ToolBox:Tag'
	}

Application中初始化工具类
Utils.init(getApplicationContext());
