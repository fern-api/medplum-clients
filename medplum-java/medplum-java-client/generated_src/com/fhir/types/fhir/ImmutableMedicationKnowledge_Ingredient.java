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
 * Immutable implementation of {@link MedicationKnowledge_Ingredient}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableMedicationKnowledge_Ingredient.builder()}.
 */
@Generated(from = "MedicationKnowledge_Ingredient", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableMedicationKnowledge_Ingredient
    implements MedicationKnowledge_Ingredient {
  private final @Nullable String id;
  private final @Nullable List<Extension> extension;
  private final @Nullable Boolean isActive;
  private final @Nullable Reference itemReference;
  private final @Nullable CodeableConcept itemCodeableConcept;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable Ratio strength;

  private ImmutableMedicationKnowledge_Ingredient(
      @Nullable String id,
      @Nullable List<Extension> extension,
      @Nullable Boolean isActive,
      @Nullable Reference itemReference,
      @Nullable CodeableConcept itemCodeableConcept,
      @Nullable List<Extension> modifierExtension,
      @Nullable Ratio strength) {
    this.id = id;
    this.extension = extension;
    this.isActive = isActive;
    this.itemReference = itemReference;
    this.itemCodeableConcept = itemCodeableConcept;
    this.modifierExtension = modifierExtension;
    this.strength = strength;
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
   * @return The value of the {@code isActive} attribute
   */
  @JsonProperty("isActive")
  @Override
  public Optional<Boolean> isActive() {
    return Optional.ofNullable(isActive);
  }

  /**
   * @return The value of the {@code itemReference} attribute
   */
  @JsonProperty("itemReference")
  @Override
  public Optional<Reference> itemReference() {
    return Optional.ofNullable(itemReference);
  }

  /**
   * @return The value of the {@code itemCodeableConcept} attribute
   */
  @JsonProperty("itemCodeableConcept")
  @Override
  public Optional<CodeableConcept> itemCodeableConcept() {
    return Optional.ofNullable(itemCodeableConcept);
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
   * @return The value of the {@code strength} attribute
   */
  @JsonProperty("strength")
  @Override
  public Optional<Ratio> strength() {
    return Optional.ofNullable(strength);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationKnowledge_Ingredient#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationKnowledge_Ingredient withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableMedicationKnowledge_Ingredient(
        newValue,
        this.extension,
        this.isActive,
        this.itemReference,
        this.itemCodeableConcept,
        this.modifierExtension,
        this.strength);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationKnowledge_Ingredient#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationKnowledge_Ingredient withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableMedicationKnowledge_Ingredient(
        value,
        this.extension,
        this.isActive,
        this.itemReference,
        this.itemCodeableConcept,
        this.modifierExtension,
        this.strength);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationKnowledge_Ingredient#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationKnowledge_Ingredient withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableMedicationKnowledge_Ingredient(
        this.id,
        newValue,
        this.isActive,
        this.itemReference,
        this.itemCodeableConcept,
        this.modifierExtension,
        this.strength);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationKnowledge_Ingredient#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationKnowledge_Ingredient withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableMedicationKnowledge_Ingredient(
        this.id,
        value,
        this.isActive,
        this.itemReference,
        this.itemCodeableConcept,
        this.modifierExtension,
        this.strength);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationKnowledge_Ingredient#isActive() isActive} attribute.
   * @param value The value for isActive
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationKnowledge_Ingredient withIsActive(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.isActive, newValue)) return this;
    return new ImmutableMedicationKnowledge_Ingredient(
        this.id,
        this.extension,
        newValue,
        this.itemReference,
        this.itemCodeableConcept,
        this.modifierExtension,
        this.strength);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationKnowledge_Ingredient#isActive() isActive} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for isActive
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationKnowledge_Ingredient withIsActive(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.isActive, value)) return this;
    return new ImmutableMedicationKnowledge_Ingredient(
        this.id,
        this.extension,
        value,
        this.itemReference,
        this.itemCodeableConcept,
        this.modifierExtension,
        this.strength);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationKnowledge_Ingredient#itemReference() itemReference} attribute.
   * @param value The value for itemReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationKnowledge_Ingredient withItemReference(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "itemReference");
    if (this.itemReference == newValue) return this;
    return new ImmutableMedicationKnowledge_Ingredient(
        this.id,
        this.extension,
        this.isActive,
        newValue,
        this.itemCodeableConcept,
        this.modifierExtension,
        this.strength);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationKnowledge_Ingredient#itemReference() itemReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for itemReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationKnowledge_Ingredient withItemReference(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.itemReference == value) return this;
    return new ImmutableMedicationKnowledge_Ingredient(
        this.id,
        this.extension,
        this.isActive,
        value,
        this.itemCodeableConcept,
        this.modifierExtension,
        this.strength);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationKnowledge_Ingredient#itemCodeableConcept() itemCodeableConcept} attribute.
   * @param value The value for itemCodeableConcept
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationKnowledge_Ingredient withItemCodeableConcept(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "itemCodeableConcept");
    if (this.itemCodeableConcept == newValue) return this;
    return new ImmutableMedicationKnowledge_Ingredient(
        this.id,
        this.extension,
        this.isActive,
        this.itemReference,
        newValue,
        this.modifierExtension,
        this.strength);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationKnowledge_Ingredient#itemCodeableConcept() itemCodeableConcept} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for itemCodeableConcept
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationKnowledge_Ingredient withItemCodeableConcept(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.itemCodeableConcept == value) return this;
    return new ImmutableMedicationKnowledge_Ingredient(
        this.id,
        this.extension,
        this.isActive,
        this.itemReference,
        value,
        this.modifierExtension,
        this.strength);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationKnowledge_Ingredient#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationKnowledge_Ingredient withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableMedicationKnowledge_Ingredient(
        this.id,
        this.extension,
        this.isActive,
        this.itemReference,
        this.itemCodeableConcept,
        newValue,
        this.strength);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationKnowledge_Ingredient#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationKnowledge_Ingredient withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableMedicationKnowledge_Ingredient(
        this.id,
        this.extension,
        this.isActive,
        this.itemReference,
        this.itemCodeableConcept,
        value,
        this.strength);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationKnowledge_Ingredient#strength() strength} attribute.
   * @param value The value for strength
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationKnowledge_Ingredient withStrength(Ratio value) {
    @Nullable Ratio newValue = Objects.requireNonNull(value, "strength");
    if (this.strength == newValue) return this;
    return new ImmutableMedicationKnowledge_Ingredient(
        this.id,
        this.extension,
        this.isActive,
        this.itemReference,
        this.itemCodeableConcept,
        this.modifierExtension,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationKnowledge_Ingredient#strength() strength} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for strength
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationKnowledge_Ingredient withStrength(Optional<? extends Ratio> optional) {
    @Nullable Ratio value = optional.orElse(null);
    if (this.strength == value) return this;
    return new ImmutableMedicationKnowledge_Ingredient(
        this.id,
        this.extension,
        this.isActive,
        this.itemReference,
        this.itemCodeableConcept,
        this.modifierExtension,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableMedicationKnowledge_Ingredient} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableMedicationKnowledge_Ingredient
        && equalTo((ImmutableMedicationKnowledge_Ingredient) another);
  }

  private boolean equalTo(ImmutableMedicationKnowledge_Ingredient another) {
    return Objects.equals(id, another.id)
        && Objects.equals(extension, another.extension)
        && Objects.equals(isActive, another.isActive)
        && Objects.equals(itemReference, another.itemReference)
        && Objects.equals(itemCodeableConcept, another.itemCodeableConcept)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(strength, another.strength);
  }

  /**
   * Computes a hash code from attributes: {@code id}, {@code extension}, {@code isActive}, {@code itemReference}, {@code itemCodeableConcept}, {@code modifierExtension}, {@code strength}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(isActive);
    h += (h << 5) + Objects.hashCode(itemReference);
    h += (h << 5) + Objects.hashCode(itemCodeableConcept);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(strength);
    return h;
  }

  /**
   * Prints the immutable value {@code MedicationKnowledge_Ingredient} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("MedicationKnowledge_Ingredient{");
    if (id != null) {
      builder.append("id=").append(id);
    }
    if (extension != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (isActive != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("isActive=").append(isActive);
    }
    if (itemReference != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("itemReference=").append(itemReference);
    }
    if (itemCodeableConcept != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("itemCodeableConcept=").append(itemCodeableConcept);
    }
    if (modifierExtension != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (strength != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("strength=").append(strength);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "MedicationKnowledge_Ingredient", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements MedicationKnowledge_Ingredient {
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<Boolean> isActive = Optional.empty();
    boolean isActiveIsSet;
    @Nullable Optional<Reference> itemReference = Optional.empty();
    boolean itemReferenceIsSet;
    @Nullable Optional<CodeableConcept> itemCodeableConcept = Optional.empty();
    boolean itemCodeableConceptIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<Ratio> strength = Optional.empty();
    boolean strengthIsSet;
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
    @JsonProperty("isActive")
    public void setIsActive(Optional<Boolean> isActive) {
      this.isActive = isActive;
      this.isActiveIsSet = true;
    }
    @JsonProperty("itemReference")
    public void setItemReference(Optional<Reference> itemReference) {
      this.itemReference = itemReference;
      this.itemReferenceIsSet = true;
    }
    @JsonProperty("itemCodeableConcept")
    public void setItemCodeableConcept(Optional<CodeableConcept> itemCodeableConcept) {
      this.itemCodeableConcept = itemCodeableConcept;
      this.itemCodeableConceptIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("strength")
    public void setStrength(Optional<Ratio> strength) {
      this.strength = strength;
      this.strengthIsSet = true;
    }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> isActive() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> itemReference() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> itemCodeableConcept() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Ratio> strength() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableMedicationKnowledge_Ingredient fromJson(Json json) {
    ImmutableMedicationKnowledge_Ingredient.Builder builder = ImmutableMedicationKnowledge_Ingredient.builder();
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.isActiveIsSet) {
      builder.isActive(json.isActive);
    }
    if (json.itemReferenceIsSet) {
      builder.itemReference(json.itemReference);
    }
    if (json.itemCodeableConceptIsSet) {
      builder.itemCodeableConcept(json.itemCodeableConcept);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.strengthIsSet) {
      builder.strength(json.strength);
    }
    return (ImmutableMedicationKnowledge_Ingredient) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link MedicationKnowledge_Ingredient} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable MedicationKnowledge_Ingredient instance
   */
  public static MedicationKnowledge_Ingredient copyOf(MedicationKnowledge_Ingredient instance) {
    if (instance instanceof ImmutableMedicationKnowledge_Ingredient) {
      return (ImmutableMedicationKnowledge_Ingredient) instance;
    }
    return ImmutableMedicationKnowledge_Ingredient.builder()
        .id(instance.id())
        .extension(instance.extension())
        .isActive(instance.isActive())
        .itemReference(instance.itemReference())
        .itemCodeableConcept(instance.itemCodeableConcept())
        .modifierExtension(instance.modifierExtension())
        .strength(instance.strength())
        .build();
  }

  /**
   * Creates a builder for {@link MedicationKnowledge_Ingredient MedicationKnowledge_Ingredient}.
   * <pre>
   * ImmutableMedicationKnowledge_Ingredient.builder()
   *    .id(String) // optional {@link MedicationKnowledge_Ingredient#id() id}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link MedicationKnowledge_Ingredient#extension() extension}
   *    .isActive(Boolean) // optional {@link MedicationKnowledge_Ingredient#isActive() isActive}
   *    .itemReference(com.fhir.types.fhir.Reference) // optional {@link MedicationKnowledge_Ingredient#itemReference() itemReference}
   *    .itemCodeableConcept(com.fhir.types.fhir.CodeableConcept) // optional {@link MedicationKnowledge_Ingredient#itemCodeableConcept() itemCodeableConcept}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link MedicationKnowledge_Ingredient#modifierExtension() modifierExtension}
   *    .strength(com.fhir.types.fhir.Ratio) // optional {@link MedicationKnowledge_Ingredient#strength() strength}
   *    .build();
   * </pre>
   * @return A new MedicationKnowledge_Ingredient builder
   */
  public static ImmutableMedicationKnowledge_Ingredient.Builder builder() {
    return new ImmutableMedicationKnowledge_Ingredient.Builder();
  }

  /**
   * Builds instances of type {@link MedicationKnowledge_Ingredient MedicationKnowledge_Ingredient}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "MedicationKnowledge_Ingredient", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_ID = 0x1L;
    private static final long OPT_BIT_EXTENSION = 0x2L;
    private static final long OPT_BIT_IS_ACTIVE = 0x4L;
    private static final long OPT_BIT_ITEM_REFERENCE = 0x8L;
    private static final long OPT_BIT_ITEM_CODEABLE_CONCEPT = 0x10L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x20L;
    private static final long OPT_BIT_STRENGTH = 0x40L;
    private long optBits;

    private @Nullable String id;
    private @Nullable List<Extension> extension;
    private @Nullable Boolean isActive;
    private @Nullable Reference itemReference;
    private @Nullable CodeableConcept itemCodeableConcept;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable Ratio strength;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge_Ingredient#id() id} to id.
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
     * Initializes the optional value {@link MedicationKnowledge_Ingredient#id() id} to id.
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
     * Initializes the optional value {@link MedicationKnowledge_Ingredient#extension() extension} to extension.
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
     * Initializes the optional value {@link MedicationKnowledge_Ingredient#extension() extension} to extension.
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
     * Initializes the optional value {@link MedicationKnowledge_Ingredient#isActive() isActive} to isActive.
     * @param isActive The value for isActive
     * @return {@code this} builder for chained invocation
     */
    public final Builder isActive(boolean isActive) {
      checkNotIsSet(isActiveIsSet(), "isActive");
      this.isActive = isActive;
      optBits |= OPT_BIT_IS_ACTIVE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge_Ingredient#isActive() isActive} to isActive.
     * @param isActive The value for isActive
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("isActive")
    public final Builder isActive(Optional<Boolean> isActive) {
      checkNotIsSet(isActiveIsSet(), "isActive");
      this.isActive = isActive.orElse(null);
      optBits |= OPT_BIT_IS_ACTIVE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge_Ingredient#itemReference() itemReference} to itemReference.
     * @param itemReference The value for itemReference
     * @return {@code this} builder for chained invocation
     */
    public final Builder itemReference(Reference itemReference) {
      checkNotIsSet(itemReferenceIsSet(), "itemReference");
      this.itemReference = Objects.requireNonNull(itemReference, "itemReference");
      optBits |= OPT_BIT_ITEM_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge_Ingredient#itemReference() itemReference} to itemReference.
     * @param itemReference The value for itemReference
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("itemReference")
    public final Builder itemReference(Optional<? extends Reference> itemReference) {
      checkNotIsSet(itemReferenceIsSet(), "itemReference");
      this.itemReference = itemReference.orElse(null);
      optBits |= OPT_BIT_ITEM_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge_Ingredient#itemCodeableConcept() itemCodeableConcept} to itemCodeableConcept.
     * @param itemCodeableConcept The value for itemCodeableConcept
     * @return {@code this} builder for chained invocation
     */
    public final Builder itemCodeableConcept(CodeableConcept itemCodeableConcept) {
      checkNotIsSet(itemCodeableConceptIsSet(), "itemCodeableConcept");
      this.itemCodeableConcept = Objects.requireNonNull(itemCodeableConcept, "itemCodeableConcept");
      optBits |= OPT_BIT_ITEM_CODEABLE_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge_Ingredient#itemCodeableConcept() itemCodeableConcept} to itemCodeableConcept.
     * @param itemCodeableConcept The value for itemCodeableConcept
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("itemCodeableConcept")
    public final Builder itemCodeableConcept(Optional<? extends CodeableConcept> itemCodeableConcept) {
      checkNotIsSet(itemCodeableConceptIsSet(), "itemCodeableConcept");
      this.itemCodeableConcept = itemCodeableConcept.orElse(null);
      optBits |= OPT_BIT_ITEM_CODEABLE_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge_Ingredient#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MedicationKnowledge_Ingredient#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MedicationKnowledge_Ingredient#strength() strength} to strength.
     * @param strength The value for strength
     * @return {@code this} builder for chained invocation
     */
    public final Builder strength(Ratio strength) {
      checkNotIsSet(strengthIsSet(), "strength");
      this.strength = Objects.requireNonNull(strength, "strength");
      optBits |= OPT_BIT_STRENGTH;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge_Ingredient#strength() strength} to strength.
     * @param strength The value for strength
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("strength")
    public final Builder strength(Optional<? extends Ratio> strength) {
      checkNotIsSet(strengthIsSet(), "strength");
      this.strength = strength.orElse(null);
      optBits |= OPT_BIT_STRENGTH;
      return this;
    }

    /**
     * Builds a new {@link MedicationKnowledge_Ingredient MedicationKnowledge_Ingredient}.
     * @return An immutable instance of MedicationKnowledge_Ingredient
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public MedicationKnowledge_Ingredient build() {
      return new ImmutableMedicationKnowledge_Ingredient(id, extension, isActive, itemReference, itemCodeableConcept, modifierExtension, strength);
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean isActiveIsSet() {
      return (optBits & OPT_BIT_IS_ACTIVE) != 0;
    }

    private boolean itemReferenceIsSet() {
      return (optBits & OPT_BIT_ITEM_REFERENCE) != 0;
    }

    private boolean itemCodeableConceptIsSet() {
      return (optBits & OPT_BIT_ITEM_CODEABLE_CONCEPT) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean strengthIsSet() {
      return (optBits & OPT_BIT_STRENGTH) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of MedicationKnowledge_Ingredient is strict, attribute is already set: ".concat(name));
    }
  }
}
