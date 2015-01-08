MaterialSamples
===============

Samples for the Material library by Zielony

### Custom views

##### Button
Features the ripple touch feedback, elevation and the Roboto font.

##### TextView

##### FloatingActionButton
Ready to go implementation of a round button with an icon, a ripple, and a cast shadow.

##### ShadowLayout
A layout used for rendering shadows. Each view with non-zero elevaion value should be placed in a ShadowLayout in order to cast shadows. Due to clipping issues on some devices this is neccessary, at least for now.

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
