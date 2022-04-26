package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link Location_Position}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableLocation_Position.builder()}.
 */
@Generated(from = "Location_Position", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableLocation_Position implements Location_Position {
  private final @Nullable String id;
  private final @Nullable Decimal longitude;
  private final @Nullable Decimal altitude;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable List<Extension> extension;
  private final @Nullable Decimal latitude;

  private ImmutableLocation_Position(
      @Nullable String id,
      @Nullable Decimal longitude,
      @Nullable Decimal altitude,
      @Nullable List<Extension> modifierExtension,
      @Nullable List<Extension> extension,
      @Nullable Decimal latitude) {
    this.id = id;
    this.longitude = longitude;
    this.altitude = altitude;
    this.modifierExtension = modifierExtension;
    this.extension = extension;
    this.latitude = latitude;
  }

  /**
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<String> id() {
    return Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code longitude} attribute
   */
  @JsonProperty("longitude")
  @Override
  public Optional<Decimal> longitude() {
    return Optional.ofNullable(longitude);
  }

  /**
   * @return The value of the {@code altitude} attribute
   */
  @JsonProperty("altitude")
  @Override
  public Optional<Decimal> altitude() {
    return Optional.ofNullable(altitude);
  }

  /**
   * @return The value of the {@code modifierExtension} attribute
   */
  @JsonProperty("modifierExtension")
  @Override
  public Optional<List<Extension>> modifierExtension() {
    return Optional.ofNullable(modifierExtension);
  }

  /**
   * @return The value of the {@code extension} attribute
   */
  @JsonProperty("extension")
  @Override
  public Optional<List<Extension>> extension() {
    return Optional.ofNullable(extension);
  }

  /**
   * @return The value of the {@code latitude} attribute
   */
  @JsonProperty("latitude")
  @Override
  public Optional<Decimal> latitude() {
    return Optional.ofNullable(latitude);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Location_Position#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLocation_Position withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableLocation_Position(newValue, this.longitude, this.altitude, this.modifierExtension, this.extension, this.latitude);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Location_Position#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLocation_Position withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableLocation_Position(value, this.longitude, this.altitude, this.modifierExtension, this.extension, this.latitude);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Location_Position#longitude() longitude} attribute.
   * @param value The value for longitude
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLocation_Position withLongitude(Decimal value) {
    @Nullable Decimal newValue = Objects.requireNonNull(value, "longitude");
    if (this.longitude == newValue) return this;
    return new ImmutableLocation_Position(this.id, newValue, this.altitude, this.modifierExtension, this.extension, this.latitude);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Location_Position#longitude() longitude} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for longitude
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableLocation_Position withLongitude(Optional<? extends Decimal> optional) {
    @Nullable Decimal value = optional.orElse(null);
    if (this.longitude == value) return this;
    return new ImmutableLocation_Position(this.id, value, this.altitude, this.modifierExtension, this.extension, this.latitude);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Location_Position#altitude() altitude} attribute.
   * @param value The value for altitude
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLocation_Position withAltitude(Decimal value) {
    @Nullable Decimal newValue = Objects.requireNonNull(value, "altitude");
    if (this.altitude == newValue) return this;
    return new ImmutableLocation_Position(this.id, this.longitude, newValue, this.modifierExtension, this.extension, this.latitude);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Location_Position#altitude() altitude} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for altitude
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableLocation_Position withAltitude(Optional<? extends Decimal> optional) {
    @Nullable Decimal value = optional.orElse(null);
    if (this.altitude == value) return this;
    return new ImmutableLocation_Position(this.id, this.longitude, value, this.modifierExtension, this.extension, this.latitude);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Location_Position#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLocation_Position withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableLocation_Position(this.id, this.longitude, this.altitude, newValue, this.extension, this.latitude);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Location_Position#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableLocation_Position withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableLocation_Position(this.id, this.longitude, this.altitude, value, this.extension, this.latitude);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Location_Position#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLocation_Position withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableLocation_Position(this.id, this.longitude, this.altitude, this.modifierExtension, newValue, this.latitude);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Location_Position#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableLocation_Position withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableLocation_Position(this.id, this.longitude, this.altitude, this.modifierExtension, value, this.latitude);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Location_Position#latitude() latitude} attribute.
   * @param value The value for latitude
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLocation_Position withLatitude(Decimal value) {
    @Nullable Decimal newValue = Objects.requireNonNull(value, "latitude");
    if (this.latitude == newValue) return this;
    return new ImmutableLocation_Position(this.id, this.longitude, this.altitude, this.modifierExtension, this.extension, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Location_Position#latitude() latitude} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for latitude
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableLocation_Position withLatitude(Optional<? extends Decimal> optional) {
    @Nullable Decimal value = optional.orElse(null);
    if (this.latitude == value) return this;
    return new ImmutableLocation_Position(this.id, this.longitude, this.altitude, this.modifierExtension, this.extension, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableLocation_Position} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableLocation_Position
        && equalTo((ImmutableLocation_Position) another);
  }

  private boolean equalTo(ImmutableLocation_Position another) {
    return Objects.equals(id, another.id)
        && Objects.equals(longitude, another.longitude)
        && Objects.equals(altitude, another.altitude)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(extension, another.extension)
        && Objects.equals(latitude, another.latitude);
  }

  /**
   * Computes a hash code from attributes: {@code id}, {@code longitude}, {@code altitude}, {@code modifierExtension}, {@code extension}, {@code latitude}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(longitude);
    h += (h << 5) + Objects.hashCode(altitude);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(latitude);
    return h;
  }

  /**
   * Prints the immutable value {@code Location_Position} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Location_Position{");
    if (id != null) {
      builder.append("id=").append(id);
    }
    if (longitude != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("longitude=").append(longitude);
    }
    if (altitude != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("altitude=").append(altitude);
    }
    if (modifierExtension != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (extension != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (latitude != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("latitude=").append(latitude);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "Location_Position", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Location_Position {
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<Decimal> longitude = Optional.empty();
    boolean longitudeIsSet;
    @Nullable Optional<Decimal> altitude = Optional.empty();
    boolean altitudeIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<Decimal> latitude = Optional.empty();
    boolean latitudeIsSet;
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("longitude")
    public void setLongitude(Optional<Decimal> longitude) {
      this.longitude = longitude;
      this.longitudeIsSet = true;
    }
    @JsonProperty("altitude")
    public void setAltitude(Optional<Decimal> altitude) {
      this.altitude = altitude;
      this.altitudeIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("latitude")
    public void setLatitude(Optional<Decimal> latitude) {
      this.latitude = latitude;
      this.latitudeIsSet = true;
    }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Decimal> longitude() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Decimal> altitude() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Decimal> latitude() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableLocation_Position fromJson(Json json) {
    ImmutableLocation_Position.Builder builder = ImmutableLocation_Position.builder();
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.longitudeIsSet) {
      builder.longitude(json.longitude);
    }
    if (json.altitudeIsSet) {
      builder.altitude(json.altitude);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.latitudeIsSet) {
      builder.latitude(json.latitude);
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
        .id(instance.id())
        .longitude(instance.longitude())
        .altitude(instance.altitude())
        .modifierExtension(instance.modifierExtension())
        .extension(instance.extension())
        .latitude(instance.latitude())
        .build();
  }

  /**
   * Creates a builder for {@link Location_Position Location_Position}.
   * <pre>
   * ImmutableLocation_Position.builder()
   *    .id(String) // optional {@link Location_Position#id() id}
   *    .longitude(com.medplum.types.fhir.Decimal) // optional {@link Location_Position#longitude() longitude}
   *    .altitude(com.medplum.types.fhir.Decimal) // optional {@link Location_Position#altitude() altitude}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link Location_Position#modifierExtension() modifierExtension}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link Location_Position#extension() extension}
   *    .latitude(com.medplum.types.fhir.Decimal) // optional {@link Location_Position#latitude() latitude}
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
  @Generated(from = "Location_Position", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_ID = 0x1L;
    private static final long OPT_BIT_LONGITUDE = 0x2L;
    private static final long OPT_BIT_ALTITUDE = 0x4L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x8L;
    private static final long OPT_BIT_EXTENSION = 0x10L;
    private static final long OPT_BIT_LATITUDE = 0x20L;
    private long optBits;

    private @Nullable String id;
    private @Nullable Decimal longitude;
    private @Nullable Decimal altitude;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable List<Extension> extension;
    private @Nullable Decimal latitude;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Location_Position#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(String id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = Objects.requireNonNull(id, "id");
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link Location_Position#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("id")
    public final Builder id(Optional<String> id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = id.orElse(null);
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link Location_Position#longitude() longitude} to longitude.
     * @param longitude The value for longitude
     * @return {@code this} builder for chained invocation
     */
    public final Builder longitude(Decimal longitude) {
      checkNotIsSet(longitudeIsSet(), "longitude");
      this.longitude = Objects.requireNonNull(longitude, "longitude");
      optBits |= OPT_BIT_LONGITUDE;
      return this;
    }

    /**
     * Initializes the optional value {@link Location_Position#longitude() longitude} to longitude.
     * @param longitude The value for longitude
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("longitude")
    public final Builder longitude(Optional<? extends Decimal> longitude) {
      checkNotIsSet(longitudeIsSet(), "longitude");
      this.longitude = longitude.orElse(null);
      optBits |= OPT_BIT_LONGITUDE;
      return this;
    }

    /**
     * Initializes the optional value {@link Location_Position#altitude() altitude} to altitude.
     * @param altitude The value for altitude
     * @return {@code this} builder for chained invocation
     */
    public final Builder altitude(Decimal altitude) {
      checkNotIsSet(altitudeIsSet(), "altitude");
      this.altitude = Objects.requireNonNull(altitude, "altitude");
      optBits |= OPT_BIT_ALTITUDE;
      return this;
    }

    /**
     * Initializes the optional value {@link Location_Position#altitude() altitude} to altitude.
     * @param altitude The value for altitude
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("altitude")
    public final Builder altitude(Optional<? extends Decimal> altitude) {
      checkNotIsSet(altitudeIsSet(), "altitude");
      this.altitude = altitude.orElse(null);
      optBits |= OPT_BIT_ALTITUDE;
      return this;
    }

    /**
     * Initializes the optional value {@link Location_Position#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    public final Builder modifierExtension(List<Extension> modifierExtension) {
      checkNotIsSet(modifierExtensionIsSet(), "modifierExtension");
      this.modifierExtension = Objects.requireNonNull(modifierExtension, "modifierExtension");
      optBits |= OPT_BIT_MODIFIER_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link Location_Position#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("modifierExtension")
    public final Builder modifierExtension(Optional<? extends List<Extension>> modifierExtension) {
      checkNotIsSet(modifierExtensionIsSet(), "modifierExtension");
      this.modifierExtension = modifierExtension.orElse(null);
      optBits |= OPT_BIT_MODIFIER_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link Location_Position#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    public final Builder extension(List<Extension> extension) {
      checkNotIsSet(extensionIsSet(), "extension");
      this.extension = Objects.requireNonNull(extension, "extension");
      optBits |= OPT_BIT_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link Location_Position#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("extension")
    public final Builder extension(Optional<? extends List<Extension>> extension) {
      checkNotIsSet(extensionIsSet(), "extension");
      this.extension = extension.orElse(null);
      optBits |= OPT_BIT_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link Location_Position#latitude() latitude} to latitude.
     * @param latitude The value for latitude
     * @return {@code this} builder for chained invocation
     */
    public final Builder latitude(Decimal latitude) {
      checkNotIsSet(latitudeIsSet(), "latitude");
      this.latitude = Objects.requireNonNull(latitude, "latitude");
      optBits |= OPT_BIT_LATITUDE;
      return this;
    }

    /**
     * Initializes the optional value {@link Location_Position#latitude() latitude} to latitude.
     * @param latitude The value for latitude
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("latitude")
    public final Builder latitude(Optional<? extends Decimal> latitude) {
      checkNotIsSet(latitudeIsSet(), "latitude");
      this.latitude = latitude.orElse(null);
      optBits |= OPT_BIT_LATITUDE;
      return this;
    }

    /**
     * Builds a new {@link Location_Position Location_Position}.
     * @return An immutable instance of Location_Position
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Location_Position build() {
      return new ImmutableLocation_Position(id, longitude, altitude, modifierExtension, extension, latitude);
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean longitudeIsSet() {
      return (optBits & OPT_BIT_LONGITUDE) != 0;
    }

    private boolean altitudeIsSet() {
      return (optBits & OPT_BIT_ALTITUDE) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean latitudeIsSet() {
      return (optBits & OPT_BIT_LATITUDE) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Location_Position is strict, attribute is already set: ".concat(name));
    }
  }
}
