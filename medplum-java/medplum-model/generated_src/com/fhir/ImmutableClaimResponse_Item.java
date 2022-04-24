//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link ClaimResponse_Item}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableClaimResponse_Item.builder()}.
 */
@org.immutables.value.Generated(from = "ClaimResponse_Item", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableClaimResponse_Item implements com.fhir.ClaimResponse_Item {
  private final @javax.annotation.Nullable java.util.List<com.fhir.ClaimResponse_Detail> detail;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable com.fhir.positiveInt itemSequence;
  private final @javax.annotation.Nullable java.util.List<com.fhir.positiveInt> noteNumber;
  private final java.util.List<com.fhir.ClaimResponse_Adjudication> adjudication;
  private final @javax.annotation.Nullable java.lang.String id;

  private ImmutableClaimResponse_Item(
      @javax.annotation.Nullable java.util.List<com.fhir.ClaimResponse_Detail> detail,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable com.fhir.positiveInt itemSequence,
      @javax.annotation.Nullable java.util.List<com.fhir.positiveInt> noteNumber,
      java.util.List<com.fhir.ClaimResponse_Adjudication> adjudication,
      @javax.annotation.Nullable java.lang.String id) {
    this.detail = detail;
    this.extension = extension;
    this.modifierExtension = modifierExtension;
    this.itemSequence = itemSequence;
    this.noteNumber = noteNumber;
    this.adjudication = adjudication;
    this.id = id;
  }

  /**
   * @return The value of the {@code detail} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("detail")
  @Override
  public java.util.Optional<java.util.List<com.fhir.ClaimResponse_Detail>> detail() {
    return java.util.Optional.ofNullable(detail);
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() {
    return java.util.Optional.ofNullable(modifierExtension);
  }

  /**
   * @return The value of the {@code itemSequence} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("itemSequence")
  @Override
  public java.util.Optional<com.fhir.positiveInt> itemSequence() {
    return java.util.Optional.ofNullable(itemSequence);
  }

  /**
   * @return The value of the {@code noteNumber} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("noteNumber")
  @Override
  public java.util.Optional<java.util.List<com.fhir.positiveInt>> noteNumber() {
    return java.util.Optional.ofNullable(noteNumber);
  }

  /**
   * @return The value of the {@code adjudication} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("adjudication")
  @Override
  public java.util.List<com.fhir.ClaimResponse_Adjudication> adjudication() {
    return adjudication;
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse_Item#detail() detail} attribute.
   * @param value The value for detail
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse_Item withDetail(java.util.List<com.fhir.ClaimResponse_Detail> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ClaimResponse_Detail> newValue = java.util.Objects.requireNonNull(value, "detail");
    if (this.detail == newValue) return this;
    return new ImmutableClaimResponse_Item(
        newValue,
        this.extension,
        this.modifierExtension,
        this.itemSequence,
        this.noteNumber,
        this.adjudication,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse_Item#detail() detail} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for detail
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse_Item withDetail(java.util.Optional<? extends java.util.List<com.fhir.ClaimResponse_Detail>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ClaimResponse_Detail> value = optional.orElse(null);
    if (this.detail == value) return this;
    return new ImmutableClaimResponse_Item(
        value,
        this.extension,
        this.modifierExtension,
        this.itemSequence,
        this.noteNumber,
        this.adjudication,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse_Item#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse_Item withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableClaimResponse_Item(
        this.detail,
        newValue,
        this.modifierExtension,
        this.itemSequence,
        this.noteNumber,
        this.adjudication,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse_Item#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse_Item withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableClaimResponse_Item(
        this.detail,
        value,
        this.modifierExtension,
        this.itemSequence,
        this.noteNumber,
        this.adjudication,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse_Item#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse_Item withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableClaimResponse_Item(
        this.detail,
        this.extension,
        newValue,
        this.itemSequence,
        this.noteNumber,
        this.adjudication,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse_Item#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse_Item withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableClaimResponse_Item(
        this.detail,
        this.extension,
        value,
        this.itemSequence,
        this.noteNumber,
        this.adjudication,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse_Item#itemSequence() itemSequence} attribute.
   * @param value The value for itemSequence
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse_Item withItemSequence(com.fhir.positiveInt value) {
    @javax.annotation.Nullable com.fhir.positiveInt newValue = java.util.Objects.requireNonNull(value, "itemSequence");
    if (this.itemSequence == newValue) return this;
    return new ImmutableClaimResponse_Item(
        this.detail,
        this.extension,
        this.modifierExtension,
        newValue,
        this.noteNumber,
        this.adjudication,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse_Item#itemSequence() itemSequence} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for itemSequence
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse_Item withItemSequence(java.util.Optional<? extends com.fhir.positiveInt> optional) {
    @javax.annotation.Nullable com.fhir.positiveInt value = optional.orElse(null);
    if (this.itemSequence == value) return this;
    return new ImmutableClaimResponse_Item(
        this.detail,
        this.extension,
        this.modifierExtension,
        value,
        this.noteNumber,
        this.adjudication,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse_Item#noteNumber() noteNumber} attribute.
   * @param value The value for noteNumber
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse_Item withNoteNumber(java.util.List<com.fhir.positiveInt> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.positiveInt> newValue = java.util.Objects.requireNonNull(value, "noteNumber");
    if (this.noteNumber == newValue) return this;
    return new ImmutableClaimResponse_Item(
        this.detail,
        this.extension,
        this.modifierExtension,
        this.itemSequence,
        newValue,
        this.adjudication,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse_Item#noteNumber() noteNumber} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for noteNumber
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse_Item withNoteNumber(java.util.Optional<? extends java.util.List<com.fhir.positiveInt>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.positiveInt> value = optional.orElse(null);
    if (this.noteNumber == value) return this;
    return new ImmutableClaimResponse_Item(
        this.detail,
        this.extension,
        this.modifierExtension,
        this.itemSequence,
        value,
        this.adjudication,
        this.id);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link ClaimResponse_Item#adjudication() adjudication}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse_Item withAdjudication(com.fhir.ClaimResponse_Adjudication... elements) {
    java.util.List<com.fhir.ClaimResponse_Adjudication> newValue = createUnmodifiableList(false, createSafeList(java.util.Arrays.asList(elements), true, false));
    return new ImmutableClaimResponse_Item(
        this.detail,
        this.extension,
        this.modifierExtension,
        this.itemSequence,
        this.noteNumber,
        newValue,
        this.id);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link ClaimResponse_Item#adjudication() adjudication}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of adjudication elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse_Item withAdjudication(Iterable<? extends com.fhir.ClaimResponse_Adjudication> elements) {
    if (this.adjudication == elements) return this;
    java.util.List<com.fhir.ClaimResponse_Adjudication> newValue = createUnmodifiableList(false, createSafeList(elements, true, false));
    return new ImmutableClaimResponse_Item(
        this.detail,
        this.extension,
        this.modifierExtension,
        this.itemSequence,
        this.noteNumber,
        newValue,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse_Item#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse_Item withId(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "id");
    if (java.util.Objects.equals(this.id, newValue)) return this;
    return new ImmutableClaimResponse_Item(
        this.detail,
        this.extension,
        this.modifierExtension,
        this.itemSequence,
        this.noteNumber,
        this.adjudication,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse_Item#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse_Item withId(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.id, value)) return this;
    return new ImmutableClaimResponse_Item(
        this.detail,
        this.extension,
        this.modifierExtension,
        this.itemSequence,
        this.noteNumber,
        this.adjudication,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableClaimResponse_Item} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableClaimResponse_Item
        && equalTo((ImmutableClaimResponse_Item) another);
  }

  private boolean equalTo(ImmutableClaimResponse_Item another) {
    return java.util.Objects.equals(detail, another.detail)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(itemSequence, another.itemSequence)
        && java.util.Objects.equals(noteNumber, another.noteNumber)
        && adjudication.equals(another.adjudication)
        && java.util.Objects.equals(id, another.id);
  }

  /**
   * Computes a hash code from attributes: {@code detail}, {@code extension}, {@code modifierExtension}, {@code itemSequence}, {@code noteNumber}, {@code adjudication}, {@code id}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(detail);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(itemSequence);
    h += (h << 5) + java.util.Objects.hashCode(noteNumber);
    h += (h << 5) + adjudication.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(id);
    return h;
  }

  /**
   * Prints the immutable value {@code ClaimResponse_Item} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("ClaimResponse_Item{");
    if (detail != null) {
      builder.append("detail=").append(detail);
    }
    if (extension != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (modifierExtension != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (itemSequence != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("itemSequence=").append(itemSequence);
    }
    if (noteNumber != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("noteNumber=").append(noteNumber);
    }
    if (builder.length() > 19) builder.append(", ");
    builder.append("adjudication=").append(adjudication);
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "ClaimResponse_Item", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.ClaimResponse_Item {
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ClaimResponse_Detail>> detail = java.util.Optional.empty();
    boolean detailIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.positiveInt> itemSequence = java.util.Optional.empty();
    boolean itemSequenceIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.positiveInt>> noteNumber = java.util.Optional.empty();
    boolean noteNumberIsSet;
    @javax.annotation.Nullable java.util.List<com.fhir.ClaimResponse_Adjudication> adjudication = java.util.Collections.emptyList();
    @javax.annotation.Nullable java.util.Optional<java.lang.String> id = java.util.Optional.empty();
    boolean idIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("detail")
    public void setDetail(java.util.Optional<java.util.List<com.fhir.ClaimResponse_Detail>> detail) {
      this.detail = detail;
      this.detailIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("itemSequence")
    public void setItemSequence(java.util.Optional<com.fhir.positiveInt> itemSequence) {
      this.itemSequence = itemSequence;
      this.itemSequenceIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("noteNumber")
    public void setNoteNumber(java.util.Optional<java.util.List<com.fhir.positiveInt>> noteNumber) {
      this.noteNumber = noteNumber;
      this.noteNumberIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("adjudication")
    public void setAdjudication(java.util.List<com.fhir.ClaimResponse_Adjudication> adjudication) {
      this.adjudication = adjudication;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<java.lang.String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ClaimResponse_Detail>> detail() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.positiveInt> itemSequence() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.positiveInt>> noteNumber() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.List<com.fhir.ClaimResponse_Adjudication> adjudication() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> id() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableClaimResponse_Item fromJson(Json json) {
    ImmutableClaimResponse_Item.Builder builder = ImmutableClaimResponse_Item.builder();
    if (json.detailIsSet) {
      builder.detail(json.detail);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.itemSequenceIsSet) {
      builder.itemSequence(json.itemSequence);
    }
    if (json.noteNumberIsSet) {
      builder.noteNumber(json.noteNumber);
    }
    if (json.adjudication != null) {
      builder.addAllAdjudication(json.adjudication);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    return (ImmutableClaimResponse_Item) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ClaimResponse_Item} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ClaimResponse_Item instance
   */
  public static ClaimResponse_Item copyOf(ClaimResponse_Item instance) {
    if (instance instanceof ImmutableClaimResponse_Item) {
      return (ImmutableClaimResponse_Item) instance;
    }
    return ImmutableClaimResponse_Item.builder()
        .detail(instance.detail())
        .extension(instance.extension())
        .modifierExtension(instance.modifierExtension())
        .itemSequence(instance.itemSequence())
        .noteNumber(instance.noteNumber())
        .addAllAdjudication(instance.adjudication())
        .id(instance.id())
        .build();
  }

  /**
   * Creates a builder for {@link ClaimResponse_Item ClaimResponse_Item}.
   * <pre>
   * ImmutableClaimResponse_Item.builder()
   *    .detail(List&amp;lt;com.fhir.ClaimResponse_Detail&amp;gt;) // optional {@link ClaimResponse_Item#detail() detail}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link ClaimResponse_Item#extension() extension}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link ClaimResponse_Item#modifierExtension() modifierExtension}
   *    .itemSequence(com.fhir.positiveInt) // optional {@link ClaimResponse_Item#itemSequence() itemSequence}
   *    .noteNumber(List&amp;lt;com.fhir.positiveInt&amp;gt;) // optional {@link ClaimResponse_Item#noteNumber() noteNumber}
   *    .addAdjudication|addAllAdjudication(com.fhir.ClaimResponse_Adjudication) // {@link ClaimResponse_Item#adjudication() adjudication} elements
   *    .id(String) // optional {@link ClaimResponse_Item#id() id}
   *    .build();
   * </pre>
   * @return A new ClaimResponse_Item builder
   */
  public static ImmutableClaimResponse_Item.Builder builder() {
    return new ImmutableClaimResponse_Item.Builder();
  }

  /**
   * Builds instances of type {@link ClaimResponse_Item ClaimResponse_Item}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "ClaimResponse_Item", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_DETAIL = 0x1L;
    private static final long OPT_BIT_EXTENSION = 0x2L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x4L;
    private static final long OPT_BIT_ITEM_SEQUENCE = 0x8L;
    private static final long OPT_BIT_NOTE_NUMBER = 0x10L;
    private static final long OPT_BIT_ID = 0x20L;
    private long optBits;

    private @javax.annotation.Nullable java.util.List<com.fhir.ClaimResponse_Detail> detail;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable com.fhir.positiveInt itemSequence;
    private @javax.annotation.Nullable java.util.List<com.fhir.positiveInt> noteNumber;
    private final java.util.List<com.fhir.ClaimResponse_Adjudication> adjudication = new java.util.ArrayList<com.fhir.ClaimResponse_Adjudication>();
    private @javax.annotation.Nullable java.lang.String id;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link ClaimResponse_Item#detail() detail} to detail.
     * @param detail The value for detail
     * @return {@code this} builder for chained invocation
     */
    public final Builder detail(java.util.List<com.fhir.ClaimResponse_Detail> detail) {
      checkNotIsSet(detailIsSet(), "detail");
      this.detail = java.util.Objects.requireNonNull(detail, "detail");
      optBits |= OPT_BIT_DETAIL;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse_Item#detail() detail} to detail.
     * @param detail The value for detail
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("detail")
    public final Builder detail(java.util.Optional<? extends java.util.List<com.fhir.ClaimResponse_Detail>> detail) {
      checkNotIsSet(detailIsSet(), "detail");
      this.detail = detail.orElse(null);
      optBits |= OPT_BIT_DETAIL;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse_Item#extension() extension} to extension.
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
     * Initializes the optional value {@link ClaimResponse_Item#extension() extension} to extension.
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
     * Initializes the optional value {@link ClaimResponse_Item#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ClaimResponse_Item#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ClaimResponse_Item#itemSequence() itemSequence} to itemSequence.
     * @param itemSequence The value for itemSequence
     * @return {@code this} builder for chained invocation
     */
    public final Builder itemSequence(com.fhir.positiveInt itemSequence) {
      checkNotIsSet(itemSequenceIsSet(), "itemSequence");
      this.itemSequence = java.util.Objects.requireNonNull(itemSequence, "itemSequence");
      optBits |= OPT_BIT_ITEM_SEQUENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse_Item#itemSequence() itemSequence} to itemSequence.
     * @param itemSequence The value for itemSequence
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("itemSequence")
    public final Builder itemSequence(java.util.Optional<? extends com.fhir.positiveInt> itemSequence) {
      checkNotIsSet(itemSequenceIsSet(), "itemSequence");
      this.itemSequence = itemSequence.orElse(null);
      optBits |= OPT_BIT_ITEM_SEQUENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse_Item#noteNumber() noteNumber} to noteNumber.
     * @param noteNumber The value for noteNumber
     * @return {@code this} builder for chained invocation
     */
    public final Builder noteNumber(java.util.List<com.fhir.positiveInt> noteNumber) {
      checkNotIsSet(noteNumberIsSet(), "noteNumber");
      this.noteNumber = java.util.Objects.requireNonNull(noteNumber, "noteNumber");
      optBits |= OPT_BIT_NOTE_NUMBER;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse_Item#noteNumber() noteNumber} to noteNumber.
     * @param noteNumber The value for noteNumber
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("noteNumber")
    public final Builder noteNumber(java.util.Optional<? extends java.util.List<com.fhir.positiveInt>> noteNumber) {
      checkNotIsSet(noteNumberIsSet(), "noteNumber");
      this.noteNumber = noteNumber.orElse(null);
      optBits |= OPT_BIT_NOTE_NUMBER;
      return this;
    }

    /**
     * Adds one element to {@link ClaimResponse_Item#adjudication() adjudication} list.
     * @param element A adjudication element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAdjudication(com.fhir.ClaimResponse_Adjudication element) {
      this.adjudication.add(java.util.Objects.requireNonNull(element, "adjudication element"));
      return this;
    }

    /**
     * Adds elements to {@link ClaimResponse_Item#adjudication() adjudication} list.
     * @param elements An array of adjudication elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAdjudication(com.fhir.ClaimResponse_Adjudication... elements) {
      for (com.fhir.ClaimResponse_Adjudication element : elements) {
        this.adjudication.add(java.util.Objects.requireNonNull(element, "adjudication element"));
      }
      return this;
    }


    /**
     * Adds elements to {@link ClaimResponse_Item#adjudication() adjudication} list.
     * @param elements An iterable of adjudication elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllAdjudication(Iterable<? extends com.fhir.ClaimResponse_Adjudication> elements) {
      for (com.fhir.ClaimResponse_Adjudication element : elements) {
        this.adjudication.add(java.util.Objects.requireNonNull(element, "adjudication element"));
      }
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse_Item#id() id} to id.
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
     * Initializes the optional value {@link ClaimResponse_Item#id() id} to id.
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
     * Builds a new {@link ClaimResponse_Item ClaimResponse_Item}.
     * @return An immutable instance of ClaimResponse_Item
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.ClaimResponse_Item build() {
      return new ImmutableClaimResponse_Item(
          detail,
          extension,
          modifierExtension,
          itemSequence,
          noteNumber,
          createUnmodifiableList(true, adjudication),
          id);
    }

    private boolean detailIsSet() {
      return (optBits & OPT_BIT_DETAIL) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean itemSequenceIsSet() {
      return (optBits & OPT_BIT_ITEM_SEQUENCE) != 0;
    }

    private boolean noteNumberIsSet() {
      return (optBits & OPT_BIT_NOTE_NUMBER) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of ClaimResponse_Item is strict, attribute is already set: ".concat(name));
    }
  }

  private static <T> java.util.List<T> createSafeList(Iterable<? extends T> iterable, boolean checkNulls, boolean skipNulls) {
    java.util.ArrayList<T> list;
    if (iterable instanceof java.util.Collection<?>) {
      int size = ((java.util.Collection<?>) iterable).size();
      if (size == 0) return java.util.Collections.emptyList();
      list = new java.util.ArrayList<>();
    } else {
      list = new java.util.ArrayList<>();
    }
    for (T element : iterable) {
      if (skipNulls && element == null) continue;
      if (checkNulls) java.util.Objects.requireNonNull(element, "element");
      list.add(element);
    }
    return list;
  }

  private static <T> java.util.List<T> createUnmodifiableList(boolean clone, java.util.List<T> list) {
    switch(list.size()) {
    case 0: return java.util.Collections.emptyList();
    case 1: return java.util.Collections.singletonList(list.get(0));
    default:
      if (clone) {
        return java.util.Collections.unmodifiableList(new java.util.ArrayList<>(list));
      } else {
        if (list instanceof java.util.ArrayList<?>) {
          ((java.util.ArrayList<?>) list).trimToSize();
        }
        return java.util.Collections.unmodifiableList(list);
      }
    }
  }
}
