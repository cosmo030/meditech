# MediaTech - BMP Image Processing Library

A Java-based BMP (Bitmap) image I/O library for reading, writing, and manipulating BMP image files.

## Overview

This project provides a complete BMP file format implementation, allowing you to:
- **Read BMP files** with various color depths and compression formats
- **Write BMP files** with customizable image parameters
- **Manipulate pixels** using RGB color values
- **Handle image metadata** including resolution and dimensions

## Project Structure

```
meditech/
├── src/
│   ├── App.java                      # Main entry point
│   ├── bmp_io.java                   # BMP I/O command-line utility
│   ├── BmpImage.java                 # BMP image container with metadata
│   ├── BmpReader.java                # BMP file reader implementation
│   ├── BmpWriter.java                # BMP file writer implementation
│   ├── RgbImage.java                 # RGB pixel storage and access
│   ├── PixelColor.java               # RGB color representation (R, G, B values)
│   ├── LittleEndianDataInput.java    # Little-endian binary data input stream
│   └── LittleEndianDataOutput.java   # Little-endian binary data output stream
├── lib/                              # Dependencies
└── bin/                              # Compiled output (generated)
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
javac src/*.java
java bmp_io input.bmp [output.bmp]
```

- `input.bmp` - Input BMP file to read
- `output.bmp` - Optional output file path to save modified image

## License

This project uses the BMP I/O library from **Project Nayuki** (https://www.nayuki.io/page/bmp-io-library-java) under the MIT License.

See source files for full license text.
