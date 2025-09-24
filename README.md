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
├── com/
│   ├── devdaily/imagetests/
│   │   └── JavaWalkBufferedImageTest1.java    # Basic image pixel analysis
│   └── toprankdigital/imageprocessing/rgb/
│       ├── ColorRGB_Bean.java                 # RGB color data model
│       ├── ColorRGB_Processor.java            # Core processing engine
│       ├── ColorRGB_ComparativoBean.java      # Color comparison utility
│       ├── ColorRGB_Test1.java                # Single palette quantization
│       └── ColorRGB_Test2.java                # Multi-palette grid effects

assets/images/                                 # Input images (Foto-1.jpg to Foto-8.jpg)
output/                                       # Processed output images
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

- **`ColorRGB_Test1`**: Uses a palette of ~137 predefined colors for standard quantization
- **`ColorRGB_Test2`**: Creates artistic 2x2 grid effects with custom 3-color palettes per quadrant

## Usage

### Running Color Quantization

```bash
# Compile the project (output goes to build/ directory)
javac -d build src/com/toprankdigital/imageprocessing/rgb/*.java src/com/devdaily/imagetests/*.java

# Run standard color quantization
java -cp build com.toprankdigital.imageprocessing.rgb.ColorRGB_Test1

# Run multi-palette grid effects
java -cp build com.toprankdigital.imageprocessing.rgb.ColorRGB_Test2

# Run pixel analysis utility  
java -cp build com.devdaily.imagetests.JavaWalkBufferedImageTest1
```

### Input Requirements

- Place images in the `assets/images/` directory
- Supported formats: JPG, PNG
- Update file paths in the test classes as needed

## Technical Details

### Core Classes

- **`ColorRGB_Bean`**: Encapsulates RGB color data with hex/decimal representations
- **`ColorRGB_Processor`**: Contains the predefined color palette and distance calculation algorithms
- **`ColorRGB_ComparativoBean`**: Implements `Comparable` for sorting colors by distance

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

Created by Jean Paul for exploring color quantization techniques and artistic image processing in Java.
