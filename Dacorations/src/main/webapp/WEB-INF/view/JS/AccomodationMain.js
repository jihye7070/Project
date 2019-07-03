
function slide(id, dir, n)
{
	var o = document.getElementById(id);

	for(var i=0; i<n; i++)
	{
		if(dir == 'left')
		{
			o.appendChild(o.firstChild);
		}
		else if(dir == 'right')
		{
			o.insertBefore(o.lastChild, o.firstChild);
		}
	}
}