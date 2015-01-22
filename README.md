MaterialSamples
===============

Samples for the Material library by Zielony

### Custom views

##### Button
Features the ripple touch feedback, elevation and the Roboto font.

![My image](https://github.com/ZieIony/MaterialSamples/blob/master/images/ripple%20button.png)

##### TextView

![My image](https://github.com/ZieIony/MaterialSamples/blob/master/images/roboto%20textview.png)

##### FloatingActionButton
Ready to go implementation of a round button with an icon, a ripple, and a cast shadow.

![My image](https://github.com/ZieIony/MaterialSamples/blob/master/images/floating%20action%20button.png)

##### ShadowLayout
A layout used for rendering shadows. Each view with non-zero elevaion value should be placed in a ShadowLayout in order to cast shadows. Due to clipping issues on some devices this is neccessary, at least for now.

![My image](https://github.com/ZieIony/MaterialSamples/blob/master/images/bunny.png)

##### Snackbar
Toast's successor. Simple view used for displaying messages and simple actions.

![My image](https://github.com/ZieIony/MaterialSamples/blob/master/images/snackbar.png)

##### SVGView
ImageView used for rendering SVG files. Supports official SVG icons from Google, SVGs created in Illustrator and pretty much any well-formed SVG images. Internally uses the AndroidSVG library.

![My image](https://github.com/ZieIony/MaterialSamples/blob/master/images/svg%20icons.png)

##### StatusBar, NavigationBar
Two simple views for handling colored status and navigation bars on all versions of Android. On Lollipop these views set colorPrimaryDark, on KitKat change the status and navigation bar's gradients. On older versions does nothing. StatusBar should be placed at the top of each Activity and NavigationBar should be placed at the bottom.

##### ImageView
Basic ImageView extended with most of the described features. Can use the new fade with brightness and saturation change.

![My image](https://github.com/ZieIony/MaterialSamples/blob/master/images/mazda%20fade.png)

### Custom attributes

The library adds several custom attributes, which can be used in xml to access material features in custom views.

##### material_colorPrimary (reference|color)
##### material_colorPrimaryDark (reference|color)
##### material_colorAccent (reference|color)
##### material_colorBackground (reference|color)

##### material_filterColor (reference|color)
Used by SVGView. Changes color of the rendered shape to the specified.

##### material_src (reference)
Used by SVGView. Should point to a raw resource containing an svg image.

##### material_rippleColor (color)
Used by Button, FrameLayout and FloatingActionButton.

##### material_elevation (dimension)
Used by Button, FrameLayout and FloatingActionButton. A View with non-zero elevation value has to be a child of a ShadowLayout instance.

##### material_fabStyle (reference)
Style reference used by FloatingActionButton.

##### material_textStyle (enum)
Used by TextView and Button. Sets the Roboto typeface with a specified style. Can be one of the following values:
 - black
 - blackItalic
 - bold
 - boldItalic
 - italic
 - light
 - lightItalic
 - medium
 - mediumItalic
 - regular
 - thin
 - thinItalic
 - condensedBold
 - condensedBoldItalic
 - condensedItalic
 - condensedLight
 - condensedLightItalic
 - condensedRegular

##### material_inAnimation (enum)
##### material_outAnimation (enum)
Used by most of the views. Allows to specify an animation type to be used when setVisibility is called on that view. Can be one of the following values:
 - none
 - fade
 - pop
 - fly
 - brightnessSaturationFade (only for ImageView)
