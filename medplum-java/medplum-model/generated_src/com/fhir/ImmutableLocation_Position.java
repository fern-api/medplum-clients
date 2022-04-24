//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link Location_Position}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableLocation_Position.builder()}.
 */
@org.immutables.value.Generated(from = "Location_Position", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableLocation_Position implements com.fhir.Location_Position {
  private final @javax.annotation.Nullable com.fhir.decimal altitude;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable com.fhir.decimal longitude;
  private final @javax.annotation.Nullable com.fhir.decimal latitude;
  private final @javax.annotation.Nullable java.lang.String id;

  private ImmutableLocation_Position(
      @javax.annotation.Nullable com.fhir.decimal altitude,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable com.fhir.decimal longitude,
      @javax.annotation.Nullable com.fhir.decimal latitude,
      @javax.annotation.Nullable java.lang.String id) {
    this.altitude = altitude;
    this.extension = extension;
    this.modifierExtension = modifierExtension;
    this.longitude = longitude;
    this.latitude = latitude;
    this.id = id;
  }

  /**
   * @return The value of the {@code altitude} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("altitude")
  @Override
  public java.util.Optional<com.fhir.decimal> altitude() {
    return java.util.Optional.ofNullable(altitude);
  }

  /**
   * @return The value of the {@code extension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("extension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> extension() {
    return java.util.Optional.ofNullable(extension);
  }

  /**
   * @return The value of the {@code modifierExtension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() {
    return java.util.Optional.ofNullable(modifierExtension);
  }

  /**
   * @return The value of the {@code longitude} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("longitude")
  @Override
  public java.util.Optional<com.fhir.decimal> longitude() {
    return java.util.Optional.ofNullable(longitude);
  }

  /**
   * @return The value of the {@code latitude} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("latitude")
  @Override
  public java.util.Optional<com.fhir.decimal> latitude() {
    return java.util.Optional.ofNullable(latitude);
  }

  /**
   * @return The value of the {@code id} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("id")
  @Override
  public java.util.Optional<java.lang.String> id() {
    return java.util.Optional.ofNullable(id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Location_Position#altitude() altitude} attribute.
   * @param value The value for altitude
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLocation_Position withAltitude(com.fhir.decimal value) {
    @javax.annotation.Nullable com.fhir.decimal newValue = java.util.Objects.requireNonNull(value, "altitude");
    if (this.altitude == newValue) return this;
    return new ImmutableLocation_Position(newValue, this.extension, this.modifierExtension, this.longitude, this.latitude, this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Location_Position#altitude() altitude} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for altitude
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableLocation_Position withAltitude(java.util.Optional<? extends com.fhir.decimal> optional) {
    @javax.annotation.Nullable com.fhir.decimal value = optional.orElse(null);
    if (this.altitude == value) return this;
    return new ImmutableLocation_Position(value, this.extension, this.modifierExtension, this.longitude, this.latitude, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Location_Position#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLocation_Position withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableLocation_Position(this.altitude, newValue, this.modifierExtension, this.longitude, this.latitude, this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Location_Position#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableLocation_Position withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableLocation_Position(this.altitude, value, this.modifierExtension, this.longitude, this.latitude, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Location_Position#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLocation_Position withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableLocation_Position(this.altitude, this.extension, newValue, this.longitude, this.latitude, this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Location_Position#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableLocation_Position withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableLocation_Position(this.altitude, this.extension, value, this.longitude, this.latitude, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Location_Position#longitude() longitude} attribute.
   * @param value The value for longitude
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLocation_Position withLongitude(com.fhir.decimal value) {
    @javax.annotation.Nullable com.fhir.decimal newValue = java.util.Objects.requireNonNull(value, "longitude");
    if (this.longitude == newValue) return this;
    return new ImmutableLocation_Position(this.altitude, this.extension, this.modifierExtension, newValue, this.latitude, this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Location_Position#longitude() longitude} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for longitude
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableLocation_Position withLongitude(java.util.Optional<? extends com.fhir.decimal> optional) {
    @javax.annotation.Nullable com.fhir.decimal value = optional.orElse(null);
    if (this.longitude == value) return this;
    return new ImmutableLocation_Position(this.altitude, this.extension, this.modifierExtension, value, this.latitude, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Location_Position#latitude() latitude} attribute.
   * @param value The value for latitude
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLocation_Position withLatitude(com.fhir.decimal value) {
    @javax.annotation.Nullable com.fhir.decimal newValue = java.util.Objects.requireNonNull(value, "latitude");
    if (this.latitude == newValue) return this;
    return new ImmutableLocation_Position(this.altitude, this.extension, this.modifierExtension, this.longitude, newValue, this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Location_Position#latitude() latitude} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for latitude
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableLocation_Position withLatitude(java.util.Optional<? extends com.fhir.decimal> optional) {
    @javax.annotation.Nullable com.fhir.decimal value = optional.orElse(null);
    if (this.latitude == value) return this;
    return new ImmutableLocation_Position(this.altitude, this.extension, this.modifierExtension, this.longitude, value, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Location_Position#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLocation_Position withId(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "id");
    if (java.util.Objects.equals(this.id, newValue)) return this;
    return new ImmutableLocation_Position(this.altitude, this.extension, this.modifierExtension, this.longitude, this.latitude, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Location_Position#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLocation_Position withId(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.id, value)) return this;
    return new ImmutableLocation_Position(this.altitude, this.extension, this.modifierExtension, this.longitude, this.latitude, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableLocation_Position} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableLocation_Position
        && equalTo((ImmutableLocation_Position) another);
  }

  private boolean equalTo(ImmutableLocation_Position another) {
    return java.util.Objects.equals(altitude, another.altitude)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(longitude, another.longitude)
        && java.util.Objects.equals(latitude, another.latitude)
        && java.util.Objects.equals(id, another.id);
  }

  /**
   * Computes a hash code from attributes: {@code altitude}, {@code extension}, {@code modifierExtension}, {@code longitude}, {@code latitude}, {@code id}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(altitude);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(longitude);
    h += (h << 5) + java.util.Objects.hashCode(latitude);
    h += (h << 5) + java.util.Objects.hashCode(id);
    return h;
  }

  /**
   * Prints the immutable value {@code Location_Position} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("Location_Position{");
    if (altitude != null) {
      builder.append("altitude=").append(altitude);
    }
    if (extension != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (modifierExtension != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (longitude != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("longitude=").append(longitude);
    }
    if (latitude != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("latitude=").append(latitude);
    }
    if (id != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("id=").append(id);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "Location_Position", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.Location_Position {
    @javax.annotation.Nullable java.util.Optional<com.fhir.decimal> altitude = java.util.Optional.empty();
    boolean altitudeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.decimal> longitude = java.util.Optional.empty();
    boolean longitudeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.decimal> latitude = java.util.Optional.empty();
    boolean latitudeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> id = java.util.Optional.empty();
    boolean idIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("altitude")
    public void setAltitude(java.util.Optional<com.fhir.decimal> altitude) {
      this.altitude = altitude;
      this.altitudeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("longitude")
    public void setLongitude(java.util.Optional<com.fhir.decimal> longitude) {
      this.longitude = longitude;
      this.longitudeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("latitude")
    public void setLatitude(java.util.Optional<com.fhir.decimal> latitude) {
      this.latitude = latitude;
      this.latitudeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<java.lang.String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @Override
    public java.util.Optional<com.fhir.decimal> altitude() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.decimal> longitude() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.decimal> latitude() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> id() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableLocation_Position fromJson(Json json) {
    ImmutableLocation_Position.Builder builder = ImmutableLocation_Position.builder();
    if (json.altitudeIsSet) {
      builder.altitude(json.altitude);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.longitudeIsSet) {
      builder.longitude(json.longitude);
    }
    if (json.latitudeIsSet) {
      builder.latitude(json.latitude);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    return (ImmutableLocation_Position) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Location_Position} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Location_Position instance
   */
  public static Location_Position copyOf(Location_Position instance) {
    if (instance instanceof ImmutableLocation_Position) {
      return (ImmutableLocation_Position) instance;
    }
    return ImmutableLocation_Position.builder()
        .altitude(instance.altitude())
        .extension(instance.extension())
        .modifierExtension(instance.modifierExtension())
        .longitude(instance.longitude())
        .latitude(instance.latitude())
        .id(instance.id())
        .build();
  }

  /**
   * Creates a builder for {@link Location_Position Location_Position}.
   * <pre>
   * ImmutableLocation_Position.builder()
   *    .altitude(com.fhir.decimal) // optional {@link Location_Position#altitude() altitude}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Location_Position#extension() extension}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Location_Position#modifierExtension() modifierExtension}
   *    .longitude(com.fhir.decimal) // optional {@link Location_Position#longitude() longitude}
   *    .latitude(com.fhir.decimal) // optional {@link Location_Position#latitude() latitude}
   *    .id(String) // optional {@link Location_Position#id() id}
   *    .build();
   * </pre>
   * @return A new Location_Position builder
   */
  public static ImmutableLocation_Position.Builder builder() {
    return new ImmutableLocation_Position.Builder();
  }

  /**
   * Builds instances of type {@link Location_Position Location_Position}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "Location_Position", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_ALTITUDE = 0x1L;
    private static final long OPT_BIT_EXTENSION = 0x2L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x4L;
    private static final long OPT_BIT_LONGITUDE = 0x8L;
    private static final long OPT_BIT_LATITUDE = 0x10L;
    private static final long OPT_BIT_ID = 0x20L;
    private long optBits;

    private @javax.annotation.Nullable com.fhir.decimal altitude;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable com.fhir.decimal longitude;
    private @javax.annotation.Nullable com.fhir.decimal latitude;
    private @javax.annotation.Nullable java.lang.String id;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Location_Position#altitude() altitude} to altitude.
     * @param altitude The value for altitude
     * @return {@code this} builder for chained invocation
     */
    public final Builder altitude(com.fhir.decimal altitude) {
      checkNotIsSet(altitudeIsSet(), "altitude");
      this.altitude = java.util.Objects.requireNonNull(altitude, "altitude");
      optBits |= OPT_BIT_ALTITUDE;
      return this;
    }

    /**
     * Initializes the optional value {@link Location_Position#altitude() altitude} to altitude.
     * @param altitude The value for altitude
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("altitude")
    public final Builder altitude(java.util.Optional<? extends com.fhir.decimal> altitude) {
      checkNotIsSet(altitudeIsSet(), "altitude");
      this.altitude = altitude.orElse(null);
      optBits |= OPT_BIT_ALTITUDE;
      return this;
    }

    /**
     * Initializes the optional value {@link Location_Position#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    public final Builder extension(java.util.List<com.fhir.Extension> extension) {
      checkNotIsSet(extensionIsSet(), "extension");
      this.extension = java.util.Objects.requireNonNull(extension, "extension");
      optBits |= OPT_BIT_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link Location_Position#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public final Builder extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension) {
      checkNotIsSet(extensionIsSet(), "extension");
      this.extension = extension.orElse(null);
      optBits |= OPT_BIT_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link Location_Position#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    public final Builder modifierExtension(java.util.List<com.fhir.Extension> modifierExtension) {
      checkNotIsSet(modifierExtensionIsSet(), "modifierExtension");
      this.modifierExtension = java.util.Objects.requireNonNull(modifierExtension, "modifierExtension");
      optBits |= OPT_BIT_MODIFIER_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link Location_Position#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public final Builder modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension) {
      checkNotIsSet(modifierExtensionIsSet(), "modifierExtension");
      this.modifierExtension = modifierExtension.orElse(null);
      optBits |= OPT_BIT_MODIFIER_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link Location_Position#longitude() longitude} to longitude.
     * @param longitude The value for longitude
     * @return {@code this} builder for chained invocation
     */
    public final Builder longitude(com.fhir.decimal longitude) {
      checkNotIsSet(longitudeIsSet(), "longitude");
      this.longitude = java.util.Objects.requireNonNull(longitude, "longitude");
      optBits |= OPT_BIT_LONGITUDE;
      return this;
    }

    /**
     * Initializes the optional value {@link Location_Position#longitude() longitude} to longitude.
     * @param longitude The value for longitude
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("longitude")
    public final Builder longitude(java.util.Optional<? extends com.fhir.decimal> longitude) {
      checkNotIsSet(longitudeIsSet(), "longitude");
      this.longitude = longitude.orElse(null);
      optBits |= OPT_BIT_LONGITUDE;
      return this;
    }

    /**
     * Initializes the optional value {@link Location_Position#latitude() latitude} to latitude.
     * @param latitude The value for latitude
     * @return {@code this} builder for chained invocation
     */
    public final Builder latitude(com.fhir.decimal latitude) {
      checkNotIsSet(latitudeIsSet(), "latitude");
      this.latitude = java.util.Objects.requireNonNull(latitude, "latitude");
      optBits |= OPT_BIT_LATITUDE;
      return this;
    }

    /**
     * Initializes the optional value {@link Location_Position#latitude() latitude} to latitude.
     * @param latitude The value for latitude
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("latitude")
    public final Builder latitude(java.util.Optional<? extends com.fhir.decimal> latitude) {
      checkNotIsSet(latitudeIsSet(), "latitude");
      this.latitude = latitude.orElse(null);
      optBits |= OPT_BIT_LATITUDE;
      return this;
    }

    /**
     * Initializes the optional value {@link Location_Position#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(java.lang.String id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = java.util.Objects.requireNonNull(id, "id");
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link Location_Position#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public final Builder id(java.util.Optional<java.lang.String> id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = id.orElse(null);
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Builds a new {@link Location_Position Location_Position}.
     * @return An immutable instance of Location_Position
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.Location_Position build() {
      return new ImmutableLocation_Position(altitude, extension, modifierExtension, longitude, latitude, id);
    }

    private boolean altitudeIsSet() {
      return (optBits & OPT_BIT_ALTITUDE) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean longitudeIsSet() {
      return (optBits & OPT_BIT_LONGITUDE) != 0;
    }

    private boolean latitudeIsSet() {
      return (optBits & OPT_BIT_LATITUDE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of Location_Position is strict, attribute is already set: ".concat(name));
    }
  }
}
