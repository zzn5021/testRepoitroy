<script type="text/javascript">
				
			function pageUtil(pageNum){
				var frm=document.forms[0];
				$("#pageName").val(pageNum);
				frm.action=frm.action+"?pageNum="+pageNum;
				frm.submit();
			}
</script>
		
<#if page.isFirstPage>
	首页
	<#else>
	<a href="javascript:pageUtil(1)">首页</a>
</#if>

<#if page.hasPreviousPage>
	<a href="javascript:pageUtil(${page.prePage})">上一页</a>
</#if>
<#if page.hasNextPage>
	<a href="javascript:pageUtil(${page.nextPage})">下一页</a>
</#if>
<#if page.isLastPage>
		尾页
	<#else>
	<a href="javascript:pageUtil(${page.pages})">尾页</a>
</#if>