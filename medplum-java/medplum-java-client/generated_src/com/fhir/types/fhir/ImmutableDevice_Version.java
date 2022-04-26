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
 * Immutable implementation of {@link Device_Version}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableDevice_Version.builder()}.
 */
@Generated(from = "Device_Version", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableDevice_Version implements Device_Version {
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable CodeableConcept type;
  private final @Nullable List<Extension> extension;
  private final @Nullable Identifier component;
  private final @Nullable String value;
  private final @Nullable String id;

  private ImmutableDevice_Version(
      @Nullable List<Extension> modifierExtension,
      @Nullable CodeableConcept type,
      @Nullable List<Extension> extension,
      @Nullable Identifier component,
      @Nullable String value,
      @Nullable String id) {
    this.modifierExtension = modifierExtension;
    this.type = type;
    this.extension = extension;
    this.component = component;
    this.value = value;
    this.id = id;
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
   * @return The value of the {@code type} attribute
   */
  @JsonProperty("type")
  @Override
  public Optional<CodeableConcept> type() {
    return Optional.ofNullable(type);
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
   * @return The value of the {@code component} attribute
   */
  @JsonProperty("component")
  @Override
  public Optional<Identifier> component() {
    return Optional.ofNullable(component);
  }

  /**
   * @return The value of the {@code value} attribute
   */
  @JsonProperty("value")
  @Override
  public Optional<String> value() {
    return Optional.ofNullable(value);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Device_Version#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDevice_Version withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableDevice_Version(newValue, this.type, this.extension, this.component, this.value, this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Device_Version#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDevice_Version withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableDevice_Version(value, this.type, this.extension, this.component, this.value, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Device_Version#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDevice_Version withType(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableDevice_Version(this.modifierExtension, newValue, this.extension, this.component, this.value, this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Device_Version#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDevice_Version withType(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableDevice_Version(this.modifierExtension, value, this.extension, this.component, this.value, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Device_Version#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDevice_Version withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableDevice_Version(this.modifierExtension, this.type, newValue, this.component, this.value, this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Device_Version#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDevice_Version withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableDevice_Version(this.modifierExtension, this.type, value, this.component, this.value, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Device_Version#component() component} attribute.
   * @param value The value for component
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDevice_Version withComponent(Identifier value) {
    @Nullable Identifier newValue = Objects.requireNonNull(value, "component");
    if (this.component == newValue) return this;
    return new ImmutableDevice_Version(this.modifierExtension, this.type, this.extension, newValue, this.value, this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Device_Version#component() component} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for component
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDevice_Version withComponent(Optional<? extends Identifier> optional) {
    @Nullable Identifier value = optional.orElse(null);
    if (this.component == value) return this;
    return new ImmutableDevice_Version(this.modifierExtension, this.type, this.extension, value, this.value, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Device_Version#value() value} attribute.
   * @param value The value for value
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDevice_Version withValue(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "value");
    if (Objects.equals(this.value, newValue)) return this;
    return new ImmutableDevice_Version(this.modifierExtension, this.type, this.extension, this.component, newValue, this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Device_Version#value() value} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for value
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDevice_Version withValue(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.value, value)) return this;
    return new ImmutableDevice_Version(this.modifierExtension, this.type, this.extension, this.component, value, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Device_Version#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDevice_Version withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableDevice_Version(this.modifierExtension, this.type, this.extension, this.component, this.value, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Device_Version#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDevice_Version withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableDevice_Version(this.modifierExtension, this.type, this.extension, this.component, this.value, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableDevice_Version} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableDevice_Version
        && equalTo((ImmutableDevice_Version) another);
  }

  private boolean equalTo(ImmutableDevice_Version another) {
    return Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(type, another.type)
        && Objects.equals(extension, another.extension)
        && Objects.equals(component, another.component)
        && Objects.equals(value, another.value)
        && Objects.equals(id, another.id);
  }

  /**
   * Computes a hash code from attributes: {@code modifierExtension}, {@code type}, {@code extension}, {@code component}, {@code value}, {@code id}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(type);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(component);
    h += (h << 5) + Objects.hashCode(value);
    h += (h << 5) + Objects.hashCode(id);
    return h;
  }

  /**
   * Prints the immutable value {@code Device_Version} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Device_Version{");
    if (modifierExtension != null) {
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (type != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("type=").append(type);
    }
    if (extension != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (component != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("component=").append(component);
    }
    if (value != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("value=").append(value);
    }
    if (id != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("id=").append(id);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "Device_Version", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Device_Version {
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<CodeableConcept> type = Optional.empty();
    boolean typeIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<Identifier> component = Optional.empty();
    boolean componentIsSet;
    @Nullable Optional<String> value = Optional.empty();
    boolean valueIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("type")
    public void setType(Optional<CodeableConcept> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("component")
    public void setComponent(Optional<Identifier> component) {
      this.component = component;
      this.componentIsSet = true;
    }
    @JsonProperty("value")
    public void setValue(Optional<String> value) {
      this.value = value;
      this.valueIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> type() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Identifier> component() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> value() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableDevice_Version fromJson(Json json) {
    ImmutableDevice_Version.Builder builder = ImmutableDevice_Version.builder();
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.componentIsSet) {
      builder.component(json.component);
    }
    if (json.valueIsSet) {
      builder.value(json.value);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    return (ImmutableDevice_Version) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Device_Version} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Device_Version instance
   */
  public static Device_Version copyOf(Device_Version instance) {
    if (instance instanceof ImmutableDevice_Version) {
      return (ImmutableDevice_Version) instance;
    }
    return ImmutableDevice_Version.builder()
        .modifierExtension(instance.modifierExtension())
        .type(instance.type())
        .extension(instance.extension())
        .component(instance.component())
        .value(instance.value())
        .id(instance.id())
        .build();
  }

  /**
   * Creates a builder for {@link Device_Version Device_Version}.
   * <pre>
   * ImmutableDevice_Version.builder()
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link Device_Version#modifierExtension() modifierExtension}
   *    .type(com.fhir.types.fhir.CodeableConcept) // optional {@link Device_Version#type() type}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link Device_Version#extension() extension}
   *    .component(com.fhir.types.fhir.Identifier) // optional {@link Device_Version#component() component}
   *    .value(String) // optional {@link Device_Version#value() value}
   *    .id(String) // optional {@link Device_Version#id() id}
   *    .build();
   * </pre>
   * @return A new Device_Version builder
   */
  public static ImmutableDevice_Version.Builder builder() {
    return new ImmutableDevice_Version.Builder();
  }

  /**
   * Builds instances of type {@link Device_Version Device_Version}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Device_Version", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x1L;
    private static final long OPT_BIT_TYPE = 0x2L;
    private static final long OPT_BIT_EXTENSION = 0x4L;
    private static final long OPT_BIT_COMPONENT = 0x8L;
    private static final long OPT_BIT_VALUE = 0x10L;
    private static final long OPT_BIT_ID = 0x20L;
    private long optBits;

    private @Nullable List<Extension> modifierExtension;
    private @Nullable CodeableConcept type;
    private @Nullable List<Extension> extension;
    private @Nullable Identifier component;
    private @Nullable String value;
    private @Nullable String id;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Device_Version#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Device_Version#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Device_Version#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    public final Builder type(CodeableConcept type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = Objects.requireNonNull(type, "type");
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Device_Version#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("type")
    public final Builder type(Optional<? extends CodeableConcept> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = type.orElse(null);
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Device_Version#extension() extension} to extension.
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
     * Initializes the optional value {@link Device_Version#extension() extension} to extension.
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
     * Initializes the optional value {@link Device_Version#component() component} to component.
     * @param component The value for component
     * @return {@code this} builder for chained invocation
     */
    public final Builder component(Identifier component) {
      checkNotIsSet(componentIsSet(), "component");
      this.component = Objects.requireNonNull(component, "component");
      optBits |= OPT_BIT_COMPONENT;
      return this;
    }

    /**
     * Initializes the optional value {@link Device_Version#component() component} to component.
     * @param component The value for component
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("component")
    public final Builder component(Optional<? extends Identifier> component) {
      checkNotIsSet(componentIsSet(), "component");
      this.component = component.orElse(null);
      optBits |= OPT_BIT_COMPONENT;
      return this;
    }

    /**
     * Initializes the optional value {@link Device_Version#value() value} to value.
     * @param value The value for value
     * @return {@code this} builder for chained invocation
     */
    public final Builder value(String value) {
      checkNotIsSet(valueIsSet(), "value");
      this.value = Objects.requireNonNull(value, "value");
      optBits |= OPT_BIT_VALUE;
      return this;
    }

    /**
     * Initializes the optional value {@link Device_Version#value() value} to value.
     * @param value The value for value
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("value")
    public final Builder value(Optional<String> value) {
      checkNotIsSet(valueIsSet(), "value");
      this.value = value.orElse(null);
      optBits |= OPT_BIT_VALUE;
      return this;
    }

    /**
     * Initializes the optional value {@link Device_Version#id() id} to id.
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
     * Initializes the optional value {@link Device_Version#id() id} to id.
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
     * Builds a new {@link Device_Version Device_Version}.
     * @return An immutable instance of Device_Version
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Device_Version build() {
      return new ImmutableDevice_Version(modifierExtension, type, extension, component, value, id);
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean componentIsSet() {
      return (optBits & OPT_BIT_COMPONENT) != 0;
    }

    private boolean valueIsSet() {
      return (optBits & OPT_BIT_VALUE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Device_Version is strict, attribute is already set: ".concat(name));
    }
  }
}
