package com.fhir;

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
 * Immutable implementation of {@link MedicinalProductIngredient_SpecifiedSubstance}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableMedicinalProductIngredient_SpecifiedSubstance.builder()}.
 */
@Generated(from = "MedicinalProductIngredient_SpecifiedSubstance", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableMedicinalProductIngredient_SpecifiedSubstance
    implements MedicinalProductIngredient_SpecifiedSubstance {
  private final @Nullable List<MedicinalProductIngredient_Strength> strength;
  private final @Nullable List<Extension> extension;
  private final CodeableConcept code;
  private final @Nullable String id;
  private final @Nullable List<Extension> modifierExtension;
  private final CodeableConcept group;
  private final @Nullable CodeableConcept confidentiality;

  private ImmutableMedicinalProductIngredient_SpecifiedSubstance(
      @Nullable List<MedicinalProductIngredient_Strength> strength,
      @Nullable List<Extension> extension,
      CodeableConcept code,
      @Nullable String id,
      @Nullable List<Extension> modifierExtension,
      CodeableConcept group,
      @Nullable CodeableConcept confidentiality) {
    this.strength = strength;
    this.extension = extension;
    this.code = code;
    this.id = id;
    this.modifierExtension = modifierExtension;
    this.group = group;
    this.confidentiality = confidentiality;
  }

  /**
   * @return The value of the {@code strength} attribute
   */
  @JsonProperty("strength")
  @Override
  public Optional<List<MedicinalProductIngredient_Strength>> strength() {
    return Optional.ofNullable(strength);
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
   * @return The value of the {@code code} attribute
   */
  @JsonProperty("code")
  @Override
  public CodeableConcept code() {
    return code;
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @JsonProperty("modifierExtension")
  @Override
  public Optional<List<Extension>> modifierExtension() {
    return Optional.ofNullable(modifierExtension);
  }

  /**
   * @return The value of the {@code group} attribute
   */
  @JsonProperty("group")
  @Override
  public CodeableConcept group() {
    return group;
  }

  /**
   * @return The value of the {@code confidentiality} attribute
   */
  @JsonProperty("confidentiality")
  @Override
  public Optional<CodeableConcept> confidentiality() {
    return Optional.ofNullable(confidentiality);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductIngredient_SpecifiedSubstance#strength() strength} attribute.
   * @param value The value for strength
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductIngredient_SpecifiedSubstance withStrength(List<MedicinalProductIngredient_Strength> value) {
    @Nullable List<MedicinalProductIngredient_Strength> newValue = Objects.requireNonNull(value, "strength");
    if (this.strength == newValue) return this;
    return new ImmutableMedicinalProductIngredient_SpecifiedSubstance(
        newValue,
        this.extension,
        this.code,
        this.id,
        this.modifierExtension,
        this.group,
        this.confidentiality);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductIngredient_SpecifiedSubstance#strength() strength} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for strength
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductIngredient_SpecifiedSubstance withStrength(Optional<? extends List<MedicinalProductIngredient_Strength>> optional) {
    @Nullable List<MedicinalProductIngredient_Strength> value = optional.orElse(null);
    if (this.strength == value) return this;
    return new ImmutableMedicinalProductIngredient_SpecifiedSubstance(
        value,
        this.extension,
        this.code,
        this.id,
        this.modifierExtension,
        this.group,
        this.confidentiality);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductIngredient_SpecifiedSubstance#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductIngredient_SpecifiedSubstance withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableMedicinalProductIngredient_SpecifiedSubstance(
        this.strength,
        newValue,
        this.code,
        this.id,
        this.modifierExtension,
        this.group,
        this.confidentiality);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductIngredient_SpecifiedSubstance#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductIngredient_SpecifiedSubstance withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableMedicinalProductIngredient_SpecifiedSubstance(
        this.strength,
        value,
        this.code,
        this.id,
        this.modifierExtension,
        this.group,
        this.confidentiality);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MedicinalProductIngredient_SpecifiedSubstance#code() code} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for code
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMedicinalProductIngredient_SpecifiedSubstance withCode(CodeableConcept value) {
    if (this.code == value) return this;
    CodeableConcept newValue = Objects.requireNonNull(value, "code");
    return new ImmutableMedicinalProductIngredient_SpecifiedSubstance(
        this.strength,
        this.extension,
        newValue,
        this.id,
        this.modifierExtension,
        this.group,
        this.confidentiality);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductIngredient_SpecifiedSubstance#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductIngredient_SpecifiedSubstance withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableMedicinalProductIngredient_SpecifiedSubstance(
        this.strength,
        this.extension,
        this.code,
        newValue,
        this.modifierExtension,
        this.group,
        this.confidentiality);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductIngredient_SpecifiedSubstance#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductIngredient_SpecifiedSubstance withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableMedicinalProductIngredient_SpecifiedSubstance(
        this.strength,
        this.extension,
        this.code,
        value,
        this.modifierExtension,
        this.group,
        this.confidentiality);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductIngredient_SpecifiedSubstance#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductIngredient_SpecifiedSubstance withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableMedicinalProductIngredient_SpecifiedSubstance(this.strength, this.extension, this.code, this.id, newValue, this.group, this.confidentiality);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductIngredient_SpecifiedSubstance#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductIngredient_SpecifiedSubstance withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableMedicinalProductIngredient_SpecifiedSubstance(this.strength, this.extension, this.code, this.id, value, this.group, this.confidentiality);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MedicinalProductIngredient_SpecifiedSubstance#group() group} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for group
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMedicinalProductIngredient_SpecifiedSubstance withGroup(CodeableConcept value) {
    if (this.group == value) return this;
    CodeableConcept newValue = Objects.requireNonNull(value, "group");
    return new ImmutableMedicinalProductIngredient_SpecifiedSubstance(
        this.strength,
        this.extension,
        this.code,
        this.id,
        this.modifierExtension,
        newValue,
        this.confidentiality);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductIngredient_SpecifiedSubstance#confidentiality() confidentiality} attribute.
   * @param value The value for confidentiality
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductIngredient_SpecifiedSubstance withConfidentiality(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "confidentiality");
    if (this.confidentiality == newValue) return this;
    return new ImmutableMedicinalProductIngredient_SpecifiedSubstance(this.strength, this.extension, this.code, this.id, this.modifierExtension, this.group, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductIngredient_SpecifiedSubstance#confidentiality() confidentiality} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for confidentiality
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductIngredient_SpecifiedSubstance withConfidentiality(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.confidentiality == value) return this;
    return new ImmutableMedicinalProductIngredient_SpecifiedSubstance(this.strength, this.extension, this.code, this.id, this.modifierExtension, this.group, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableMedicinalProductIngredient_SpecifiedSubstance} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableMedicinalProductIngredient_SpecifiedSubstance
        && equalTo((ImmutableMedicinalProductIngredient_SpecifiedSubstance) another);
  }

  private boolean equalTo(ImmutableMedicinalProductIngredient_SpecifiedSubstance another) {
    return Objects.equals(strength, another.strength)
        && Objects.equals(extension, another.extension)
        && code.equals(another.code)
        && Objects.equals(id, another.id)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && group.equals(another.group)
        && Objects.equals(confidentiality, another.confidentiality);
  }

  /**
   * Computes a hash code from attributes: {@code strength}, {@code extension}, {@code code}, {@code id}, {@code modifierExtension}, {@code group}, {@code confidentiality}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(strength);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + code.hashCode();
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + group.hashCode();
    h += (h << 5) + Objects.hashCode(confidentiality);
    return h;
  }

  /**
   * Prints the immutable value {@code MedicinalProductIngredient_SpecifiedSubstance} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("MedicinalProductIngredient_SpecifiedSubstance{");
    if (strength != null) {
      builder.append("strength=").append(strength);
    }
    if (extension != null) {
      if (builder.length() > 46) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (builder.length() > 46) builder.append(", ");
    builder.append("code=").append(code);
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    builder.append(", ");
    builder.append("group=").append(group);
    if (confidentiality != null) {
      builder.append(", ");
      builder.append("confidentiality=").append(confidentiality);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "MedicinalProductIngredient_SpecifiedSubstance", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements MedicinalProductIngredient_SpecifiedSubstance {
    @Nullable Optional<List<MedicinalProductIngredient_Strength>> strength = Optional.empty();
    boolean strengthIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable CodeableConcept code;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable CodeableConcept group;
    @Nullable Optional<CodeableConcept> confidentiality = Optional.empty();
    boolean confidentialityIsSet;
    @JsonProperty("strength")
    public void setStrength(Optional<List<MedicinalProductIngredient_Strength>> strength) {
      this.strength = strength;
      this.strengthIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("code")
    public void setCode(CodeableConcept code) {
      this.code = code;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("group")
    public void setGroup(CodeableConcept group) {
      this.group = group;
    }
    @JsonProperty("confidentiality")
    public void setConfidentiality(Optional<CodeableConcept> confidentiality) {
      this.confidentiality = confidentiality;
      this.confidentialityIsSet = true;
    }
    @Override
    public Optional<List<MedicinalProductIngredient_Strength>> strength() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public CodeableConcept code() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public CodeableConcept group() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> confidentiality() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableMedicinalProductIngredient_SpecifiedSubstance fromJson(Json json) {
    ImmutableMedicinalProductIngredient_SpecifiedSubstance.Builder builder = ((ImmutableMedicinalProductIngredient_SpecifiedSubstance.Builder) ImmutableMedicinalProductIngredient_SpecifiedSubstance.builder());
    if (json.strengthIsSet) {
      builder.strength(json.strength);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.code != null) {
      builder.code(json.code);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.group != null) {
      builder.group(json.group);
    }
    if (json.confidentialityIsSet) {
      builder.confidentiality(json.confidentiality);
    }
    return (ImmutableMedicinalProductIngredient_SpecifiedSubstance) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link MedicinalProductIngredient_SpecifiedSubstance} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable MedicinalProductIngredient_SpecifiedSubstance instance
   */
  public static MedicinalProductIngredient_SpecifiedSubstance copyOf(MedicinalProductIngredient_SpecifiedSubstance instance) {
    if (instance instanceof ImmutableMedicinalProductIngredient_SpecifiedSubstance) {
      return (ImmutableMedicinalProductIngredient_SpecifiedSubstance) instance;
    }
    return ((ImmutableMedicinalProductIngredient_SpecifiedSubstance.Builder) ImmutableMedicinalProductIngredient_SpecifiedSubstance.builder())
        .strength(instance.strength())
        .extension(instance.extension())
        .code(instance.code())
        .id(instance.id())
        .modifierExtension(instance.modifierExtension())
        .group(instance.group())
        .confidentiality(instance.confidentiality())
        .build();
  }

  /**
   * Creates a builder for {@link MedicinalProductIngredient_SpecifiedSubstance MedicinalProductIngredient_SpecifiedSubstance}.
   * <pre>
   * ImmutableMedicinalProductIngredient_SpecifiedSubstance.builder()
   *    .strength(List&amp;lt;com.fhir.MedicinalProductIngredient_Strength&amp;gt;) // optional {@link MedicinalProductIngredient_SpecifiedSubstance#strength() strength}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link MedicinalProductIngredient_SpecifiedSubstance#extension() extension}
   *    .code(com.fhir.CodeableConcept) // required {@link MedicinalProductIngredient_SpecifiedSubstance#code() code}
   *    .id(String) // optional {@link MedicinalProductIngredient_SpecifiedSubstance#id() id}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link MedicinalProductIngredient_SpecifiedSubstance#modifierExtension() modifierExtension}
   *    .group(com.fhir.CodeableConcept) // required {@link MedicinalProductIngredient_SpecifiedSubstance#group() group}
   *    .confidentiality(com.fhir.CodeableConcept) // optional {@link MedicinalProductIngredient_SpecifiedSubstance#confidentiality() confidentiality}
   *    .build();
   * </pre>
   * @return A new MedicinalProductIngredient_SpecifiedSubstance builder
   */
  public static CodeBuildStage builder() {
    return new ImmutableMedicinalProductIngredient_SpecifiedSubstance.Builder();
  }

  /**
   * Builds instances of type {@link MedicinalProductIngredient_SpecifiedSubstance MedicinalProductIngredient_SpecifiedSubstance}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "MedicinalProductIngredient_SpecifiedSubstance", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements CodeBuildStage, GroupBuildStage, BuildFinal {
    private static final long INIT_BIT_CODE = 0x1L;
    private static final long INIT_BIT_GROUP = 0x2L;
    private static final long OPT_BIT_STRENGTH = 0x1L;
    private static final long OPT_BIT_EXTENSION = 0x2L;
    private static final long OPT_BIT_ID = 0x4L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x8L;
    private static final long OPT_BIT_CONFIDENTIALITY = 0x10L;
    private long initBits = 0x3L;
    private long optBits;

    private @Nullable List<MedicinalProductIngredient_Strength> strength;
    private @Nullable List<Extension> extension;
    private @Nullable CodeableConcept code;
    private @Nullable String id;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable CodeableConcept group;
    private @Nullable CodeableConcept confidentiality;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link MedicinalProductIngredient_SpecifiedSubstance#strength() strength} to strength.
     * @param strength The value for strength
     * @return {@code this} builder for chained invocation
     */
    public final Builder strength(List<MedicinalProductIngredient_Strength> strength) {
      checkNotIsSet(strengthIsSet(), "strength");
      this.strength = Objects.requireNonNull(strength, "strength");
      optBits |= OPT_BIT_STRENGTH;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductIngredient_SpecifiedSubstance#strength() strength} to strength.
     * @param strength The value for strength
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("strength")
    public final Builder strength(Optional<? extends List<MedicinalProductIngredient_Strength>> strength) {
      checkNotIsSet(strengthIsSet(), "strength");
      this.strength = strength.orElse(null);
      optBits |= OPT_BIT_STRENGTH;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductIngredient_SpecifiedSubstance#extension() extension} to extension.
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
     * Initializes the optional value {@link MedicinalProductIngredient_SpecifiedSubstance#extension() extension} to extension.
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
     * Initializes the value for the {@link MedicinalProductIngredient_SpecifiedSubstance#code() code} attribute.
     * @param code The value for code 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("code")
    public final Builder code(CodeableConcept code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = Objects.requireNonNull(code, "code");
      initBits &= ~INIT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductIngredient_SpecifiedSubstance#id() id} to id.
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
     * Initializes the optional value {@link MedicinalProductIngredient_SpecifiedSubstance#id() id} to id.
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
     * Initializes the optional value {@link MedicinalProductIngredient_SpecifiedSubstance#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MedicinalProductIngredient_SpecifiedSubstance#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the value for the {@link MedicinalProductIngredient_SpecifiedSubstance#group() group} attribute.
     * @param group The value for group 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("group")
    public final Builder group(CodeableConcept group) {
      checkNotIsSet(groupIsSet(), "group");
      this.group = Objects.requireNonNull(group, "group");
      initBits &= ~INIT_BIT_GROUP;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductIngredient_SpecifiedSubstance#confidentiality() confidentiality} to confidentiality.
     * @param confidentiality The value for confidentiality
     * @return {@code this} builder for chained invocation
     */
    public final Builder confidentiality(CodeableConcept confidentiality) {
      checkNotIsSet(confidentialityIsSet(), "confidentiality");
      this.confidentiality = Objects.requireNonNull(confidentiality, "confidentiality");
      optBits |= OPT_BIT_CONFIDENTIALITY;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductIngredient_SpecifiedSubstance#confidentiality() confidentiality} to confidentiality.
     * @param confidentiality The value for confidentiality
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("confidentiality")
    public final Builder confidentiality(Optional<? extends CodeableConcept> confidentiality) {
      checkNotIsSet(confidentialityIsSet(), "confidentiality");
      this.confidentiality = confidentiality.orElse(null);
      optBits |= OPT_BIT_CONFIDENTIALITY;
      return this;
    }

    /**
     * Builds a new {@link MedicinalProductIngredient_SpecifiedSubstance MedicinalProductIngredient_SpecifiedSubstance}.
     * @return An immutable instance of MedicinalProductIngredient_SpecifiedSubstance
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public MedicinalProductIngredient_SpecifiedSubstance build() {
      checkRequiredAttributes();
      return new ImmutableMedicinalProductIngredient_SpecifiedSubstance(strength, extension, code, id, modifierExtension, group, confidentiality);
    }

    private boolean strengthIsSet() {
      return (optBits & OPT_BIT_STRENGTH) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean confidentialityIsSet() {
      return (optBits & OPT_BIT_CONFIDENTIALITY) != 0;
    }

    private boolean codeIsSet() {
      return (initBits & INIT_BIT_CODE) == 0;
    }

    private boolean groupIsSet() {
      return (initBits & INIT_BIT_GROUP) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of MedicinalProductIngredient_SpecifiedSubstance is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!codeIsSet()) attributes.add("code");
      if (!groupIsSet()) attributes.add("group");
      return "Cannot build MedicinalProductIngredient_SpecifiedSubstance, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "MedicinalProductIngredient_SpecifiedSubstance", generator = "Immutables")
  public interface CodeBuildStage {
    /**
     * Initializes the value for the {@link MedicinalProductIngredient_SpecifiedSubstance#code() code} attribute.
     * @param code The value for code 
     * @return {@code this} builder for use in a chained invocation
     */
    GroupBuildStage code(CodeableConcept code);
  }

  @Generated(from = "MedicinalProductIngredient_SpecifiedSubstance", generator = "Immutables")
  public interface GroupBuildStage {
    /**
     * Initializes the value for the {@link MedicinalProductIngredient_SpecifiedSubstance#group() group} attribute.
     * @param group The value for group 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal group(CodeableConcept group);
  }

  @Generated(from = "MedicinalProductIngredient_SpecifiedSubstance", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link MedicinalProductIngredient_SpecifiedSubstance#strength() strength} to strength.
     * @param strength The value for strength
     * @return {@code this} builder for chained invocation
     */
    BuildFinal strength(List<MedicinalProductIngredient_Strength> strength);

    /**
     * Initializes the optional value {@link MedicinalProductIngredient_SpecifiedSubstance#strength() strength} to strength.
     * @param strength The value for strength
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal strength(Optional<? extends List<MedicinalProductIngredient_Strength>> strength);

    /**
     * Initializes the optional value {@link MedicinalProductIngredient_SpecifiedSubstance#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link MedicinalProductIngredient_SpecifiedSubstance#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link MedicinalProductIngredient_SpecifiedSubstance#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(String id);

    /**
     * Initializes the optional value {@link MedicinalProductIngredient_SpecifiedSubstance#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<String> id);

    /**
     * Initializes the optional value {@link MedicinalProductIngredient_SpecifiedSubstance#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link MedicinalProductIngredient_SpecifiedSubstance#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link MedicinalProductIngredient_SpecifiedSubstance#confidentiality() confidentiality} to confidentiality.
     * @param confidentiality The value for confidentiality
     * @return {@code this} builder for chained invocation
     */
    BuildFinal confidentiality(CodeableConcept confidentiality);

    /**
     * Initializes the optional value {@link MedicinalProductIngredient_SpecifiedSubstance#confidentiality() confidentiality} to confidentiality.
     * @param confidentiality The value for confidentiality
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal confidentiality(Optional<? extends CodeableConcept> confidentiality);

    /**
     * Builds a new {@link MedicinalProductIngredient_SpecifiedSubstance MedicinalProductIngredient_SpecifiedSubstance}.
     * @return An immutable instance of MedicinalProductIngredient_SpecifiedSubstance
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    MedicinalProductIngredient_SpecifiedSubstance build();
  }
}
