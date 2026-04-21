# MediaTech - BMP Image Processing Library

A Java-based BMP (Bitmap) image I/O library for reading, writing, and manipulating BMP image files. This project is developed as a group assignment for a Media Technology course.

## Overview

This project provides a complete BMP file format implementation, allowing you to:
- **Read BMP files** with various color depths and compression formats
- **Write BMP files** with customizable image parameters
- **Manipulate pixels** using RGB color values
- **Handle image metadata** including resolution and dimensions
- **Process images** with custom algorithms (detail and area processing)

## Project Structure

```
meditech/
├── src/
│   ├── App.java                                    # Main entry point
│   ├── farbbild_gruppe02.txt                       # Color image processing results
│   ├── graubild_gruppe02.txt                       # Grayscale image processing results
│   └── vorlage/bild/                               # BMP library package
│       ├── bmp_io.java                             # BMP I/O command-line utility
│       ├── BmpImage.java                           # BMP image container with metadata
│       ├── BmpReader.java                          # BMP file reader implementation
│       ├── BmpWriter.java                          # BMP file writer implementation
│       ├── RgbImage.java                           # RGB pixel storage and access
│       ├── PixelColor.java                         # RGB color representation
│       ├── LittleEndianDataInput.java              # Little-endian binary input
│       └── LittleEndianDataOutput.java             # Little-endian binary output
├── img/                                            # Test and processed images
│   ├── Testbild.bmp                                # Original test image
│   ├── TestbildGrau.bmp                            # Grayscale test image
│   ├── Detail_Gruppe02.bmp                         # Group 02 detail processing result
│   └── Flaeche_Gruppe02.bmp                        # Group 02 area processing result
├── abgaben/                                        # Group submissions
│   ├── Gruppe02-Aufg2a.zip                         # Assignment 2a submission
│   ├── Gruppe02-Aufg2b.zip                         # Assignment 2b submission
│   ├── Gruppe02-Aufg2c.zip                         # Assignment 2c submission
│   └── konsolen-output-gruppe02.png                # Console execution output
├── lib/                                            # Dependencies
├── bin/                                            # Compiled output (generated)
└── README.md                                       # This file
```

## Core Components

### BmpImage
- Represents a complete BMP image file
- Stores image data, horizontal/vertical resolution
- Default resolution: 96 DPI (3780 pixels per meter)

### RgbImage
- Stores raw RGB pixel data
- Supports configurable bits-per-pixel (color depth)
- Provides pixel access via `getRgbPixel()` and `setRgbPixel()` methods

### PixelColor
- Represents a single pixel with RGB components
- `r` - Red channel (0-255)
- `g` - Green channel (0-255)
- `b` - Blue channel (0-255)

### BmpReader & BmpWriter
- `read_bmp()` - Reads BMP files and parses file headers
- `write_bmp()` - Writes BMP images to file format

## Usage

### Command-line Usage
```bash
# Compile from src directory
cd src
javac vorlage/bild/*.java

# Run the BMP utility with test image
java vorlage.bild.bmp_io img/Testbild.bmp [output.bmp]
```

- `input.bmp` - Input BMP file to read
- `output.bmp` - Optional output file path to save modified image

### Running from Project Root
```bash
javac src/vorlage/bild/*.java -d bin
java -cp bin vorlage.bild.bmp_io img/Testbild.bmp
```

## License

This project uses the BMP I/O library from **Project Nayuki** (https://www.nayuki.io/page/bmp-io-library-java) under the MIT License.

See source files for full license text.

## Test Images & Results

### Input Images
- `img/Testbild.bmp` - Original RGB test image
- `img/TestbildGrau.bmp` - Grayscale version of test image

### Processed Results (Group 02)
- `img/Detail_Gruppe02.bmp` - Detail processing result
- `img/Flaeche_Gruppe02.bmp` - Area/surface processing result
- `src/farbbild_gruppe02.txt` - Color image processing output data
- `src/graubild_gruppe02.txt` - Grayscale image processing output data

### Submissions
All assignments are archived in `abgaben/`:
- `Gruppe02-Aufg2a.zip` - Assignment 2a submission
- `Gruppe02-Aufg2b.zip` - Assignment 2b submission
- `Gruppe02-Aufg2c.zip` - Assignment 2c submission
- `konsolen-output-gruppe02.png` - Console output documentation
