package com.fhir.types.fhir;

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
 * Immutable implementation of {@link CapabilityStatement_Software}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableCapabilityStatement_Software.builder()}.
 */
@Generated(from = "CapabilityStatement_Software", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableCapabilityStatement_Software
    implements CapabilityStatement_Software {
  private final @Nullable String name;
  private final @Nullable DateTime releaseDate;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable List<Extension> extension;
  private final @Nullable String id;
  private final @Nullable String version;

  private ImmutableCapabilityStatement_Software(
      @Nullable String name,
      @Nullable DateTime releaseDate,
      @Nullable List<Extension> modifierExtension,
      @Nullable List<Extension> extension,
      @Nullable String id,
      @Nullable String version) {
    this.name = name;
    this.releaseDate = releaseDate;
    this.modifierExtension = modifierExtension;
    this.extension = extension;
    this.id = id;
    this.version = version;
  }

  /**
   * @return The value of the {@code name} attribute
   */
  @JsonProperty("name")
  @Override
  public Optional<String> name() {
    return Optional.ofNullable(name);
  }

  /**
   * @return The value of the {@code releaseDate} attribute
   */
  @JsonProperty("releaseDate")
  @Override
  public Optional<DateTime> releaseDate() {
    return Optional.ofNullable(releaseDate);
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
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<String> id() {
    return Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code version} attribute
   */
  @JsonProperty("version")
  @Override
  public Optional<String> version() {
    return Optional.ofNullable(version);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CapabilityStatement_Software#name() name} attribute.
   * @param value The value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement_Software withName(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "name");
    if (Objects.equals(this.name, newValue)) return this;
    return new ImmutableCapabilityStatement_Software(newValue, this.releaseDate, this.modifierExtension, this.extension, this.id, this.version);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CapabilityStatement_Software#name() name} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement_Software withName(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.name, value)) return this;
    return new ImmutableCapabilityStatement_Software(value, this.releaseDate, this.modifierExtension, this.extension, this.id, this.version);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CapabilityStatement_Software#releaseDate() releaseDate} attribute.
   * @param value The value for releaseDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement_Software withReleaseDate(DateTime value) {
    @Nullable DateTime newValue = Objects.requireNonNull(value, "releaseDate");
    if (this.releaseDate == newValue) return this;
    return new ImmutableCapabilityStatement_Software(this.name, newValue, this.modifierExtension, this.extension, this.id, this.version);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CapabilityStatement_Software#releaseDate() releaseDate} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for releaseDate
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCapabilityStatement_Software withReleaseDate(Optional<? extends DateTime> optional) {
    @Nullable DateTime value = optional.orElse(null);
    if (this.releaseDate == value) return this;
    return new ImmutableCapabilityStatement_Software(this.name, value, this.modifierExtension, this.extension, this.id, this.version);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CapabilityStatement_Software#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement_Software withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableCapabilityStatement_Software(this.name, this.releaseDate, newValue, this.extension, this.id, this.version);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CapabilityStatement_Software#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCapabilityStatement_Software withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableCapabilityStatement_Software(this.name, this.releaseDate, value, this.extension, this.id, this.version);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CapabilityStatement_Software#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement_Software withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableCapabilityStatement_Software(this.name, this.releaseDate, this.modifierExtension, newValue, this.id, this.version);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CapabilityStatement_Software#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCapabilityStatement_Software withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableCapabilityStatement_Software(this.name, this.releaseDate, this.modifierExtension, value, this.id, this.version);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CapabilityStatement_Software#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement_Software withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableCapabilityStatement_Software(this.name, this.releaseDate, this.modifierExtension, this.extension, newValue, this.version);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CapabilityStatement_Software#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement_Software withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableCapabilityStatement_Software(this.name, this.releaseDate, this.modifierExtension, this.extension, value, this.version);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CapabilityStatement_Software#version() version} attribute.
   * @param value The value for version
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement_Software withVersion(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "version");
    if (Objects.equals(this.version, newValue)) return this;
    return new ImmutableCapabilityStatement_Software(this.name, this.releaseDate, this.modifierExtension, this.extension, this.id, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CapabilityStatement_Software#version() version} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for version
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement_Software withVersion(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.version, value)) return this;
    return new ImmutableCapabilityStatement_Software(this.name, this.releaseDate, this.modifierExtension, this.extension, this.id, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableCapabilityStatement_Software} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableCapabilityStatement_Software
        && equalTo((ImmutableCapabilityStatement_Software) another);
  }

  private boolean equalTo(ImmutableCapabilityStatement_Software another) {
    return Objects.equals(name, another.name)
        && Objects.equals(releaseDate, another.releaseDate)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(extension, another.extension)
        && Objects.equals(id, another.id)
        && Objects.equals(version, another.version);
  }

  /**
   * Computes a hash code from attributes: {@code name}, {@code releaseDate}, {@code modifierExtension}, {@code extension}, {@code id}, {@code version}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(name);
    h += (h << 5) + Objects.hashCode(releaseDate);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(version);
    return h;
  }

  /**
   * Prints the immutable value {@code CapabilityStatement_Software} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("CapabilityStatement_Software{");
    if (name != null) {
      builder.append("name=").append(name);
    }
    if (releaseDate != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("releaseDate=").append(releaseDate);
    }
    if (modifierExtension != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (extension != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (id != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (version != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("version=").append(version);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "CapabilityStatement_Software", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements CapabilityStatement_Software {
    @Nullable Optional<String> name = Optional.empty();
    boolean nameIsSet;
    @Nullable Optional<DateTime> releaseDate = Optional.empty();
    boolean releaseDateIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<String> version = Optional.empty();
    boolean versionIsSet;
    @JsonProperty("name")
    public void setName(Optional<String> name) {
      this.name = name;
      this.nameIsSet = true;
    }
    @JsonProperty("releaseDate")
    public void setReleaseDate(Optional<DateTime> releaseDate) {
      this.releaseDate = releaseDate;
      this.releaseDateIsSet = true;
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
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("version")
    public void setVersion(Optional<String> version) {
      this.version = version;
      this.versionIsSet = true;
    }
    @Override
    public Optional<String> name() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<DateTime> releaseDate() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> version() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableCapabilityStatement_Software fromJson(Json json) {
    ImmutableCapabilityStatement_Software.Builder builder = ImmutableCapabilityStatement_Software.builder();
    if (json.nameIsSet) {
      builder.name(json.name);
    }
    if (json.releaseDateIsSet) {
      builder.releaseDate(json.releaseDate);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.versionIsSet) {
      builder.version(json.version);
    }
    return (ImmutableCapabilityStatement_Software) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link CapabilityStatement_Software} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable CapabilityStatement_Software instance
   */
  public static CapabilityStatement_Software copyOf(CapabilityStatement_Software instance) {
    if (instance instanceof ImmutableCapabilityStatement_Software) {
      return (ImmutableCapabilityStatement_Software) instance;
    }
    return ImmutableCapabilityStatement_Software.builder()
        .name(instance.name())
        .releaseDate(instance.releaseDate())
        .modifierExtension(instance.modifierExtension())
        .extension(instance.extension())
        .id(instance.id())
        .version(instance.version())
        .build();
  }

  /**
   * Creates a builder for {@link CapabilityStatement_Software CapabilityStatement_Software}.
   * <pre>
   * ImmutableCapabilityStatement_Software.builder()
   *    .name(String) // optional {@link CapabilityStatement_Software#name() name}
   *    .releaseDate(com.fhir.types.fhir.DateTime) // optional {@link CapabilityStatement_Software#releaseDate() releaseDate}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link CapabilityStatement_Software#modifierExtension() modifierExtension}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link CapabilityStatement_Software#extension() extension}
   *    .id(String) // optional {@link CapabilityStatement_Software#id() id}
   *    .version(String) // optional {@link CapabilityStatement_Software#version() version}
   *    .build();
   * </pre>
   * @return A new CapabilityStatement_Software builder
   */
  public static ImmutableCapabilityStatement_Software.Builder builder() {
    return new ImmutableCapabilityStatement_Software.Builder();
  }

  /**
   * Builds instances of type {@link CapabilityStatement_Software CapabilityStatement_Software}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "CapabilityStatement_Software", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_NAME = 0x1L;
    private static final long OPT_BIT_RELEASE_DATE = 0x2L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x4L;
    private static final long OPT_BIT_EXTENSION = 0x8L;
    private static final long OPT_BIT_ID = 0x10L;
    private static final long OPT_BIT_VERSION = 0x20L;
    private long optBits;

    private @Nullable String name;
    private @Nullable DateTime releaseDate;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable List<Extension> extension;
    private @Nullable String id;
    private @Nullable String version;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link CapabilityStatement_Software#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for chained invocation
     */
    public final Builder name(String name) {
      checkNotIsSet(nameIsSet(), "name");
      this.name = Objects.requireNonNull(name, "name");
      optBits |= OPT_BIT_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement_Software#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("name")
    public final Builder name(Optional<String> name) {
      checkNotIsSet(nameIsSet(), "name");
      this.name = name.orElse(null);
      optBits |= OPT_BIT_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement_Software#releaseDate() releaseDate} to releaseDate.
     * @param releaseDate The value for releaseDate
     * @return {@code this} builder for chained invocation
     */
    public final Builder releaseDate(DateTime releaseDate) {
      checkNotIsSet(releaseDateIsSet(), "releaseDate");
      this.releaseDate = Objects.requireNonNull(releaseDate, "releaseDate");
      optBits |= OPT_BIT_RELEASE_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement_Software#releaseDate() releaseDate} to releaseDate.
     * @param releaseDate The value for releaseDate
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("releaseDate")
    public final Builder releaseDate(Optional<? extends DateTime> releaseDate) {
      checkNotIsSet(releaseDateIsSet(), "releaseDate");
      this.releaseDate = releaseDate.orElse(null);
      optBits |= OPT_BIT_RELEASE_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement_Software#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link CapabilityStatement_Software#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link CapabilityStatement_Software#extension() extension} to extension.
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
     * Initializes the optional value {@link CapabilityStatement_Software#extension() extension} to extension.
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
     * Initializes the optional value {@link CapabilityStatement_Software#id() id} to id.
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
     * Initializes the optional value {@link CapabilityStatement_Software#id() id} to id.
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
     * Initializes the optional value {@link CapabilityStatement_Software#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for chained invocation
     */
    public final Builder version(String version) {
      checkNotIsSet(versionIsSet(), "version");
      this.version = Objects.requireNonNull(version, "version");
      optBits |= OPT_BIT_VERSION;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement_Software#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("version")
    public final Builder version(Optional<String> version) {
      checkNotIsSet(versionIsSet(), "version");
      this.version = version.orElse(null);
      optBits |= OPT_BIT_VERSION;
      return this;
    }

    /**
     * Builds a new {@link CapabilityStatement_Software CapabilityStatement_Software}.
     * @return An immutable instance of CapabilityStatement_Software
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public CapabilityStatement_Software build() {
      return new ImmutableCapabilityStatement_Software(name, releaseDate, modifierExtension, extension, id, version);
    }

    private boolean nameIsSet() {
      return (optBits & OPT_BIT_NAME) != 0;
    }

    private boolean releaseDateIsSet() {
      return (optBits & OPT_BIT_RELEASE_DATE) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean versionIsSet() {
      return (optBits & OPT_BIT_VERSION) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of CapabilityStatement_Software is strict, attribute is already set: ".concat(name));
    }
  }
}
