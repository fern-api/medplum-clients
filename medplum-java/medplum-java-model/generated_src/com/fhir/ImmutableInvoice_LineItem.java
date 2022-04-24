//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link Invoice_LineItem}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableInvoice_LineItem.builder()}.
 */
@org.immutables.value.Generated(from = "Invoice_LineItem", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableInvoice_LineItem implements com.fhir.Invoice_LineItem {
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable com.fhir.Reference chargeItemReference;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Invoice_PriceComponent> priceComponent;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept chargeItemCodeableConcept;
  private final @javax.annotation.Nullable java.lang.String id;
  private final @javax.annotation.Nullable com.fhir.positiveInt sequence;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;

  private ImmutableInvoice_LineItem(
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable com.fhir.Reference chargeItemReference,
      @javax.annotation.Nullable java.util.List<com.fhir.Invoice_PriceComponent> priceComponent,
      @javax.annotation.Nullable com.fhir.CodeableConcept chargeItemCodeableConcept,
      @javax.annotation.Nullable java.lang.String id,
      @javax.annotation.Nullable com.fhir.positiveInt sequence,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension) {
    this.extension = extension;
    this.chargeItemReference = chargeItemReference;
    this.priceComponent = priceComponent;
    this.chargeItemCodeableConcept = chargeItemCodeableConcept;
    this.id = id;
    this.sequence = sequence;
    this.modifierExtension = modifierExtension;
  }

  /**
   * @return The value of the {@code extension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("extension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> extension() {
    return java.util.Optional.ofNullable(extension);
  }

  /**
   * @return The value of the {@code chargeItemReference} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("chargeItemReference")
  @Override
  public java.util.Optional<com.fhir.Reference> chargeItemReference() {
    return java.util.Optional.ofNullable(chargeItemReference);
  }

  /**
   * @return The value of the {@code priceComponent} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("priceComponent")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Invoice_PriceComponent>> priceComponent() {
    return java.util.Optional.ofNullable(priceComponent);
  }

  /**
   * @return The value of the {@code chargeItemCodeableConcept} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("chargeItemCodeableConcept")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> chargeItemCodeableConcept() {
    return java.util.Optional.ofNullable(chargeItemCodeableConcept);
  }

  /**
   * @return The value of the {@code id} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("id")
  @Override
  public java.util.Optional<java.lang.String> id() {
    return java.util.Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code sequence} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("sequence")
  @Override
  public java.util.Optional<com.fhir.positiveInt> sequence() {
    return java.util.Optional.ofNullable(sequence);
  }

  /**
   * @return The value of the {@code modifierExtension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() {
    return java.util.Optional.ofNullable(modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Invoice_LineItem#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInvoice_LineItem withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableInvoice_LineItem(
        newValue,
        this.chargeItemReference,
        this.priceComponent,
        this.chargeItemCodeableConcept,
        this.id,
        this.sequence,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Invoice_LineItem#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInvoice_LineItem withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableInvoice_LineItem(
        value,
        this.chargeItemReference,
        this.priceComponent,
        this.chargeItemCodeableConcept,
        this.id,
        this.sequence,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Invoice_LineItem#chargeItemReference() chargeItemReference} attribute.
   * @param value The value for chargeItemReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInvoice_LineItem withChargeItemReference(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "chargeItemReference");
    if (this.chargeItemReference == newValue) return this;
    return new ImmutableInvoice_LineItem(
        this.extension,
        newValue,
        this.priceComponent,
        this.chargeItemCodeableConcept,
        this.id,
        this.sequence,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Invoice_LineItem#chargeItemReference() chargeItemReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for chargeItemReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInvoice_LineItem withChargeItemReference(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.chargeItemReference == value) return this;
    return new ImmutableInvoice_LineItem(
        this.extension,
        value,
        this.priceComponent,
        this.chargeItemCodeableConcept,
        this.id,
        this.sequence,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Invoice_LineItem#priceComponent() priceComponent} attribute.
   * @param value The value for priceComponent
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInvoice_LineItem withPriceComponent(java.util.List<com.fhir.Invoice_PriceComponent> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Invoice_PriceComponent> newValue = java.util.Objects.requireNonNull(value, "priceComponent");
    if (this.priceComponent == newValue) return this;
    return new ImmutableInvoice_LineItem(
        this.extension,
        this.chargeItemReference,
        newValue,
        this.chargeItemCodeableConcept,
        this.id,
        this.sequence,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Invoice_LineItem#priceComponent() priceComponent} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for priceComponent
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInvoice_LineItem withPriceComponent(java.util.Optional<? extends java.util.List<com.fhir.Invoice_PriceComponent>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Invoice_PriceComponent> value = optional.orElse(null);
    if (this.priceComponent == value) return this;
    return new ImmutableInvoice_LineItem(
        this.extension,
        this.chargeItemReference,
        value,
        this.chargeItemCodeableConcept,
        this.id,
        this.sequence,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Invoice_LineItem#chargeItemCodeableConcept() chargeItemCodeableConcept} attribute.
   * @param value The value for chargeItemCodeableConcept
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInvoice_LineItem withChargeItemCodeableConcept(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "chargeItemCodeableConcept");
    if (this.chargeItemCodeableConcept == newValue) return this;
    return new ImmutableInvoice_LineItem(
        this.extension,
        this.chargeItemReference,
        this.priceComponent,
        newValue,
        this.id,
        this.sequence,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Invoice_LineItem#chargeItemCodeableConcept() chargeItemCodeableConcept} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for chargeItemCodeableConcept
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInvoice_LineItem withChargeItemCodeableConcept(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.chargeItemCodeableConcept == value) return this;
    return new ImmutableInvoice_LineItem(
        this.extension,
        this.chargeItemReference,
        this.priceComponent,
        value,
        this.id,
        this.sequence,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Invoice_LineItem#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInvoice_LineItem withId(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "id");
    if (java.util.Objects.equals(this.id, newValue)) return this;
    return new ImmutableInvoice_LineItem(
        this.extension,
        this.chargeItemReference,
        this.priceComponent,
        this.chargeItemCodeableConcept,
        newValue,
        this.sequence,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Invoice_LineItem#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInvoice_LineItem withId(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.id, value)) return this;
    return new ImmutableInvoice_LineItem(
        this.extension,
        this.chargeItemReference,
        this.priceComponent,
        this.chargeItemCodeableConcept,
        value,
        this.sequence,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Invoice_LineItem#sequence() sequence} attribute.
   * @param value The value for sequence
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInvoice_LineItem withSequence(com.fhir.positiveInt value) {
    @javax.annotation.Nullable com.fhir.positiveInt newValue = java.util.Objects.requireNonNull(value, "sequence");
    if (this.sequence == newValue) return this;
    return new ImmutableInvoice_LineItem(
        this.extension,
        this.chargeItemReference,
        this.priceComponent,
        this.chargeItemCodeableConcept,
        this.id,
        newValue,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Invoice_LineItem#sequence() sequence} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for sequence
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInvoice_LineItem withSequence(java.util.Optional<? extends com.fhir.positiveInt> optional) {
    @javax.annotation.Nullable com.fhir.positiveInt value = optional.orElse(null);
    if (this.sequence == value) return this;
    return new ImmutableInvoice_LineItem(
        this.extension,
        this.chargeItemReference,
        this.priceComponent,
        this.chargeItemCodeableConcept,
        this.id,
        value,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Invoice_LineItem#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInvoice_LineItem withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableInvoice_LineItem(
        this.extension,
        this.chargeItemReference,
        this.priceComponent,
        this.chargeItemCodeableConcept,
        this.id,
        this.sequence,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Invoice_LineItem#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInvoice_LineItem withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableInvoice_LineItem(
        this.extension,
        this.chargeItemReference,
        this.priceComponent,
        this.chargeItemCodeableConcept,
        this.id,
        this.sequence,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableInvoice_LineItem} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableInvoice_LineItem
        && equalTo((ImmutableInvoice_LineItem) another);
  }

  private boolean equalTo(ImmutableInvoice_LineItem another) {
    return java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(chargeItemReference, another.chargeItemReference)
        && java.util.Objects.equals(priceComponent, another.priceComponent)
        && java.util.Objects.equals(chargeItemCodeableConcept, another.chargeItemCodeableConcept)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(sequence, another.sequence)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension);
  }

  /**
   * Computes a hash code from attributes: {@code extension}, {@code chargeItemReference}, {@code priceComponent}, {@code chargeItemCodeableConcept}, {@code id}, {@code sequence}, {@code modifierExtension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(chargeItemReference);
    h += (h << 5) + java.util.Objects.hashCode(priceComponent);
    h += (h << 5) + java.util.Objects.hashCode(chargeItemCodeableConcept);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(sequence);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    return h;
  }

  /**
   * Prints the immutable value {@code Invoice_LineItem} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("Invoice_LineItem{");
    if (extension != null) {
      builder.append("extension=").append(extension);
    }
    if (chargeItemReference != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("chargeItemReference=").append(chargeItemReference);
    }
    if (priceComponent != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("priceComponent=").append(priceComponent);
    }
    if (chargeItemCodeableConcept != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("chargeItemCodeableConcept=").append(chargeItemCodeableConcept);
    }
    if (id != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (sequence != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("sequence=").append(sequence);
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
  @org.immutables.value.Generated(from = "Invoice_LineItem", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.Invoice_LineItem {
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> chargeItemReference = java.util.Optional.empty();
    boolean chargeItemReferenceIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Invoice_PriceComponent>> priceComponent = java.util.Optional.empty();
    boolean priceComponentIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> chargeItemCodeableConcept = java.util.Optional.empty();
    boolean chargeItemCodeableConceptIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.positiveInt> sequence = java.util.Optional.empty();
    boolean sequenceIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("chargeItemReference")
    public void setChargeItemReference(java.util.Optional<com.fhir.Reference> chargeItemReference) {
      this.chargeItemReference = chargeItemReference;
      this.chargeItemReferenceIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("priceComponent")
    public void setPriceComponent(java.util.Optional<java.util.List<com.fhir.Invoice_PriceComponent>> priceComponent) {
      this.priceComponent = priceComponent;
      this.priceComponentIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("chargeItemCodeableConcept")
    public void setChargeItemCodeableConcept(java.util.Optional<com.fhir.CodeableConcept> chargeItemCodeableConcept) {
      this.chargeItemCodeableConcept = chargeItemCodeableConcept;
      this.chargeItemCodeableConceptIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<java.lang.String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("sequence")
    public void setSequence(java.util.Optional<com.fhir.positiveInt> sequence) {
      this.sequence = sequence;
      this.sequenceIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> chargeItemReference() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Invoice_PriceComponent>> priceComponent() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> chargeItemCodeableConcept() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.positiveInt> sequence() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableInvoice_LineItem fromJson(Json json) {
    ImmutableInvoice_LineItem.Builder builder = ImmutableInvoice_LineItem.builder();
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.chargeItemReferenceIsSet) {
      builder.chargeItemReference(json.chargeItemReference);
    }
    if (json.priceComponentIsSet) {
      builder.priceComponent(json.priceComponent);
    }
    if (json.chargeItemCodeableConceptIsSet) {
      builder.chargeItemCodeableConcept(json.chargeItemCodeableConcept);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.sequenceIsSet) {
      builder.sequence(json.sequence);
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
        .extension(instance.extension())
        .chargeItemReference(instance.chargeItemReference())
        .priceComponent(instance.priceComponent())
        .chargeItemCodeableConcept(instance.chargeItemCodeableConcept())
        .id(instance.id())
        .sequence(instance.sequence())
        .modifierExtension(instance.modifierExtension())
        .build();
  }

  /**
   * Creates a builder for {@link Invoice_LineItem Invoice_LineItem}.
   * <pre>
   * ImmutableInvoice_LineItem.builder()
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Invoice_LineItem#extension() extension}
   *    .chargeItemReference(com.fhir.Reference) // optional {@link Invoice_LineItem#chargeItemReference() chargeItemReference}
   *    .priceComponent(List&amp;lt;com.fhir.Invoice_PriceComponent&amp;gt;) // optional {@link Invoice_LineItem#priceComponent() priceComponent}
   *    .chargeItemCodeableConcept(com.fhir.CodeableConcept) // optional {@link Invoice_LineItem#chargeItemCodeableConcept() chargeItemCodeableConcept}
   *    .id(String) // optional {@link Invoice_LineItem#id() id}
   *    .sequence(com.fhir.positiveInt) // optional {@link Invoice_LineItem#sequence() sequence}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Invoice_LineItem#modifierExtension() modifierExtension}
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
  @org.immutables.value.Generated(from = "Invoice_LineItem", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_EXTENSION = 0x1L;
    private static final long OPT_BIT_CHARGE_ITEM_REFERENCE = 0x2L;
    private static final long OPT_BIT_PRICE_COMPONENT = 0x4L;
    private static final long OPT_BIT_CHARGE_ITEM_CODEABLE_CONCEPT = 0x8L;
    private static final long OPT_BIT_ID = 0x10L;
    private static final long OPT_BIT_SEQUENCE = 0x20L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x40L;
    private long optBits;

    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable com.fhir.Reference chargeItemReference;
    private @javax.annotation.Nullable java.util.List<com.fhir.Invoice_PriceComponent> priceComponent;
    private @javax.annotation.Nullable com.fhir.CodeableConcept chargeItemCodeableConcept;
    private @javax.annotation.Nullable java.lang.String id;
    private @javax.annotation.Nullable com.fhir.positiveInt sequence;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Invoice_LineItem#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    public final Builder extension(java.util.List<com.fhir.Extension> extension) {
      checkNotIsSet(extensionIsSet(), "extension");
      this.extension = java.util.Objects.requireNonNull(extension, "extension");
      optBits |= OPT_BIT_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link Invoice_LineItem#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public final Builder extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension) {
      checkNotIsSet(extensionIsSet(), "extension");
      this.extension = extension.orElse(null);
      optBits |= OPT_BIT_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link Invoice_LineItem#chargeItemReference() chargeItemReference} to chargeItemReference.
     * @param chargeItemReference The value for chargeItemReference
     * @return {@code this} builder for chained invocation
     */
    public final Builder chargeItemReference(com.fhir.Reference chargeItemReference) {
      checkNotIsSet(chargeItemReferenceIsSet(), "chargeItemReference");
      this.chargeItemReference = java.util.Objects.requireNonNull(chargeItemReference, "chargeItemReference");
      optBits |= OPT_BIT_CHARGE_ITEM_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Invoice_LineItem#chargeItemReference() chargeItemReference} to chargeItemReference.
     * @param chargeItemReference The value for chargeItemReference
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("chargeItemReference")
    public final Builder chargeItemReference(java.util.Optional<? extends com.fhir.Reference> chargeItemReference) {
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
    public final Builder priceComponent(java.util.List<com.fhir.Invoice_PriceComponent> priceComponent) {
      checkNotIsSet(priceComponentIsSet(), "priceComponent");
      this.priceComponent = java.util.Objects.requireNonNull(priceComponent, "priceComponent");
      optBits |= OPT_BIT_PRICE_COMPONENT;
      return this;
    }

    /**
     * Initializes the optional value {@link Invoice_LineItem#priceComponent() priceComponent} to priceComponent.
     * @param priceComponent The value for priceComponent
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("priceComponent")
    public final Builder priceComponent(java.util.Optional<? extends java.util.List<com.fhir.Invoice_PriceComponent>> priceComponent) {
      checkNotIsSet(priceComponentIsSet(), "priceComponent");
      this.priceComponent = priceComponent.orElse(null);
      optBits |= OPT_BIT_PRICE_COMPONENT;
      return this;
    }

    /**
     * Initializes the optional value {@link Invoice_LineItem#chargeItemCodeableConcept() chargeItemCodeableConcept} to chargeItemCodeableConcept.
     * @param chargeItemCodeableConcept The value for chargeItemCodeableConcept
     * @return {@code this} builder for chained invocation
     */
    public final Builder chargeItemCodeableConcept(com.fhir.CodeableConcept chargeItemCodeableConcept) {
      checkNotIsSet(chargeItemCodeableConceptIsSet(), "chargeItemCodeableConcept");
      this.chargeItemCodeableConcept = java.util.Objects.requireNonNull(chargeItemCodeableConcept, "chargeItemCodeableConcept");
      optBits |= OPT_BIT_CHARGE_ITEM_CODEABLE_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link Invoice_LineItem#chargeItemCodeableConcept() chargeItemCodeableConcept} to chargeItemCodeableConcept.
     * @param chargeItemCodeableConcept The value for chargeItemCodeableConcept
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("chargeItemCodeableConcept")
    public final Builder chargeItemCodeableConcept(java.util.Optional<? extends com.fhir.CodeableConcept> chargeItemCodeableConcept) {
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
    public final Builder id(java.lang.String id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = java.util.Objects.requireNonNull(id, "id");
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link Invoice_LineItem#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public final Builder id(java.util.Optional<java.lang.String> id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = id.orElse(null);
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link Invoice_LineItem#sequence() sequence} to sequence.
     * @param sequence The value for sequence
     * @return {@code this} builder for chained invocation
     */
    public final Builder sequence(com.fhir.positiveInt sequence) {
      checkNotIsSet(sequenceIsSet(), "sequence");
      this.sequence = java.util.Objects.requireNonNull(sequence, "sequence");
      optBits |= OPT_BIT_SEQUENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Invoice_LineItem#sequence() sequence} to sequence.
     * @param sequence The value for sequence
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sequence")
    public final Builder sequence(java.util.Optional<? extends com.fhir.positiveInt> sequence) {
      checkNotIsSet(sequenceIsSet(), "sequence");
      this.sequence = sequence.orElse(null);
      optBits |= OPT_BIT_SEQUENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Invoice_LineItem#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    public final Builder modifierExtension(java.util.List<com.fhir.Extension> modifierExtension) {
      checkNotIsSet(modifierExtensionIsSet(), "modifierExtension");
      this.modifierExtension = java.util.Objects.requireNonNull(modifierExtension, "modifierExtension");
      optBits |= OPT_BIT_MODIFIER_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link Invoice_LineItem#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public final Builder modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension) {
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
    public com.fhir.Invoice_LineItem build() {
      return new ImmutableInvoice_LineItem(
          extension,
          chargeItemReference,
          priceComponent,
          chargeItemCodeableConcept,
          id,
          sequence,
          modifierExtension);
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean chargeItemReferenceIsSet() {
      return (optBits & OPT_BIT_CHARGE_ITEM_REFERENCE) != 0;
    }

    private boolean priceComponentIsSet() {
      return (optBits & OPT_BIT_PRICE_COMPONENT) != 0;
    }

    private boolean chargeItemCodeableConceptIsSet() {
      return (optBits & OPT_BIT_CHARGE_ITEM_CODEABLE_CONCEPT) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean sequenceIsSet() {
      return (optBits & OPT_BIT_SEQUENCE) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of Invoice_LineItem is strict, attribute is already set: ".concat(name));
    }
  }
}
