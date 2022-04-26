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
 * Immutable implementation of {@link Medication_Ingredient}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableMedication_Ingredient.builder()}.
 */
@Generated(from = "Medication_Ingredient", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableMedication_Ingredient implements Medication_Ingredient {
  private final @Nullable List<Extension> extension;
  private final @Nullable Boolean isActive;
  private final @Nullable CodeableConcept itemCodeableConcept;
  private final @Nullable String id;
  private final @Nullable Reference itemReference;
  private final @Nullable Ratio strength;
  private final @Nullable List<Extension> modifierExtension;

  private ImmutableMedication_Ingredient(
      @Nullable List<Extension> extension,
      @Nullable Boolean isActive,
      @Nullable CodeableConcept itemCodeableConcept,
      @Nullable String id,
      @Nullable Reference itemReference,
      @Nullable Ratio strength,
      @Nullable List<Extension> modifierExtension) {
    this.extension = extension;
    this.isActive = isActive;
    this.itemCodeableConcept = itemCodeableConcept;
    this.id = id;
    this.itemReference = itemReference;
    this.strength = strength;
    this.modifierExtension = modifierExtension;
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
   * @return The value of the {@code itemCodeableConcept} attribute
   */
  @JsonProperty("itemCodeableConcept")
  @Override
  public Optional<CodeableConcept> itemCodeableConcept() {
    return Optional.ofNullable(itemCodeableConcept);
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
   * @return The value of the {@code itemReference} attribute
   */
  @JsonProperty("itemReference")
  @Override
  public Optional<Reference> itemReference() {
    return Optional.ofNullable(itemReference);
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @JsonProperty("modifierExtension")
  @Override
  public Optional<List<Extension>> modifierExtension() {
    return Optional.ofNullable(modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Medication_Ingredient#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedication_Ingredient withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableMedication_Ingredient(
        newValue,
        this.isActive,
        this.itemCodeableConcept,
        this.id,
        this.itemReference,
        this.strength,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Medication_Ingredient#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedication_Ingredient withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableMedication_Ingredient(
        value,
        this.isActive,
        this.itemCodeableConcept,
        this.id,
        this.itemReference,
        this.strength,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Medication_Ingredient#isActive() isActive} attribute.
   * @param value The value for isActive
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedication_Ingredient withIsActive(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.isActive, newValue)) return this;
    return new ImmutableMedication_Ingredient(
        this.extension,
        newValue,
        this.itemCodeableConcept,
        this.id,
        this.itemReference,
        this.strength,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Medication_Ingredient#isActive() isActive} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for isActive
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedication_Ingredient withIsActive(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.isActive, value)) return this;
    return new ImmutableMedication_Ingredient(
        this.extension,
        value,
        this.itemCodeableConcept,
        this.id,
        this.itemReference,
        this.strength,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Medication_Ingredient#itemCodeableConcept() itemCodeableConcept} attribute.
   * @param value The value for itemCodeableConcept
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedication_Ingredient withItemCodeableConcept(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "itemCodeableConcept");
    if (this.itemCodeableConcept == newValue) return this;
    return new ImmutableMedication_Ingredient(
        this.extension,
        this.isActive,
        newValue,
        this.id,
        this.itemReference,
        this.strength,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Medication_Ingredient#itemCodeableConcept() itemCodeableConcept} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for itemCodeableConcept
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedication_Ingredient withItemCodeableConcept(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.itemCodeableConcept == value) return this;
    return new ImmutableMedication_Ingredient(
        this.extension,
        this.isActive,
        value,
        this.id,
        this.itemReference,
        this.strength,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Medication_Ingredient#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedication_Ingredient withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableMedication_Ingredient(
        this.extension,
        this.isActive,
        this.itemCodeableConcept,
        newValue,
        this.itemReference,
        this.strength,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Medication_Ingredient#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedication_Ingredient withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableMedication_Ingredient(
        this.extension,
        this.isActive,
        this.itemCodeableConcept,
        value,
        this.itemReference,
        this.strength,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Medication_Ingredient#itemReference() itemReference} attribute.
   * @param value The value for itemReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedication_Ingredient withItemReference(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "itemReference");
    if (this.itemReference == newValue) return this;
    return new ImmutableMedication_Ingredient(
        this.extension,
        this.isActive,
        this.itemCodeableConcept,
        this.id,
        newValue,
        this.strength,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Medication_Ingredient#itemReference() itemReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for itemReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedication_Ingredient withItemReference(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.itemReference == value) return this;
    return new ImmutableMedication_Ingredient(
        this.extension,
        this.isActive,
        this.itemCodeableConcept,
        this.id,
        value,
        this.strength,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Medication_Ingredient#strength() strength} attribute.
   * @param value The value for strength
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedication_Ingredient withStrength(Ratio value) {
    @Nullable Ratio newValue = Objects.requireNonNull(value, "strength");
    if (this.strength == newValue) return this;
    return new ImmutableMedication_Ingredient(
        this.extension,
        this.isActive,
        this.itemCodeableConcept,
        this.id,
        this.itemReference,
        newValue,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Medication_Ingredient#strength() strength} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for strength
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedication_Ingredient withStrength(Optional<? extends Ratio> optional) {
    @Nullable Ratio value = optional.orElse(null);
    if (this.strength == value) return this;
    return new ImmutableMedication_Ingredient(
        this.extension,
        this.isActive,
        this.itemCodeableConcept,
        this.id,
        this.itemReference,
        value,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Medication_Ingredient#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedication_Ingredient withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableMedication_Ingredient(
        this.extension,
        this.isActive,
        this.itemCodeableConcept,
        this.id,
        this.itemReference,
        this.strength,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Medication_Ingredient#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedication_Ingredient withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableMedication_Ingredient(
        this.extension,
        this.isActive,
        this.itemCodeableConcept,
        this.id,
        this.itemReference,
        this.strength,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableMedication_Ingredient} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableMedication_Ingredient
        && equalTo((ImmutableMedication_Ingredient) another);
  }

  private boolean equalTo(ImmutableMedication_Ingredient another) {
    return Objects.equals(extension, another.extension)
        && Objects.equals(isActive, another.isActive)
        && Objects.equals(itemCodeableConcept, another.itemCodeableConcept)
        && Objects.equals(id, another.id)
        && Objects.equals(itemReference, another.itemReference)
        && Objects.equals(strength, another.strength)
        && Objects.equals(modifierExtension, another.modifierExtension);
  }

  /**
   * Computes a hash code from attributes: {@code extension}, {@code isActive}, {@code itemCodeableConcept}, {@code id}, {@code itemReference}, {@code strength}, {@code modifierExtension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(isActive);
    h += (h << 5) + Objects.hashCode(itemCodeableConcept);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(itemReference);
    h += (h << 5) + Objects.hashCode(strength);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    return h;
  }

  /**
   * Prints the immutable value {@code Medication_Ingredient} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Medication_Ingredient{");
    if (extension != null) {
      builder.append("extension=").append(extension);
    }
    if (isActive != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("isActive=").append(isActive);
    }
    if (itemCodeableConcept != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("itemCodeableConcept=").append(itemCodeableConcept);
    }
    if (id != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (itemReference != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("itemReference=").append(itemReference);
    }
    if (strength != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("strength=").append(strength);
    }
    if (modifierExtension != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "Medication_Ingredient", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Medication_Ingredient {
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<Boolean> isActive = Optional.empty();
    boolean isActiveIsSet;
    @Nullable Optional<CodeableConcept> itemCodeableConcept = Optional.empty();
    boolean itemCodeableConceptIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<Reference> itemReference = Optional.empty();
    boolean itemReferenceIsSet;
    @Nullable Optional<Ratio> strength = Optional.empty();
    boolean strengthIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
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
    @JsonProperty("itemCodeableConcept")
    public void setItemCodeableConcept(Optional<CodeableConcept> itemCodeableConcept) {
      this.itemCodeableConcept = itemCodeableConcept;
      this.itemCodeableConceptIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("itemReference")
    public void setItemReference(Optional<Reference> itemReference) {
      this.itemReference = itemReference;
      this.itemReferenceIsSet = true;
    }
    @JsonProperty("strength")
    public void setStrength(Optional<Ratio> strength) {
      this.strength = strength;
      this.strengthIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> isActive() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> itemCodeableConcept() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> itemReference() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Ratio> strength() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableMedication_Ingredient fromJson(Json json) {
    ImmutableMedication_Ingredient.Builder builder = ImmutableMedication_Ingredient.builder();
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.isActiveIsSet) {
      builder.isActive(json.isActive);
    }
    if (json.itemCodeableConceptIsSet) {
      builder.itemCodeableConcept(json.itemCodeableConcept);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.itemReferenceIsSet) {
      builder.itemReference(json.itemReference);
    }
    if (json.strengthIsSet) {
      builder.strength(json.strength);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    return (ImmutableMedication_Ingredient) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Medication_Ingredient} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Medication_Ingredient instance
   */
  public static Medication_Ingredient copyOf(Medication_Ingredient instance) {
    if (instance instanceof ImmutableMedication_Ingredient) {
      return (ImmutableMedication_Ingredient) instance;
    }
    return ImmutableMedication_Ingredient.builder()
        .extension(instance.extension())
        .isActive(instance.isActive())
        .itemCodeableConcept(instance.itemCodeableConcept())
        .id(instance.id())
        .itemReference(instance.itemReference())
        .strength(instance.strength())
        .modifierExtension(instance.modifierExtension())
        .build();
  }

  /**
   * Creates a builder for {@link Medication_Ingredient Medication_Ingredient}.
   * <pre>
   * ImmutableMedication_Ingredient.builder()
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link Medication_Ingredient#extension() extension}
   *    .isActive(Boolean) // optional {@link Medication_Ingredient#isActive() isActive}
   *    .itemCodeableConcept(com.fhir.types.fhir.CodeableConcept) // optional {@link Medication_Ingredient#itemCodeableConcept() itemCodeableConcept}
   *    .id(String) // optional {@link Medication_Ingredient#id() id}
   *    .itemReference(com.fhir.types.fhir.Reference) // optional {@link Medication_Ingredient#itemReference() itemReference}
   *    .strength(com.fhir.types.fhir.Ratio) // optional {@link Medication_Ingredient#strength() strength}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link Medication_Ingredient#modifierExtension() modifierExtension}
   *    .build();
   * </pre>
   * @return A new Medication_Ingredient builder
   */
  public static ImmutableMedication_Ingredient.Builder builder() {
    return new ImmutableMedication_Ingredient.Builder();
  }

  /**
   * Builds instances of type {@link Medication_Ingredient Medication_Ingredient}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Medication_Ingredient", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_EXTENSION = 0x1L;
    private static final long OPT_BIT_IS_ACTIVE = 0x2L;
    private static final long OPT_BIT_ITEM_CODEABLE_CONCEPT = 0x4L;
    private static final long OPT_BIT_ID = 0x8L;
    private static final long OPT_BIT_ITEM_REFERENCE = 0x10L;
    private static final long OPT_BIT_STRENGTH = 0x20L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x40L;
    private long optBits;

    private @Nullable List<Extension> extension;
    private @Nullable Boolean isActive;
    private @Nullable CodeableConcept itemCodeableConcept;
    private @Nullable String id;
    private @Nullable Reference itemReference;
    private @Nullable Ratio strength;
    private @Nullable List<Extension> modifierExtension;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Medication_Ingredient#extension() extension} to extension.
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
     * Initializes the optional value {@link Medication_Ingredient#extension() extension} to extension.
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
     * Initializes the optional value {@link Medication_Ingredient#isActive() isActive} to isActive.
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
     * Initializes the optional value {@link Medication_Ingredient#isActive() isActive} to isActive.
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
     * Initializes the optional value {@link Medication_Ingredient#itemCodeableConcept() itemCodeableConcept} to itemCodeableConcept.
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
     * Initializes the optional value {@link Medication_Ingredient#itemCodeableConcept() itemCodeableConcept} to itemCodeableConcept.
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
     * Initializes the optional value {@link Medication_Ingredient#id() id} to id.
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
     * Initializes the optional value {@link Medication_Ingredient#id() id} to id.
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
     * Initializes the optional value {@link Medication_Ingredient#itemReference() itemReference} to itemReference.
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
     * Initializes the optional value {@link Medication_Ingredient#itemReference() itemReference} to itemReference.
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
     * Initializes the optional value {@link Medication_Ingredient#strength() strength} to strength.
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
     * Initializes the optional value {@link Medication_Ingredient#strength() strength} to strength.
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
     * Initializes the optional value {@link Medication_Ingredient#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Medication_Ingredient#modifierExtension() modifierExtension} to modifierExtension.
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
     * Builds a new {@link Medication_Ingredient Medication_Ingredient}.
     * @return An immutable instance of Medication_Ingredient
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Medication_Ingredient build() {
      return new ImmutableMedication_Ingredient(extension, isActive, itemCodeableConcept, id, itemReference, strength, modifierExtension);
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean isActiveIsSet() {
      return (optBits & OPT_BIT_IS_ACTIVE) != 0;
    }

    private boolean itemCodeableConceptIsSet() {
      return (optBits & OPT_BIT_ITEM_CODEABLE_CONCEPT) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean itemReferenceIsSet() {
      return (optBits & OPT_BIT_ITEM_REFERENCE) != 0;
    }

    private boolean strengthIsSet() {
      return (optBits & OPT_BIT_STRENGTH) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Medication_Ingredient is strict, attribute is already set: ".concat(name));
    }
  }
}
