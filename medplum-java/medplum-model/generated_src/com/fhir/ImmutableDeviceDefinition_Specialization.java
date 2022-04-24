package com.fhir;

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
 * Immutable implementation of {@link DeviceDefinition_Specialization}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableDeviceDefinition_Specialization.builder()}.
 */
@Generated(from = "DeviceDefinition_Specialization", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableDeviceDefinition_Specialization
    implements DeviceDefinition_Specialization {
  private final @Nullable String systemType;
  private final @Nullable String version;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable String id;
  private final @Nullable List<Extension> extension;

  private ImmutableDeviceDefinition_Specialization(
      @Nullable String systemType,
      @Nullable String version,
      @Nullable List<Extension> modifierExtension,
      @Nullable String id,
      @Nullable List<Extension> extension) {
    this.systemType = systemType;
    this.version = version;
    this.modifierExtension = modifierExtension;
    this.id = id;
    this.extension = extension;
  }

  /**
   * @return The value of the {@code systemType} attribute
   */
  @JsonProperty("systemType")
  @Override
  public Optional<String> systemType() {
    return Optional.ofNullable(systemType);
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @JsonProperty("modifierExtension")
  @Override
  public Optional<List<Extension>> modifierExtension() {
    return Optional.ofNullable(modifierExtension);
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
   * @return The value of the {@code extension} attribute
   */
  @JsonProperty("extension")
  @Override
  public Optional<List<Extension>> extension() {
    return Optional.ofNullable(extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceDefinition_Specialization#systemType() systemType} attribute.
   * @param value The value for systemType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceDefinition_Specialization withSystemType(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "systemType");
    if (Objects.equals(this.systemType, newValue)) return this;
    return new ImmutableDeviceDefinition_Specialization(newValue, this.version, this.modifierExtension, this.id, this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceDefinition_Specialization#systemType() systemType} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for systemType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceDefinition_Specialization withSystemType(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.systemType, value)) return this;
    return new ImmutableDeviceDefinition_Specialization(value, this.version, this.modifierExtension, this.id, this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceDefinition_Specialization#version() version} attribute.
   * @param value The value for version
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceDefinition_Specialization withVersion(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "version");
    if (Objects.equals(this.version, newValue)) return this;
    return new ImmutableDeviceDefinition_Specialization(this.systemType, newValue, this.modifierExtension, this.id, this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceDefinition_Specialization#version() version} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for version
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceDefinition_Specialization withVersion(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.version, value)) return this;
    return new ImmutableDeviceDefinition_Specialization(this.systemType, value, this.modifierExtension, this.id, this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceDefinition_Specialization#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceDefinition_Specialization withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableDeviceDefinition_Specialization(this.systemType, this.version, newValue, this.id, this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceDefinition_Specialization#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceDefinition_Specialization withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableDeviceDefinition_Specialization(this.systemType, this.version, value, this.id, this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceDefinition_Specialization#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceDefinition_Specialization withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableDeviceDefinition_Specialization(this.systemType, this.version, this.modifierExtension, newValue, this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceDefinition_Specialization#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceDefinition_Specialization withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableDeviceDefinition_Specialization(this.systemType, this.version, this.modifierExtension, value, this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceDefinition_Specialization#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceDefinition_Specialization withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableDeviceDefinition_Specialization(this.systemType, this.version, this.modifierExtension, this.id, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceDefinition_Specialization#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceDefinition_Specialization withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableDeviceDefinition_Specialization(this.systemType, this.version, this.modifierExtension, this.id, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableDeviceDefinition_Specialization} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableDeviceDefinition_Specialization
        && equalTo((ImmutableDeviceDefinition_Specialization) another);
  }

  private boolean equalTo(ImmutableDeviceDefinition_Specialization another) {
    return Objects.equals(systemType, another.systemType)
        && Objects.equals(version, another.version)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(id, another.id)
        && Objects.equals(extension, another.extension);
  }

  /**
   * Computes a hash code from attributes: {@code systemType}, {@code version}, {@code modifierExtension}, {@code id}, {@code extension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(systemType);
    h += (h << 5) + Objects.hashCode(version);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(extension);
    return h;
  }

  /**
   * Prints the immutable value {@code DeviceDefinition_Specialization} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("DeviceDefinition_Specialization{");
    if (systemType != null) {
      builder.append("systemType=").append(systemType);
    }
    if (version != null) {
      if (builder.length() > 32) builder.append(", ");
      builder.append("version=").append(version);
    }
    if (modifierExtension != null) {
      if (builder.length() > 32) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (id != null) {
      if (builder.length() > 32) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (extension != null) {
      if (builder.length() > 32) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "DeviceDefinition_Specialization", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements DeviceDefinition_Specialization {
    @Nullable Optional<String> systemType = Optional.empty();
    boolean systemTypeIsSet;
    @Nullable Optional<String> version = Optional.empty();
    boolean versionIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @JsonProperty("systemType")
    public void setSystemType(Optional<String> systemType) {
      this.systemType = systemType;
      this.systemTypeIsSet = true;
    }
    @JsonProperty("version")
    public void setVersion(Optional<String> version) {
      this.version = version;
      this.versionIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @Override
    public Optional<String> systemType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> version() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableDeviceDefinition_Specialization fromJson(Json json) {
    ImmutableDeviceDefinition_Specialization.Builder builder = ImmutableDeviceDefinition_Specialization.builder();
    if (json.systemTypeIsSet) {
      builder.systemType(json.systemType);
    }
    if (json.versionIsSet) {
      builder.version(json.version);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    return (ImmutableDeviceDefinition_Specialization) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link DeviceDefinition_Specialization} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable DeviceDefinition_Specialization instance
   */
  public static DeviceDefinition_Specialization copyOf(DeviceDefinition_Specialization instance) {
    if (instance instanceof ImmutableDeviceDefinition_Specialization) {
      return (ImmutableDeviceDefinition_Specialization) instance;
    }
    return ImmutableDeviceDefinition_Specialization.builder()
        .systemType(instance.systemType())
        .version(instance.version())
        .modifierExtension(instance.modifierExtension())
        .id(instance.id())
        .extension(instance.extension())
        .build();
  }

  /**
   * Creates a builder for {@link DeviceDefinition_Specialization DeviceDefinition_Specialization}.
   * <pre>
   * ImmutableDeviceDefinition_Specialization.builder()
   *    .systemType(String) // optional {@link DeviceDefinition_Specialization#systemType() systemType}
   *    .version(String) // optional {@link DeviceDefinition_Specialization#version() version}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link DeviceDefinition_Specialization#modifierExtension() modifierExtension}
   *    .id(String) // optional {@link DeviceDefinition_Specialization#id() id}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link DeviceDefinition_Specialization#extension() extension}
   *    .build();
   * </pre>
   * @return A new DeviceDefinition_Specialization builder
   */
  public static ImmutableDeviceDefinition_Specialization.Builder builder() {
    return new ImmutableDeviceDefinition_Specialization.Builder();
  }

  /**
   * Builds instances of type {@link DeviceDefinition_Specialization DeviceDefinition_Specialization}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "DeviceDefinition_Specialization", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_SYSTEM_TYPE = 0x1L;
    private static final long OPT_BIT_VERSION = 0x2L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x4L;
    private static final long OPT_BIT_ID = 0x8L;
    private static final long OPT_BIT_EXTENSION = 0x10L;
    private long optBits;

    private @Nullable String systemType;
    private @Nullable String version;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable String id;
    private @Nullable List<Extension> extension;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link DeviceDefinition_Specialization#systemType() systemType} to systemType.
     * @param systemType The value for systemType
     * @return {@code this} builder for chained invocation
     */
    public final Builder systemType(String systemType) {
      checkNotIsSet(systemTypeIsSet(), "systemType");
      this.systemType = Objects.requireNonNull(systemType, "systemType");
      optBits |= OPT_BIT_SYSTEM_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceDefinition_Specialization#systemType() systemType} to systemType.
     * @param systemType The value for systemType
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("systemType")
    public final Builder systemType(Optional<String> systemType) {
      checkNotIsSet(systemTypeIsSet(), "systemType");
      this.systemType = systemType.orElse(null);
      optBits |= OPT_BIT_SYSTEM_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceDefinition_Specialization#version() version} to version.
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
     * Initializes the optional value {@link DeviceDefinition_Specialization#version() version} to version.
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
     * Initializes the optional value {@link DeviceDefinition_Specialization#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link DeviceDefinition_Specialization#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link DeviceDefinition_Specialization#id() id} to id.
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
     * Initializes the optional value {@link DeviceDefinition_Specialization#id() id} to id.
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
     * Initializes the optional value {@link DeviceDefinition_Specialization#extension() extension} to extension.
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
     * Initializes the optional value {@link DeviceDefinition_Specialization#extension() extension} to extension.
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
     * Builds a new {@link DeviceDefinition_Specialization DeviceDefinition_Specialization}.
     * @return An immutable instance of DeviceDefinition_Specialization
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public DeviceDefinition_Specialization build() {
      return new ImmutableDeviceDefinition_Specialization(systemType, version, modifierExtension, id, extension);
    }

    private boolean systemTypeIsSet() {
      return (optBits & OPT_BIT_SYSTEM_TYPE) != 0;
    }

    private boolean versionIsSet() {
      return (optBits & OPT_BIT_VERSION) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of DeviceDefinition_Specialization is strict, attribute is already set: ".concat(name));
    }
  }
}
