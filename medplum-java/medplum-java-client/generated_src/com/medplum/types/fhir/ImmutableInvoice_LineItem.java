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
 * Immutable implementation of {@link Invoice_LineItem}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableInvoice_LineItem.builder()}.
 */
@Generated(from = "Invoice_LineItem", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableInvoice_LineItem implements Invoice_LineItem {
  private final @Nullable CodeableConcept chargeItemCodeableConcept;
  private final @Nullable String id;
  private final @Nullable List<Extension> extension;
  private final @Nullable PositiveInt sequence;
  private final @Nullable Reference chargeItemReference;
  private final @Nullable List<Invoice_PriceComponent> priceComponent;
  private final @Nullable List<Extension> modifierExtension;

  private ImmutableInvoice_LineItem(
      @Nullable CodeableConcept chargeItemCodeableConcept,
      @Nullable String id,
      @Nullable List<Extension> extension,
      @Nullable PositiveInt sequence,
      @Nullable Reference chargeItemReference,
      @Nullable List<Invoice_PriceComponent> priceComponent,
      @Nullable List<Extension> modifierExtension) {
    this.chargeItemCodeableConcept = chargeItemCodeableConcept;
    this.id = id;
    this.extension = extension;
    this.sequence = sequence;
    this.chargeItemReference = chargeItemReference;
    this.priceComponent = priceComponent;
    this.modifierExtension = modifierExtension;
  }

  /**
   * @return The value of the {@code chargeItemCodeableConcept} attribute
   */
  @JsonProperty("chargeItemCodeableConcept")
  @Override
  public Optional<CodeableConcept> chargeItemCodeableConcept() {
    return Optional.ofNullable(chargeItemCodeableConcept);
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
   * @return The value of the {@code sequence} attribute
   */
  @JsonProperty("sequence")
  @Override
  public Optional<PositiveInt> sequence() {
    return Optional.ofNullable(sequence);
  }

  /**
   * @return The value of the {@code chargeItemReference} attribute
   */
  @JsonProperty("chargeItemReference")
  @Override
  public Optional<Reference> chargeItemReference() {
    return Optional.ofNullable(chargeItemReference);
  }

  /**
   * @return The value of the {@code priceComponent} attribute
   */
  @JsonProperty("priceComponent")
  @Override
  public Optional<List<Invoice_PriceComponent>> priceComponent() {
    return Optional.ofNullable(priceComponent);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Invoice_LineItem#chargeItemCodeableConcept() chargeItemCodeableConcept} attribute.
   * @param value The value for chargeItemCodeableConcept
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInvoice_LineItem withChargeItemCodeableConcept(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "chargeItemCodeableConcept");
    if (this.chargeItemCodeableConcept == newValue) return this;
    return new ImmutableInvoice_LineItem(
        newValue,
        this.id,
        this.extension,
        this.sequence,
        this.chargeItemReference,
        this.priceComponent,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Invoice_LineItem#chargeItemCodeableConcept() chargeItemCodeableConcept} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for chargeItemCodeableConcept
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInvoice_LineItem withChargeItemCodeableConcept(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.chargeItemCodeableConcept == value) return this;
    return new ImmutableInvoice_LineItem(
        value,
        this.id,
        this.extension,
        this.sequence,
        this.chargeItemReference,
        this.priceComponent,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Invoice_LineItem#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInvoice_LineItem withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableInvoice_LineItem(
        this.chargeItemCodeableConcept,
        newValue,
        this.extension,
        this.sequence,
        this.chargeItemReference,
        this.priceComponent,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Invoice_LineItem#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInvoice_LineItem withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableInvoice_LineItem(
        this.chargeItemCodeableConcept,
        value,
        this.extension,
        this.sequence,
        this.chargeItemReference,
        this.priceComponent,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Invoice_LineItem#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInvoice_LineItem withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableInvoice_LineItem(
        this.chargeItemCodeableConcept,
        this.id,
        newValue,
        this.sequence,
        this.chargeItemReference,
        this.priceComponent,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Invoice_LineItem#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInvoice_LineItem withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableInvoice_LineItem(
        this.chargeItemCodeableConcept,
        this.id,
        value,
        this.sequence,
        this.chargeItemReference,
        this.priceComponent,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Invoice_LineItem#sequence() sequence} attribute.
   * @param value The value for sequence
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInvoice_LineItem withSequence(PositiveInt value) {
    @Nullable PositiveInt newValue = Objects.requireNonNull(value, "sequence");
    if (this.sequence == newValue) return this;
    return new ImmutableInvoice_LineItem(
        this.chargeItemCodeableConcept,
        this.id,
        this.extension,
        newValue,
        this.chargeItemReference,
        this.priceComponent,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Invoice_LineItem#sequence() sequence} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for sequence
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInvoice_LineItem withSequence(Optional<? extends PositiveInt> optional) {
    @Nullable PositiveInt value = optional.orElse(null);
    if (this.sequence == value) return this;
    return new ImmutableInvoice_LineItem(
        this.chargeItemCodeableConcept,
        this.id,
        this.extension,
        value,
        this.chargeItemReference,
        this.priceComponent,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Invoice_LineItem#chargeItemReference() chargeItemReference} attribute.
   * @param value The value for chargeItemReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInvoice_LineItem withChargeItemReference(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "chargeItemReference");
    if (this.chargeItemReference == newValue) return this;
    return new ImmutableInvoice_LineItem(
        this.chargeItemCodeableConcept,
        this.id,
        this.extension,
        this.sequence,
        newValue,
        this.priceComponent,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Invoice_LineItem#chargeItemReference() chargeItemReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for chargeItemReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInvoice_LineItem withChargeItemReference(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.chargeItemReference == value) return this;
    return new ImmutableInvoice_LineItem(
        this.chargeItemCodeableConcept,
        this.id,
        this.extension,
        this.sequence,
        value,
        this.priceComponent,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Invoice_LineItem#priceComponent() priceComponent} attribute.
   * @param value The value for priceComponent
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInvoice_LineItem withPriceComponent(List<Invoice_PriceComponent> value) {
    @Nullable List<Invoice_PriceComponent> newValue = Objects.requireNonNull(value, "priceComponent");
    if (this.priceComponent == newValue) return this;
    return new ImmutableInvoice_LineItem(
        this.chargeItemCodeableConcept,
        this.id,
        this.extension,
        this.sequence,
        this.chargeItemReference,
        newValue,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Invoice_LineItem#priceComponent() priceComponent} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for priceComponent
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInvoice_LineItem withPriceComponent(Optional<? extends List<Invoice_PriceComponent>> optional) {
    @Nullable List<Invoice_PriceComponent> value = optional.orElse(null);
    if (this.priceComponent == value) return this;
    return new ImmutableInvoice_LineItem(
        this.chargeItemCodeableConcept,
        this.id,
        this.extension,
        this.sequence,
        this.chargeItemReference,
        value,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Invoice_LineItem#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInvoice_LineItem withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableInvoice_LineItem(
        this.chargeItemCodeableConcept,
        this.id,
        this.extension,
        this.sequence,
        this.chargeItemReference,
        this.priceComponent,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Invoice_LineItem#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInvoice_LineItem withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableInvoice_LineItem(
        this.chargeItemCodeableConcept,
        this.id,
        this.extension,
        this.sequence,
        this.chargeItemReference,
        this.priceComponent,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableInvoice_LineItem} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableInvoice_LineItem
        && equalTo((ImmutableInvoice_LineItem) another);
  }

  private boolean equalTo(ImmutableInvoice_LineItem another) {
    return Objects.equals(chargeItemCodeableConcept, another.chargeItemCodeableConcept)
        && Objects.equals(id, another.id)
        && Objects.equals(extension, another.extension)
        && Objects.equals(sequence, another.sequence)
        && Objects.equals(chargeItemReference, another.chargeItemReference)
        && Objects.equals(priceComponent, another.priceComponent)
        && Objects.equals(modifierExtension, another.modifierExtension);
  }

  /**
   * Computes a hash code from attributes: {@code chargeItemCodeableConcept}, {@code id}, {@code extension}, {@code sequence}, {@code chargeItemReference}, {@code priceComponent}, {@code modifierExtension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(chargeItemCodeableConcept);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(sequence);
    h += (h << 5) + Objects.hashCode(chargeItemReference);
    h += (h << 5) + Objects.hashCode(priceComponent);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    return h;
  }

  /**
   * Prints the immutable value {@code Invoice_LineItem} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Invoice_LineItem{");
    if (chargeItemCodeableConcept != null) {
      builder.append("chargeItemCodeableConcept=").append(chargeItemCodeableConcept);
    }
    if (id != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (extension != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (sequence != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("sequence=").append(sequence);
    }
    if (chargeItemReference != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("chargeItemReference=").append(chargeItemReference);
    }
    if (priceComponent != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("priceComponent=").append(priceComponent);
    }
    if (modifierExtension != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "Invoice_LineItem", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Invoice_LineItem {
    @Nullable Optional<CodeableConcept> chargeItemCodeableConcept = Optional.empty();
    boolean chargeItemCodeableConceptIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<PositiveInt> sequence = Optional.empty();
    boolean sequenceIsSet;
    @Nullable Optional<Reference> chargeItemReference = Optional.empty();
    boolean chargeItemReferenceIsSet;
    @Nullable Optional<List<Invoice_PriceComponent>> priceComponent = Optional.empty();
    boolean priceComponentIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @JsonProperty("chargeItemCodeableConcept")
    public void setChargeItemCodeableConcept(Optional<CodeableConcept> chargeItemCodeableConcept) {
      this.chargeItemCodeableConcept = chargeItemCodeableConcept;
      this.chargeItemCodeableConceptIsSet = true;
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
    @JsonProperty("sequence")
    public void setSequence(Optional<PositiveInt> sequence) {
      this.sequence = sequence;
      this.sequenceIsSet = true;
    }
    @JsonProperty("chargeItemReference")
    public void setChargeItemReference(Optional<Reference> chargeItemReference) {
      this.chargeItemReference = chargeItemReference;
      this.chargeItemReferenceIsSet = true;
    }
    @JsonProperty("priceComponent")
    public void setPriceComponent(Optional<List<Invoice_PriceComponent>> priceComponent) {
      this.priceComponent = priceComponent;
      this.priceComponentIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @Override
    public Optional<CodeableConcept> chargeItemCodeableConcept() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<PositiveInt> sequence() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> chargeItemReference() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Invoice_PriceComponent>> priceComponent() { throw new UnsupportedOperationException(); }
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
  static ImmutableInvoice_LineItem fromJson(Json json) {
    ImmutableInvoice_LineItem.Builder builder = ImmutableInvoice_LineItem.builder();
    if (json.chargeItemCodeableConceptIsSet) {
      builder.chargeItemCodeableConcept(json.chargeItemCodeableConcept);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.sequenceIsSet) {
      builder.sequence(json.sequence);
    }
    if (json.chargeItemReferenceIsSet) {
      builder.chargeItemReference(json.chargeItemReference);
    }
    if (json.priceComponentIsSet) {
      builder.priceComponent(json.priceComponent);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    return (ImmutableInvoice_LineItem) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Invoice_LineItem} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Invoice_LineItem instance
   */
  public static Invoice_LineItem copyOf(Invoice_LineItem instance) {
    if (instance instanceof ImmutableInvoice_LineItem) {
      return (ImmutableInvoice_LineItem) instance;
    }
    return ImmutableInvoice_LineItem.builder()
        .chargeItemCodeableConcept(instance.chargeItemCodeableConcept())
        .id(instance.id())
        .extension(instance.extension())
        .sequence(instance.sequence())
        .chargeItemReference(instance.chargeItemReference())
        .priceComponent(instance.priceComponent())
        .modifierExtension(instance.modifierExtension())
        .build();
  }

  /**
   * Creates a builder for {@link Invoice_LineItem Invoice_LineItem}.
   * <pre>
   * ImmutableInvoice_LineItem.builder()
   *    .chargeItemCodeableConcept(com.medplum.types.fhir.CodeableConcept) // optional {@link Invoice_LineItem#chargeItemCodeableConcept() chargeItemCodeableConcept}
   *    .id(String) // optional {@link Invoice_LineItem#id() id}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link Invoice_LineItem#extension() extension}
   *    .sequence(com.medplum.types.fhir.PositiveInt) // optional {@link Invoice_LineItem#sequence() sequence}
   *    .chargeItemReference(com.medplum.types.fhir.Reference) // optional {@link Invoice_LineItem#chargeItemReference() chargeItemReference}
   *    .priceComponent(List&amp;lt;com.medplum.types.fhir.Invoice_PriceComponent&amp;gt;) // optional {@link Invoice_LineItem#priceComponent() priceComponent}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link Invoice_LineItem#modifierExtension() modifierExtension}
   *    .build();
   * </pre>
   * @return A new Invoice_LineItem builder
   */
  public static ImmutableInvoice_LineItem.Builder builder() {
    return new ImmutableInvoice_LineItem.Builder();
  }

  /**
   * Builds instances of type {@link Invoice_LineItem Invoice_LineItem}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Invoice_LineItem", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_CHARGE_ITEM_CODEABLE_CONCEPT = 0x1L;
    private static final long OPT_BIT_ID = 0x2L;
    private static final long OPT_BIT_EXTENSION = 0x4L;
    private static final long OPT_BIT_SEQUENCE = 0x8L;
    private static final long OPT_BIT_CHARGE_ITEM_REFERENCE = 0x10L;
    private static final long OPT_BIT_PRICE_COMPONENT = 0x20L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x40L;
    private long optBits;

    private @Nullable CodeableConcept chargeItemCodeableConcept;
    private @Nullable String id;
    private @Nullable List<Extension> extension;
    private @Nullable PositiveInt sequence;
    private @Nullable Reference chargeItemReference;
    private @Nullable List<Invoice_PriceComponent> priceComponent;
    private @Nullable List<Extension> modifierExtension;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Invoice_LineItem#chargeItemCodeableConcept() chargeItemCodeableConcept} to chargeItemCodeableConcept.
     * @param chargeItemCodeableConcept The value for chargeItemCodeableConcept
     * @return {@code this} builder for chained invocation
     */
    public final Builder chargeItemCodeableConcept(CodeableConcept chargeItemCodeableConcept) {
      checkNotIsSet(chargeItemCodeableConceptIsSet(), "chargeItemCodeableConcept");
      this.chargeItemCodeableConcept = Objects.requireNonNull(chargeItemCodeableConcept, "chargeItemCodeableConcept");
      optBits |= OPT_BIT_CHARGE_ITEM_CODEABLE_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link Invoice_LineItem#chargeItemCodeableConcept() chargeItemCodeableConcept} to chargeItemCodeableConcept.
     * @param chargeItemCodeableConcept The value for chargeItemCodeableConcept
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("chargeItemCodeableConcept")
    public final Builder chargeItemCodeableConcept(Optional<? extends CodeableConcept> chargeItemCodeableConcept) {
      checkNotIsSet(chargeItemCodeableConceptIsSet(), "chargeItemCodeableConcept");
      this.chargeItemCodeableConcept = chargeItemCodeableConcept.orElse(null);
      optBits |= OPT_BIT_CHARGE_ITEM_CODEABLE_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link Invoice_LineItem#id() id} to id.
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
     * Initializes the optional value {@link Invoice_LineItem#id() id} to id.
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
     * Initializes the optional value {@link Invoice_LineItem#extension() extension} to extension.
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
     * Initializes the optional value {@link Invoice_LineItem#extension() extension} to extension.
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
     * Initializes the optional value {@link Invoice_LineItem#sequence() sequence} to sequence.
     * @param sequence The value for sequence
     * @return {@code this} builder for chained invocation
     */
    public final Builder sequence(PositiveInt sequence) {
      checkNotIsSet(sequenceIsSet(), "sequence");
      this.sequence = Objects.requireNonNull(sequence, "sequence");
      optBits |= OPT_BIT_SEQUENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Invoice_LineItem#sequence() sequence} to sequence.
     * @param sequence The value for sequence
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("sequence")
    public final Builder sequence(Optional<? extends PositiveInt> sequence) {
      checkNotIsSet(sequenceIsSet(), "sequence");
      this.sequence = sequence.orElse(null);
      optBits |= OPT_BIT_SEQUENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Invoice_LineItem#chargeItemReference() chargeItemReference} to chargeItemReference.
     * @param chargeItemReference The value for chargeItemReference
     * @return {@code this} builder for chained invocation
     */
    public final Builder chargeItemReference(Reference chargeItemReference) {
      checkNotIsSet(chargeItemReferenceIsSet(), "chargeItemReference");
      this.chargeItemReference = Objects.requireNonNull(chargeItemReference, "chargeItemReference");
      optBits |= OPT_BIT_CHARGE_ITEM_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Invoice_LineItem#chargeItemReference() chargeItemReference} to chargeItemReference.
     * @param chargeItemReference The value for chargeItemReference
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("chargeItemReference")
    public final Builder chargeItemReference(Optional<? extends Reference> chargeItemReference) {
      checkNotIsSet(chargeItemReferenceIsSet(), "chargeItemReference");
      this.chargeItemReference = chargeItemReference.orElse(null);
      optBits |= OPT_BIT_CHARGE_ITEM_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Invoice_LineItem#priceComponent() priceComponent} to priceComponent.
     * @param priceComponent The value for priceComponent
     * @return {@code this} builder for chained invocation
     */
    public final Builder priceComponent(List<Invoice_PriceComponent> priceComponent) {
      checkNotIsSet(priceComponentIsSet(), "priceComponent");
      this.priceComponent = Objects.requireNonNull(priceComponent, "priceComponent");
      optBits |= OPT_BIT_PRICE_COMPONENT;
      return this;
    }

    /**
     * Initializes the optional value {@link Invoice_LineItem#priceComponent() priceComponent} to priceComponent.
     * @param priceComponent The value for priceComponent
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("priceComponent")
    public final Builder priceComponent(Optional<? extends List<Invoice_PriceComponent>> priceComponent) {
      checkNotIsSet(priceComponentIsSet(), "priceComponent");
      this.priceComponent = priceComponent.orElse(null);
      optBits |= OPT_BIT_PRICE_COMPONENT;
      return this;
    }

    /**
     * Initializes the optional value {@link Invoice_LineItem#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Invoice_LineItem#modifierExtension() modifierExtension} to modifierExtension.
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
     * Builds a new {@link Invoice_LineItem Invoice_LineItem}.
     * @return An immutable instance of Invoice_LineItem
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Invoice_LineItem build() {
      return new ImmutableInvoice_LineItem(
          chargeItemCodeableConcept,
          id,
          extension,
          sequence,
          chargeItemReference,
          priceComponent,
          modifierExtension);
    }

    private boolean chargeItemCodeableConceptIsSet() {
      return (optBits & OPT_BIT_CHARGE_ITEM_CODEABLE_CONCEPT) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean sequenceIsSet() {
      return (optBits & OPT_BIT_SEQUENCE) != 0;
    }

    private boolean chargeItemReferenceIsSet() {
      return (optBits & OPT_BIT_CHARGE_ITEM_REFERENCE) != 0;
    }

    private boolean priceComponentIsSet() {
      return (optBits & OPT_BIT_PRICE_COMPONENT) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Invoice_LineItem is strict, attribute is already set: ".concat(name));
    }
  }
}
