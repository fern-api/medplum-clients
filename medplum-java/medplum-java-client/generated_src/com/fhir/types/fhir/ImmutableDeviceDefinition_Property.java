package com.fhir.types.fhir;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link DeviceDefinition_Property}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableDeviceDefinition_Property.builder()}.
 */
@Generated(from = "DeviceDefinition_Property", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableDeviceDefinition_Property implements DeviceDefinition_Property {
  private final CodeableConcept type;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable List<Quantity> valueQuantity;
  private final @Nullable List<CodeableConcept> valueCode;
  private final @Nullable String id;
  private final @Nullable List<Extension> extension;

  private ImmutableDeviceDefinition_Property(
      CodeableConcept type,
      @Nullable List<Extension> modifierExtension,
      @Nullable List<Quantity> valueQuantity,
      @Nullable List<CodeableConcept> valueCode,
      @Nullable String id,
      @Nullable List<Extension> extension) {
    this.type = type;
    this.modifierExtension = modifierExtension;
    this.valueQuantity = valueQuantity;
    this.valueCode = valueCode;
    this.id = id;
    this.extension = extension;
  }

  /**
   * @return The value of the {@code type} attribute
   */
  @JsonProperty("type")
  @Override
  public CodeableConcept type() {
    return type;
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
   * @return The value of the {@code valueQuantity} attribute
   */
  @JsonProperty("valueQuantity")
  @Override
  public Optional<List<Quantity>> valueQuantity() {
    return Optional.ofNullable(valueQuantity);
  }

  /**
   * @return The value of the {@code valueCode} attribute
   */
  @JsonProperty("valueCode")
  @Override
  public Optional<List<CodeableConcept>> valueCode() {
    return Optional.ofNullable(valueCode);
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
   * Copy the current immutable object by setting a value for the {@link DeviceDefinition_Property#type() type} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for type
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableDeviceDefinition_Property withType(CodeableConcept value) {
    if (this.type == value) return this;
    CodeableConcept newValue = Objects.requireNonNull(value, "type");
    return new ImmutableDeviceDefinition_Property(newValue, this.modifierExtension, this.valueQuantity, this.valueCode, this.id, this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceDefinition_Property#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceDefinition_Property withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableDeviceDefinition_Property(this.type, newValue, this.valueQuantity, this.valueCode, this.id, this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceDefinition_Property#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceDefinition_Property withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableDeviceDefinition_Property(this.type, value, this.valueQuantity, this.valueCode, this.id, this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceDefinition_Property#valueQuantity() valueQuantity} attribute.
   * @param value The value for valueQuantity
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceDefinition_Property withValueQuantity(List<Quantity> value) {
    @Nullable List<Quantity> newValue = Objects.requireNonNull(value, "valueQuantity");
    if (this.valueQuantity == newValue) return this;
    return new ImmutableDeviceDefinition_Property(this.type, this.modifierExtension, newValue, this.valueCode, this.id, this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceDefinition_Property#valueQuantity() valueQuantity} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueQuantity
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceDefinition_Property withValueQuantity(Optional<? extends List<Quantity>> optional) {
    @Nullable List<Quantity> value = optional.orElse(null);
    if (this.valueQuantity == value) return this;
    return new ImmutableDeviceDefinition_Property(this.type, this.modifierExtension, value, this.valueCode, this.id, this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceDefinition_Property#valueCode() valueCode} attribute.
   * @param value The value for valueCode
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceDefinition_Property withValueCode(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "valueCode");
    if (this.valueCode == newValue) return this;
    return new ImmutableDeviceDefinition_Property(this.type, this.modifierExtension, this.valueQuantity, newValue, this.id, this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceDefinition_Property#valueCode() valueCode} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueCode
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceDefinition_Property withValueCode(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.valueCode == value) return this;
    return new ImmutableDeviceDefinition_Property(this.type, this.modifierExtension, this.valueQuantity, value, this.id, this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceDefinition_Property#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceDefinition_Property withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableDeviceDefinition_Property(this.type, this.modifierExtension, this.valueQuantity, this.valueCode, newValue, this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceDefinition_Property#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceDefinition_Property withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableDeviceDefinition_Property(this.type, this.modifierExtension, this.valueQuantity, this.valueCode, value, this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceDefinition_Property#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceDefinition_Property withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableDeviceDefinition_Property(this.type, this.modifierExtension, this.valueQuantity, this.valueCode, this.id, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceDefinition_Property#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceDefinition_Property withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableDeviceDefinition_Property(this.type, this.modifierExtension, this.valueQuantity, this.valueCode, this.id, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableDeviceDefinition_Property} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableDeviceDefinition_Property
        && equalTo((ImmutableDeviceDefinition_Property) another);
  }

  private boolean equalTo(ImmutableDeviceDefinition_Property another) {
    return type.equals(another.type)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(valueQuantity, another.valueQuantity)
        && Objects.equals(valueCode, another.valueCode)
        && Objects.equals(id, another.id)
        && Objects.equals(extension, another.extension);
  }

  /**
   * Computes a hash code from attributes: {@code type}, {@code modifierExtension}, {@code valueQuantity}, {@code valueCode}, {@code id}, {@code extension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + type.hashCode();
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(valueQuantity);
    h += (h << 5) + Objects.hashCode(valueCode);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(extension);
    return h;
  }

  /**
   * Prints the immutable value {@code DeviceDefinition_Property} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("DeviceDefinition_Property{");
    builder.append("type=").append(type);
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (valueQuantity != null) {
      builder.append(", ");
      builder.append("valueQuantity=").append(valueQuantity);
    }
    if (valueCode != null) {
      builder.append(", ");
      builder.append("valueCode=").append(valueCode);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "DeviceDefinition_Property", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements DeviceDefinition_Property {
    @Nullable CodeableConcept type;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<List<Quantity>> valueQuantity = Optional.empty();
    boolean valueQuantityIsSet;
    @Nullable Optional<List<CodeableConcept>> valueCode = Optional.empty();
    boolean valueCodeIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @JsonProperty("type")
    public void setType(CodeableConcept type) {
      this.type = type;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("valueQuantity")
    public void setValueQuantity(Optional<List<Quantity>> valueQuantity) {
      this.valueQuantity = valueQuantity;
      this.valueQuantityIsSet = true;
    }
    @JsonProperty("valueCode")
    public void setValueCode(Optional<List<CodeableConcept>> valueCode) {
      this.valueCode = valueCode;
      this.valueCodeIsSet = true;
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
    public CodeableConcept type() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Quantity>> valueQuantity() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> valueCode() { throw new UnsupportedOperationException(); }
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
  static ImmutableDeviceDefinition_Property fromJson(Json json) {
    ImmutableDeviceDefinition_Property.Builder builder = ((ImmutableDeviceDefinition_Property.Builder) ImmutableDeviceDefinition_Property.builder());
    if (json.type != null) {
      builder.type(json.type);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.valueQuantityIsSet) {
      builder.valueQuantity(json.valueQuantity);
    }
    if (json.valueCodeIsSet) {
      builder.valueCode(json.valueCode);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    return (ImmutableDeviceDefinition_Property) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link DeviceDefinition_Property} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable DeviceDefinition_Property instance
   */
  public static DeviceDefinition_Property copyOf(DeviceDefinition_Property instance) {
    if (instance instanceof ImmutableDeviceDefinition_Property) {
      return (ImmutableDeviceDefinition_Property) instance;
    }
    return ((ImmutableDeviceDefinition_Property.Builder) ImmutableDeviceDefinition_Property.builder())
        .type(instance.type())
        .modifierExtension(instance.modifierExtension())
        .valueQuantity(instance.valueQuantity())
        .valueCode(instance.valueCode())
        .id(instance.id())
        .extension(instance.extension())
        .build();
  }

  /**
   * Creates a builder for {@link DeviceDefinition_Property DeviceDefinition_Property}.
   * <pre>
   * ImmutableDeviceDefinition_Property.builder()
   *    .type(com.fhir.types.fhir.CodeableConcept) // required {@link DeviceDefinition_Property#type() type}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link DeviceDefinition_Property#modifierExtension() modifierExtension}
   *    .valueQuantity(List&amp;lt;com.fhir.types.fhir.Quantity&amp;gt;) // optional {@link DeviceDefinition_Property#valueQuantity() valueQuantity}
   *    .valueCode(List&amp;lt;com.fhir.types.fhir.CodeableConcept&amp;gt;) // optional {@link DeviceDefinition_Property#valueCode() valueCode}
   *    .id(String) // optional {@link DeviceDefinition_Property#id() id}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link DeviceDefinition_Property#extension() extension}
   *    .build();
   * </pre>
   * @return A new DeviceDefinition_Property builder
   */
  public static TypeBuildStage builder() {
    return new ImmutableDeviceDefinition_Property.Builder();
  }

  /**
   * Builds instances of type {@link DeviceDefinition_Property DeviceDefinition_Property}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "DeviceDefinition_Property", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements TypeBuildStage, BuildFinal {
    private static final long INIT_BIT_TYPE = 0x1L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x1L;
    private static final long OPT_BIT_VALUE_QUANTITY = 0x2L;
    private static final long OPT_BIT_VALUE_CODE = 0x4L;
    private static final long OPT_BIT_ID = 0x8L;
    private static final long OPT_BIT_EXTENSION = 0x10L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable CodeableConcept type;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable List<Quantity> valueQuantity;
    private @Nullable List<CodeableConcept> valueCode;
    private @Nullable String id;
    private @Nullable List<Extension> extension;

    private Builder() {
    }

    /**
     * Initializes the value for the {@link DeviceDefinition_Property#type() type} attribute.
     * @param type The value for type 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("type")
    public final Builder type(CodeableConcept type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = Objects.requireNonNull(type, "type");
      initBits &= ~INIT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceDefinition_Property#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link DeviceDefinition_Property#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link DeviceDefinition_Property#valueQuantity() valueQuantity} to valueQuantity.
     * @param valueQuantity The value for valueQuantity
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueQuantity(List<Quantity> valueQuantity) {
      checkNotIsSet(valueQuantityIsSet(), "valueQuantity");
      this.valueQuantity = Objects.requireNonNull(valueQuantity, "valueQuantity");
      optBits |= OPT_BIT_VALUE_QUANTITY;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceDefinition_Property#valueQuantity() valueQuantity} to valueQuantity.
     * @param valueQuantity The value for valueQuantity
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("valueQuantity")
    public final Builder valueQuantity(Optional<? extends List<Quantity>> valueQuantity) {
      checkNotIsSet(valueQuantityIsSet(), "valueQuantity");
      this.valueQuantity = valueQuantity.orElse(null);
      optBits |= OPT_BIT_VALUE_QUANTITY;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceDefinition_Property#valueCode() valueCode} to valueCode.
     * @param valueCode The value for valueCode
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueCode(List<CodeableConcept> valueCode) {
      checkNotIsSet(valueCodeIsSet(), "valueCode");
      this.valueCode = Objects.requireNonNull(valueCode, "valueCode");
      optBits |= OPT_BIT_VALUE_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceDefinition_Property#valueCode() valueCode} to valueCode.
     * @param valueCode The value for valueCode
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("valueCode")
    public final Builder valueCode(Optional<? extends List<CodeableConcept>> valueCode) {
      checkNotIsSet(valueCodeIsSet(), "valueCode");
      this.valueCode = valueCode.orElse(null);
      optBits |= OPT_BIT_VALUE_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceDefinition_Property#id() id} to id.
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
     * Initializes the optional value {@link DeviceDefinition_Property#id() id} to id.
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
     * Initializes the optional value {@link DeviceDefinition_Property#extension() extension} to extension.
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
     * Initializes the optional value {@link DeviceDefinition_Property#extension() extension} to extension.
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
     * Builds a new {@link DeviceDefinition_Property DeviceDefinition_Property}.
     * @return An immutable instance of DeviceDefinition_Property
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public DeviceDefinition_Property build() {
      checkRequiredAttributes();
      return new ImmutableDeviceDefinition_Property(type, modifierExtension, valueQuantity, valueCode, id, extension);
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean valueQuantityIsSet() {
      return (optBits & OPT_BIT_VALUE_QUANTITY) != 0;
    }

    private boolean valueCodeIsSet() {
      return (optBits & OPT_BIT_VALUE_CODE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean typeIsSet() {
      return (initBits & INIT_BIT_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of DeviceDefinition_Property is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!typeIsSet()) attributes.add("type");
      return "Cannot build DeviceDefinition_Property, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "DeviceDefinition_Property", generator = "Immutables")
  public interface TypeBuildStage {
    /**
     * Initializes the value for the {@link DeviceDefinition_Property#type() type} attribute.
     * @param type The value for type 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal type(CodeableConcept type);
  }

  @Generated(from = "DeviceDefinition_Property", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link DeviceDefinition_Property#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link DeviceDefinition_Property#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link DeviceDefinition_Property#valueQuantity() valueQuantity} to valueQuantity.
     * @param valueQuantity The value for valueQuantity
     * @return {@code this} builder for chained invocation
     */
    BuildFinal valueQuantity(List<Quantity> valueQuantity);

    /**
     * Initializes the optional value {@link DeviceDefinition_Property#valueQuantity() valueQuantity} to valueQuantity.
     * @param valueQuantity The value for valueQuantity
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal valueQuantity(Optional<? extends List<Quantity>> valueQuantity);

    /**
     * Initializes the optional value {@link DeviceDefinition_Property#valueCode() valueCode} to valueCode.
     * @param valueCode The value for valueCode
     * @return {@code this} builder for chained invocation
     */
    BuildFinal valueCode(List<CodeableConcept> valueCode);

    /**
     * Initializes the optional value {@link DeviceDefinition_Property#valueCode() valueCode} to valueCode.
     * @param valueCode The value for valueCode
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal valueCode(Optional<? extends List<CodeableConcept>> valueCode);

    /**
     * Initializes the optional value {@link DeviceDefinition_Property#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(String id);

    /**
     * Initializes the optional value {@link DeviceDefinition_Property#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<String> id);

    /**
     * Initializes the optional value {@link DeviceDefinition_Property#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link DeviceDefinition_Property#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Builds a new {@link DeviceDefinition_Property DeviceDefinition_Property}.
     * @return An immutable instance of DeviceDefinition_Property
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    DeviceDefinition_Property build();
  }
}
