# Ti.popover (Android)

Based on the awesome [Balloon](https://github.com/skydoves/Balloon/) library by [@skydoves](https://github.com/skydoves).

```js

var popOverModule = require("ti.popover");

var popover = popOverModule.createPopover({
	arrowSize:20,
	arrowColor:'#e0e0e0',
	height:Ti.UI.SIZE,
	width:Ti.UI.SIZE,
	contentView:// contentView that will be inside the popover,
	borderRadius:12,
	arrowPosition:0.5,
	transparency:1.0,
	animation:popOverModule.POPOVER_ANIMATION_FADE,
	arrowDirection:popOverModule.POPOVER_ARROW_DIRECTION_RIGHT
});

popover.addEventListener('hide', function() {

});

popover.show({ 
	view: // view the popover will show at this views position
});	


```
