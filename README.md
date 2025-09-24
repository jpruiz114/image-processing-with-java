# Image Processing with Java

A Java-based image processing project that specializes in **color quantization** and artistic image transformations. This project reduces the number of colors in images by mapping pixels to predefined color palettes, creating stylized and artistic effects.

## Features

- **Color Quantization**: Reduces image colors to a limited palette using Euclidean distance calculations
- **Multi-Palette Processing**: Apply different color schemes to different regions of an image
- **RGB Color Management**: Comprehensive RGB color handling with hex/decimal conversions
- **Artistic Effects**: Create poster-like effects with limited color palettes
- **Batch Processing**: Process multiple images with consistent color schemes

## Project Structure

```
src/
├── com/toprankdigital/imageprocessing/
│   ├── ImagePixelAnalyzer.java                # Basic image pixel analysis utility
│   └── rgb/
│       ├── RGBColor.java                      # RGB color data model
│       ├── ColorProcessor.java                # Core color processing engine
│       ├── ColorComparison.java               # Color distance comparison utility
│       ├── ColorQuantizationDemo.java         # Single palette quantization demo
│       └── MultiPaletteProcessor.java         # Multi-palette grid effects processor

assets/images/                                 # Input images (Foto-1.jpg to Foto-8.jpg)
output/                                        # Processed output images
```

## How It Works

### Color Quantization Process

1. **Input**: Load a color image from the assets folder
2. **Analysis**: Extract RGB values from each pixel
3. **Mapping**: Find the closest color from a predefined palette using Euclidean distance:
   ```
   distance = √[(r1-r2)² + (g1-g2)² + (b1-b2)²]
   ```
4. **Replacement**: Replace original pixel with the closest palette color
5. **Output**: Save the quantized image with reduced color complexity

### Processing Options

- **`ColorQuantizationDemo`**: Uses a palette of ~137 predefined colors for standard quantization
- **`MultiPaletteProcessor`**: Creates artistic 2x2 grid effects with custom 3-color palettes per quadrant

## Usage

### Running Color Quantization

```bash
# Compile the project (output goes to build/ directory)
javac -d build src/com/toprankdigital/imageprocessing/rgb/*.java src/com/toprankdigital/imageprocessing/*.java

# Run color quantization demo
java -cp build com.toprankdigital.imageprocessing.rgb.ColorQuantizationDemo

# Run multi-palette grid processor
java -cp build com.toprankdigital.imageprocessing.rgb.MultiPaletteProcessor

# Run image pixel analyzer utility  
java -cp build com.toprankdigital.imageprocessing.ImagePixelAnalyzer
```

### Input Requirements

- Place images in the `assets/images/` directory
- Supported formats: JPG, PNG
- Update file paths in the test classes as needed

## Technical Details

### Core Classes

- **`RGBColor`**: Encapsulates RGB color data with hex/decimal representations and conversion utilities
- **`ColorProcessor`**: Contains the predefined color palette and distance calculation algorithms
- **`ColorComparison`**: Implements `Comparable` for sorting colors by distance and comparison operations
- **`ImagePixelAnalyzer`**: Utility for analyzing individual pixels in images and extracting ARGB values

### Color Palette

The project includes a curated palette of 137 web-safe and commonly used colors, including:
- Primary colors (red, green, blue)
- Web-safe colors
- Grayscale variations
- Named colors (navy, maroon, olive, etc.)

### Algorithms

- **Euclidean Distance**: Used for finding closest color matches in RGB space
- **Pixel-by-pixel Processing**: Iterates through every pixel for precise color mapping
- **Raster Manipulation**: Direct pixel manipulation using Java's `WritableRaster`

## Sample Output

The processing creates stylized, poster-like effects by limiting the color palette:
- Original images are transformed into artistic versions with fewer colors
- Multi-palette processing creates unique grid effects with different color schemes per quadrant
- Results maintain image structure while reducing color complexity

## Dependencies

- Java Standard Library (java.awt.image, javax.imageio)
- No external dependencies required

## Author

A professional Java implementation demonstrating color quantization techniques and artistic image processing algorithms.
