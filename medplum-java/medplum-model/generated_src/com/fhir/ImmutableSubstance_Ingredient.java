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
 * Immutable implementation of {@link Substance_Ingredient}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableSubstance_Ingredient.builder()}.
 */
@Generated(from = "Substance_Ingredient", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableSubstance_Ingredient implements Substance_Ingredient {
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable Reference substanceReference;
  private final @Nullable CodeableConcept substanceCodeableConcept;
  private final @Nullable List<Extension> extension;
  private final @Nullable Ratio quantity;
  private final @Nullable String id;

  private ImmutableSubstance_Ingredient(
      @Nullable List<Extension> modifierExtension,
      @Nullable Reference substanceReference,
      @Nullable CodeableConcept substanceCodeableConcept,
      @Nullable List<Extension> extension,
      @Nullable Ratio quantity,
      @Nullable String id) {
    this.modifierExtension = modifierExtension;
    this.substanceReference = substanceReference;
    this.substanceCodeableConcept = substanceCodeableConcept;
    this.extension = extension;
    this.quantity = quantity;
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
   * @return The value of the {@code substanceReference} attribute
   */
  @JsonProperty("substanceReference")
  @Override
  public Optional<Reference> substanceReference() {
    return Optional.ofNullable(substanceReference);
  }

  /**
   * @return The value of the {@code substanceCodeableConcept} attribute
   */
  @JsonProperty("substanceCodeableConcept")
  @Override
  public Optional<CodeableConcept> substanceCodeableConcept() {
    return Optional.ofNullable(substanceCodeableConcept);
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
   * @return The value of the {@code quantity} attribute
   */
  @JsonProperty("quantity")
  @Override
  public Optional<Ratio> quantity() {
    return Optional.ofNullable(quantity);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Substance_Ingredient#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstance_Ingredient withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableSubstance_Ingredient(
        newValue,
        this.substanceReference,
        this.substanceCodeableConcept,
        this.extension,
        this.quantity,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Substance_Ingredient#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstance_Ingredient withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableSubstance_Ingredient(
        value,
        this.substanceReference,
        this.substanceCodeableConcept,
        this.extension,
        this.quantity,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Substance_Ingredient#substanceReference() substanceReference} attribute.
   * @param value The value for substanceReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstance_Ingredient withSubstanceReference(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "substanceReference");
    if (this.substanceReference == newValue) return this;
    return new ImmutableSubstance_Ingredient(
        this.modifierExtension,
        newValue,
        this.substanceCodeableConcept,
        this.extension,
        this.quantity,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Substance_Ingredient#substanceReference() substanceReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for substanceReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstance_Ingredient withSubstanceReference(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.substanceReference == value) return this;
    return new ImmutableSubstance_Ingredient(
        this.modifierExtension,
        value,
        this.substanceCodeableConcept,
        this.extension,
        this.quantity,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Substance_Ingredient#substanceCodeableConcept() substanceCodeableConcept} attribute.
   * @param value The value for substanceCodeableConcept
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstance_Ingredient withSubstanceCodeableConcept(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "substanceCodeableConcept");
    if (this.substanceCodeableConcept == newValue) return this;
    return new ImmutableSubstance_Ingredient(
        this.modifierExtension,
        this.substanceReference,
        newValue,
        this.extension,
        this.quantity,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Substance_Ingredient#substanceCodeableConcept() substanceCodeableConcept} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for substanceCodeableConcept
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstance_Ingredient withSubstanceCodeableConcept(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.substanceCodeableConcept == value) return this;
    return new ImmutableSubstance_Ingredient(this.modifierExtension, this.substanceReference, value, this.extension, this.quantity, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Substance_Ingredient#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstance_Ingredient withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableSubstance_Ingredient(
        this.modifierExtension,
        this.substanceReference,
        this.substanceCodeableConcept,
        newValue,
        this.quantity,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Substance_Ingredient#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstance_Ingredient withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableSubstance_Ingredient(
        this.modifierExtension,
        this.substanceReference,
        this.substanceCodeableConcept,
        value,
        this.quantity,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Substance_Ingredient#quantity() quantity} attribute.
   * @param value The value for quantity
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstance_Ingredient withQuantity(Ratio value) {
    @Nullable Ratio newValue = Objects.requireNonNull(value, "quantity");
    if (this.quantity == newValue) return this;
    return new ImmutableSubstance_Ingredient(
        this.modifierExtension,
        this.substanceReference,
        this.substanceCodeableConcept,
        this.extension,
        newValue,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Substance_Ingredient#quantity() quantity} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for quantity
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstance_Ingredient withQuantity(Optional<? extends Ratio> optional) {
    @Nullable Ratio value = optional.orElse(null);
    if (this.quantity == value) return this;
    return new ImmutableSubstance_Ingredient(
        this.modifierExtension,
        this.substanceReference,
        this.substanceCodeableConcept,
        this.extension,
        value,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Substance_Ingredient#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstance_Ingredient withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableSubstance_Ingredient(
        this.modifierExtension,
        this.substanceReference,
        this.substanceCodeableConcept,
        this.extension,
        this.quantity,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Substance_Ingredient#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstance_Ingredient withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableSubstance_Ingredient(
        this.modifierExtension,
        this.substanceReference,
        this.substanceCodeableConcept,
        this.extension,
        this.quantity,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableSubstance_Ingredient} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableSubstance_Ingredient
        && equalTo((ImmutableSubstance_Ingredient) another);
  }

  private boolean equalTo(ImmutableSubstance_Ingredient another) {
    return Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(substanceReference, another.substanceReference)
        && Objects.equals(substanceCodeableConcept, another.substanceCodeableConcept)
        && Objects.equals(extension, another.extension)
        && Objects.equals(quantity, another.quantity)
        && Objects.equals(id, another.id);
  }

  /**
   * Computes a hash code from attributes: {@code modifierExtension}, {@code substanceReference}, {@code substanceCodeableConcept}, {@code extension}, {@code quantity}, {@code id}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(substanceReference);
    h += (h << 5) + Objects.hashCode(substanceCodeableConcept);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(quantity);
    h += (h << 5) + Objects.hashCode(id);
    return h;
  }

  /**
   * Prints the immutable value {@code Substance_Ingredient} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Substance_Ingredient{");
    if (modifierExtension != null) {
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (substanceReference != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("substanceReference=").append(substanceReference);
    }
    if (substanceCodeableConcept != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("substanceCodeableConcept=").append(substanceCodeableConcept);
    }
    if (extension != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (quantity != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("quantity=").append(quantity);
    }
    if (id != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("id=").append(id);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "Substance_Ingredient", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Substance_Ingredient {
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<Reference> substanceReference = Optional.empty();
    boolean substanceReferenceIsSet;
    @Nullable Optional<CodeableConcept> substanceCodeableConcept = Optional.empty();
    boolean substanceCodeableConceptIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<Ratio> quantity = Optional.empty();
    boolean quantityIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("substanceReference")
    public void setSubstanceReference(Optional<Reference> substanceReference) {
      this.substanceReference = substanceReference;
      this.substanceReferenceIsSet = true;
    }
    @JsonProperty("substanceCodeableConcept")
    public void setSubstanceCodeableConcept(Optional<CodeableConcept> substanceCodeableConcept) {
      this.substanceCodeableConcept = substanceCodeableConcept;
      this.substanceCodeableConceptIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("quantity")
    public void setQuantity(Optional<Ratio> quantity) {
      this.quantity = quantity;
      this.quantityIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> substanceReference() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> substanceCodeableConcept() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Ratio> quantity() { throw new UnsupportedOperationException(); }
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
  static ImmutableSubstance_Ingredient fromJson(Json json) {
    ImmutableSubstance_Ingredient.Builder builder = ImmutableSubstance_Ingredient.builder();
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.substanceReferenceIsSet) {
      builder.substanceReference(json.substanceReference);
    }
    if (json.substanceCodeableConceptIsSet) {
      builder.substanceCodeableConcept(json.substanceCodeableConcept);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.quantityIsSet) {
      builder.quantity(json.quantity);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    return (ImmutableSubstance_Ingredient) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Substance_Ingredient} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Substance_Ingredient instance
   */
  public static Substance_Ingredient copyOf(Substance_Ingredient instance) {
    if (instance instanceof ImmutableSubstance_Ingredient) {
      return (ImmutableSubstance_Ingredient) instance;
    }
    return ImmutableSubstance_Ingredient.builder()
        .modifierExtension(instance.modifierExtension())
        .substanceReference(instance.substanceReference())
        .substanceCodeableConcept(instance.substanceCodeableConcept())
        .extension(instance.extension())
        .quantity(instance.quantity())
        .id(instance.id())
        .build();
  }

  /**
   * Creates a builder for {@link Substance_Ingredient Substance_Ingredient}.
   * <pre>
   * ImmutableSubstance_Ingredient.builder()
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Substance_Ingredient#modifierExtension() modifierExtension}
   *    .substanceReference(com.fhir.Reference) // optional {@link Substance_Ingredient#substanceReference() substanceReference}
   *    .substanceCodeableConcept(com.fhir.CodeableConcept) // optional {@link Substance_Ingredient#substanceCodeableConcept() substanceCodeableConcept}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Substance_Ingredient#extension() extension}
   *    .quantity(com.fhir.Ratio) // optional {@link Substance_Ingredient#quantity() quantity}
   *    .id(String) // optional {@link Substance_Ingredient#id() id}
   *    .build();
   * </pre>
   * @return A new Substance_Ingredient builder
   */
  public static ImmutableSubstance_Ingredient.Builder builder() {
    return new ImmutableSubstance_Ingredient.Builder();
  }

  /**
   * Builds instances of type {@link Substance_Ingredient Substance_Ingredient}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Substance_Ingredient", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x1L;
    private static final long OPT_BIT_SUBSTANCE_REFERENCE = 0x2L;
    private static final long OPT_BIT_SUBSTANCE_CODEABLE_CONCEPT = 0x4L;
    private static final long OPT_BIT_EXTENSION = 0x8L;
    private static final long OPT_BIT_QUANTITY = 0x10L;
    private static final long OPT_BIT_ID = 0x20L;
    private long optBits;

    private @Nullable List<Extension> modifierExtension;
    private @Nullable Reference substanceReference;
    private @Nullable CodeableConcept substanceCodeableConcept;
    private @Nullable List<Extension> extension;
    private @Nullable Ratio quantity;
    private @Nullable String id;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Substance_Ingredient#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Substance_Ingredient#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Substance_Ingredient#substanceReference() substanceReference} to substanceReference.
     * @param substanceReference The value for substanceReference
     * @return {@code this} builder for chained invocation
     */
    public final Builder substanceReference(Reference substanceReference) {
      checkNotIsSet(substanceReferenceIsSet(), "substanceReference");
      this.substanceReference = Objects.requireNonNull(substanceReference, "substanceReference");
      optBits |= OPT_BIT_SUBSTANCE_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Substance_Ingredient#substanceReference() substanceReference} to substanceReference.
     * @param substanceReference The value for substanceReference
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("substanceReference")
    public final Builder substanceReference(Optional<? extends Reference> substanceReference) {
      checkNotIsSet(substanceReferenceIsSet(), "substanceReference");
      this.substanceReference = substanceReference.orElse(null);
      optBits |= OPT_BIT_SUBSTANCE_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Substance_Ingredient#substanceCodeableConcept() substanceCodeableConcept} to substanceCodeableConcept.
     * @param substanceCodeableConcept The value for substanceCodeableConcept
     * @return {@code this} builder for chained invocation
     */
    public final Builder substanceCodeableConcept(CodeableConcept substanceCodeableConcept) {
      checkNotIsSet(substanceCodeableConceptIsSet(), "substanceCodeableConcept");
      this.substanceCodeableConcept = Objects.requireNonNull(substanceCodeableConcept, "substanceCodeableConcept");
      optBits |= OPT_BIT_SUBSTANCE_CODEABLE_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link Substance_Ingredient#substanceCodeableConcept() substanceCodeableConcept} to substanceCodeableConcept.
     * @param substanceCodeableConcept The value for substanceCodeableConcept
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("substanceCodeableConcept")
    public final Builder substanceCodeableConcept(Optional<? extends CodeableConcept> substanceCodeableConcept) {
      checkNotIsSet(substanceCodeableConceptIsSet(), "substanceCodeableConcept");
      this.substanceCodeableConcept = substanceCodeableConcept.orElse(null);
      optBits |= OPT_BIT_SUBSTANCE_CODEABLE_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link Substance_Ingredient#extension() extension} to extension.
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
     * Initializes the optional value {@link Substance_Ingredient#extension() extension} to extension.
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
     * Initializes the optional value {@link Substance_Ingredient#quantity() quantity} to quantity.
     * @param quantity The value for quantity
     * @return {@code this} builder for chained invocation
     */
    public final Builder quantity(Ratio quantity) {
      checkNotIsSet(quantityIsSet(), "quantity");
      this.quantity = Objects.requireNonNull(quantity, "quantity");
      optBits |= OPT_BIT_QUANTITY;
      return this;
    }

    /**
     * Initializes the optional value {@link Substance_Ingredient#quantity() quantity} to quantity.
     * @param quantity The value for quantity
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("quantity")
    public final Builder quantity(Optional<? extends Ratio> quantity) {
      checkNotIsSet(quantityIsSet(), "quantity");
      this.quantity = quantity.orElse(null);
      optBits |= OPT_BIT_QUANTITY;
      return this;
    }

    /**
     * Initializes the optional value {@link Substance_Ingredient#id() id} to id.
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
     * Initializes the optional value {@link Substance_Ingredient#id() id} to id.
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
     * Builds a new {@link Substance_Ingredient Substance_Ingredient}.
     * @return An immutable instance of Substance_Ingredient
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Substance_Ingredient build() {
      return new ImmutableSubstance_Ingredient(modifierExtension, substanceReference, substanceCodeableConcept, extension, quantity, id);
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean substanceReferenceIsSet() {
      return (optBits & OPT_BIT_SUBSTANCE_REFERENCE) != 0;
    }

    private boolean substanceCodeableConceptIsSet() {
      return (optBits & OPT_BIT_SUBSTANCE_CODEABLE_CONCEPT) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean quantityIsSet() {
      return (optBits & OPT_BIT_QUANTITY) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Substance_Ingredient is strict, attribute is already set: ".concat(name));
    }
  }
}
