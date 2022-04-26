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
 * Immutable implementation of {@link SubstanceSourceMaterial_FractionDescription}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableSubstanceSourceMaterial_FractionDescription.builder()}.
 */
@Generated(from = "SubstanceSourceMaterial_FractionDescription", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableSubstanceSourceMaterial_FractionDescription
    implements SubstanceSourceMaterial_FractionDescription {
  private final @Nullable String fraction;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable List<Extension> extension;
  private final @Nullable CodeableConcept materialType;
  private final @Nullable String id;

  private ImmutableSubstanceSourceMaterial_FractionDescription(
      @Nullable String fraction,
      @Nullable List<Extension> modifierExtension,
      @Nullable List<Extension> extension,
      @Nullable CodeableConcept materialType,
      @Nullable String id) {
    this.fraction = fraction;
    this.modifierExtension = modifierExtension;
    this.extension = extension;
    this.materialType = materialType;
    this.id = id;
  }

  /**
   * @return The value of the {@code fraction} attribute
   */
  @JsonProperty("fraction")
  @Override
  public Optional<String> fraction() {
    return Optional.ofNullable(fraction);
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
   * @return The value of the {@code materialType} attribute
   */
  @JsonProperty("materialType")
  @Override
  public Optional<CodeableConcept> materialType() {
    return Optional.ofNullable(materialType);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSourceMaterial_FractionDescription#fraction() fraction} attribute.
   * @param value The value for fraction
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSourceMaterial_FractionDescription withFraction(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "fraction");
    if (Objects.equals(this.fraction, newValue)) return this;
    return new ImmutableSubstanceSourceMaterial_FractionDescription(newValue, this.modifierExtension, this.extension, this.materialType, this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSourceMaterial_FractionDescription#fraction() fraction} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for fraction
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSourceMaterial_FractionDescription withFraction(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.fraction, value)) return this;
    return new ImmutableSubstanceSourceMaterial_FractionDescription(value, this.modifierExtension, this.extension, this.materialType, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSourceMaterial_FractionDescription#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSourceMaterial_FractionDescription withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableSubstanceSourceMaterial_FractionDescription(this.fraction, newValue, this.extension, this.materialType, this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSourceMaterial_FractionDescription#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSourceMaterial_FractionDescription withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableSubstanceSourceMaterial_FractionDescription(this.fraction, value, this.extension, this.materialType, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSourceMaterial_FractionDescription#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSourceMaterial_FractionDescription withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableSubstanceSourceMaterial_FractionDescription(this.fraction, this.modifierExtension, newValue, this.materialType, this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSourceMaterial_FractionDescription#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSourceMaterial_FractionDescription withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableSubstanceSourceMaterial_FractionDescription(this.fraction, this.modifierExtension, value, this.materialType, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSourceMaterial_FractionDescription#materialType() materialType} attribute.
   * @param value The value for materialType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSourceMaterial_FractionDescription withMaterialType(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "materialType");
    if (this.materialType == newValue) return this;
    return new ImmutableSubstanceSourceMaterial_FractionDescription(this.fraction, this.modifierExtension, this.extension, newValue, this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSourceMaterial_FractionDescription#materialType() materialType} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for materialType
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSourceMaterial_FractionDescription withMaterialType(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.materialType == value) return this;
    return new ImmutableSubstanceSourceMaterial_FractionDescription(this.fraction, this.modifierExtension, this.extension, value, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSourceMaterial_FractionDescription#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSourceMaterial_FractionDescription withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableSubstanceSourceMaterial_FractionDescription(this.fraction, this.modifierExtension, this.extension, this.materialType, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSourceMaterial_FractionDescription#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSourceMaterial_FractionDescription withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableSubstanceSourceMaterial_FractionDescription(this.fraction, this.modifierExtension, this.extension, this.materialType, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableSubstanceSourceMaterial_FractionDescription} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableSubstanceSourceMaterial_FractionDescription
        && equalTo((ImmutableSubstanceSourceMaterial_FractionDescription) another);
  }

  private boolean equalTo(ImmutableSubstanceSourceMaterial_FractionDescription another) {
    return Objects.equals(fraction, another.fraction)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(extension, another.extension)
        && Objects.equals(materialType, another.materialType)
        && Objects.equals(id, another.id);
  }

  /**
   * Computes a hash code from attributes: {@code fraction}, {@code modifierExtension}, {@code extension}, {@code materialType}, {@code id}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(fraction);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(materialType);
    h += (h << 5) + Objects.hashCode(id);
    return h;
  }

  /**
   * Prints the immutable value {@code SubstanceSourceMaterial_FractionDescription} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("SubstanceSourceMaterial_FractionDescription{");
    if (fraction != null) {
      builder.append("fraction=").append(fraction);
    }
    if (modifierExtension != null) {
      if (builder.length() > 44) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (extension != null) {
      if (builder.length() > 44) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (materialType != null) {
      if (builder.length() > 44) builder.append(", ");
      builder.append("materialType=").append(materialType);
    }
    if (id != null) {
      if (builder.length() > 44) builder.append(", ");
      builder.append("id=").append(id);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "SubstanceSourceMaterial_FractionDescription", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements SubstanceSourceMaterial_FractionDescription {
    @Nullable Optional<String> fraction = Optional.empty();
    boolean fractionIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<CodeableConcept> materialType = Optional.empty();
    boolean materialTypeIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @JsonProperty("fraction")
    public void setFraction(Optional<String> fraction) {
      this.fraction = fraction;
      this.fractionIsSet = true;
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
    @JsonProperty("materialType")
    public void setMaterialType(Optional<CodeableConcept> materialType) {
      this.materialType = materialType;
      this.materialTypeIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @Override
    public Optional<String> fraction() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> materialType() { throw new UnsupportedOperationException(); }
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
  static ImmutableSubstanceSourceMaterial_FractionDescription fromJson(Json json) {
    ImmutableSubstanceSourceMaterial_FractionDescription.Builder builder = ImmutableSubstanceSourceMaterial_FractionDescription.builder();
    if (json.fractionIsSet) {
      builder.fraction(json.fraction);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.materialTypeIsSet) {
      builder.materialType(json.materialType);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    return (ImmutableSubstanceSourceMaterial_FractionDescription) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link SubstanceSourceMaterial_FractionDescription} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable SubstanceSourceMaterial_FractionDescription instance
   */
  public static SubstanceSourceMaterial_FractionDescription copyOf(SubstanceSourceMaterial_FractionDescription instance) {
    if (instance instanceof ImmutableSubstanceSourceMaterial_FractionDescription) {
      return (ImmutableSubstanceSourceMaterial_FractionDescription) instance;
    }
    return ImmutableSubstanceSourceMaterial_FractionDescription.builder()
        .fraction(instance.fraction())
        .modifierExtension(instance.modifierExtension())
        .extension(instance.extension())
        .materialType(instance.materialType())
        .id(instance.id())
        .build();
  }

  /**
   * Creates a builder for {@link SubstanceSourceMaterial_FractionDescription SubstanceSourceMaterial_FractionDescription}.
   * <pre>
   * ImmutableSubstanceSourceMaterial_FractionDescription.builder()
   *    .fraction(String) // optional {@link SubstanceSourceMaterial_FractionDescription#fraction() fraction}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link SubstanceSourceMaterial_FractionDescription#modifierExtension() modifierExtension}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link SubstanceSourceMaterial_FractionDescription#extension() extension}
   *    .materialType(com.fhir.types.fhir.CodeableConcept) // optional {@link SubstanceSourceMaterial_FractionDescription#materialType() materialType}
   *    .id(String) // optional {@link SubstanceSourceMaterial_FractionDescription#id() id}
   *    .build();
   * </pre>
   * @return A new SubstanceSourceMaterial_FractionDescription builder
   */
  public static ImmutableSubstanceSourceMaterial_FractionDescription.Builder builder() {
    return new ImmutableSubstanceSourceMaterial_FractionDescription.Builder();
  }

  /**
   * Builds instances of type {@link SubstanceSourceMaterial_FractionDescription SubstanceSourceMaterial_FractionDescription}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "SubstanceSourceMaterial_FractionDescription", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_FRACTION = 0x1L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x2L;
    private static final long OPT_BIT_EXTENSION = 0x4L;
    private static final long OPT_BIT_MATERIAL_TYPE = 0x8L;
    private static final long OPT_BIT_ID = 0x10L;
    private long optBits;

    private @Nullable String fraction;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable List<Extension> extension;
    private @Nullable CodeableConcept materialType;
    private @Nullable String id;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial_FractionDescription#fraction() fraction} to fraction.
     * @param fraction The value for fraction
     * @return {@code this} builder for chained invocation
     */
    public final Builder fraction(String fraction) {
      checkNotIsSet(fractionIsSet(), "fraction");
      this.fraction = Objects.requireNonNull(fraction, "fraction");
      optBits |= OPT_BIT_FRACTION;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial_FractionDescription#fraction() fraction} to fraction.
     * @param fraction The value for fraction
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("fraction")
    public final Builder fraction(Optional<String> fraction) {
      checkNotIsSet(fractionIsSet(), "fraction");
      this.fraction = fraction.orElse(null);
      optBits |= OPT_BIT_FRACTION;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial_FractionDescription#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link SubstanceSourceMaterial_FractionDescription#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link SubstanceSourceMaterial_FractionDescription#extension() extension} to extension.
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
     * Initializes the optional value {@link SubstanceSourceMaterial_FractionDescription#extension() extension} to extension.
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
     * Initializes the optional value {@link SubstanceSourceMaterial_FractionDescription#materialType() materialType} to materialType.
     * @param materialType The value for materialType
     * @return {@code this} builder for chained invocation
     */
    public final Builder materialType(CodeableConcept materialType) {
      checkNotIsSet(materialTypeIsSet(), "materialType");
      this.materialType = Objects.requireNonNull(materialType, "materialType");
      optBits |= OPT_BIT_MATERIAL_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial_FractionDescription#materialType() materialType} to materialType.
     * @param materialType The value for materialType
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("materialType")
    public final Builder materialType(Optional<? extends CodeableConcept> materialType) {
      checkNotIsSet(materialTypeIsSet(), "materialType");
      this.materialType = materialType.orElse(null);
      optBits |= OPT_BIT_MATERIAL_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial_FractionDescription#id() id} to id.
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
     * Initializes the optional value {@link SubstanceSourceMaterial_FractionDescription#id() id} to id.
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
     * Builds a new {@link SubstanceSourceMaterial_FractionDescription SubstanceSourceMaterial_FractionDescription}.
     * @return An immutable instance of SubstanceSourceMaterial_FractionDescription
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public SubstanceSourceMaterial_FractionDescription build() {
      return new ImmutableSubstanceSourceMaterial_FractionDescription(fraction, modifierExtension, extension, materialType, id);
    }

    private boolean fractionIsSet() {
      return (optBits & OPT_BIT_FRACTION) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean materialTypeIsSet() {
      return (optBits & OPT_BIT_MATERIAL_TYPE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of SubstanceSourceMaterial_FractionDescription is strict, attribute is already set: ".concat(name));
    }
  }
}
