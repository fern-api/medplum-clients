//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link ClaimResponse_Detail}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableClaimResponse_Detail.builder()}.
 */
@org.immutables.value.Generated(from = "ClaimResponse_Detail", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableClaimResponse_Detail implements com.fhir.ClaimResponse_Detail {
  private final @javax.annotation.Nullable java.lang.String id;
  private final @javax.annotation.Nullable java.util.List<com.fhir.positiveInt> noteNumber;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ClaimResponse_SubDetail> subDetail;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final java.util.List<com.fhir.ClaimResponse_Adjudication> adjudication;
  private final @javax.annotation.Nullable com.fhir.positiveInt detailSequence;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;

  private ImmutableClaimResponse_Detail(
      @javax.annotation.Nullable java.lang.String id,
      @javax.annotation.Nullable java.util.List<com.fhir.positiveInt> noteNumber,
      @javax.annotation.Nullable java.util.List<com.fhir.ClaimResponse_SubDetail> subDetail,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      java.util.List<com.fhir.ClaimResponse_Adjudication> adjudication,
      @javax.annotation.Nullable com.fhir.positiveInt detailSequence,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension) {
    this.id = id;
    this.noteNumber = noteNumber;
    this.subDetail = subDetail;
    this.extension = extension;
    this.adjudication = adjudication;
    this.detailSequence = detailSequence;
    this.modifierExtension = modifierExtension;
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
   * @return The value of the {@code noteNumber} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("noteNumber")
  @Override
  public java.util.Optional<java.util.List<com.fhir.positiveInt>> noteNumber() {
    return java.util.Optional.ofNullable(noteNumber);
  }

  /**
   * @return The value of the {@code subDetail} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("subDetail")
  @Override
  public java.util.Optional<java.util.List<com.fhir.ClaimResponse_SubDetail>> subDetail() {
    return java.util.Optional.ofNullable(subDetail);
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
   * @return The value of the {@code adjudication} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("adjudication")
  @Override
  public java.util.List<com.fhir.ClaimResponse_Adjudication> adjudication() {
    return adjudication;
  }

  /**
   * @return The value of the {@code detailSequence} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("detailSequence")
  @Override
  public java.util.Optional<com.fhir.positiveInt> detailSequence() {
    return java.util.Optional.ofNullable(detailSequence);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse_Detail#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse_Detail withId(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "id");
    if (java.util.Objects.equals(this.id, newValue)) return this;
    return new ImmutableClaimResponse_Detail(
        newValue,
        this.noteNumber,
        this.subDetail,
        this.extension,
        this.adjudication,
        this.detailSequence,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse_Detail#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse_Detail withId(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.id, value)) return this;
    return new ImmutableClaimResponse_Detail(
        value,
        this.noteNumber,
        this.subDetail,
        this.extension,
        this.adjudication,
        this.detailSequence,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse_Detail#noteNumber() noteNumber} attribute.
   * @param value The value for noteNumber
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse_Detail withNoteNumber(java.util.List<com.fhir.positiveInt> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.positiveInt> newValue = java.util.Objects.requireNonNull(value, "noteNumber");
    if (this.noteNumber == newValue) return this;
    return new ImmutableClaimResponse_Detail(
        this.id,
        newValue,
        this.subDetail,
        this.extension,
        this.adjudication,
        this.detailSequence,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse_Detail#noteNumber() noteNumber} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for noteNumber
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse_Detail withNoteNumber(java.util.Optional<? extends java.util.List<com.fhir.positiveInt>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.positiveInt> value = optional.orElse(null);
    if (this.noteNumber == value) return this;
    return new ImmutableClaimResponse_Detail(
        this.id,
        value,
        this.subDetail,
        this.extension,
        this.adjudication,
        this.detailSequence,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse_Detail#subDetail() subDetail} attribute.
   * @param value The value for subDetail
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse_Detail withSubDetail(java.util.List<com.fhir.ClaimResponse_SubDetail> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ClaimResponse_SubDetail> newValue = java.util.Objects.requireNonNull(value, "subDetail");
    if (this.subDetail == newValue) return this;
    return new ImmutableClaimResponse_Detail(
        this.id,
        this.noteNumber,
        newValue,
        this.extension,
        this.adjudication,
        this.detailSequence,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse_Detail#subDetail() subDetail} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for subDetail
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse_Detail withSubDetail(java.util.Optional<? extends java.util.List<com.fhir.ClaimResponse_SubDetail>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ClaimResponse_SubDetail> value = optional.orElse(null);
    if (this.subDetail == value) return this;
    return new ImmutableClaimResponse_Detail(
        this.id,
        this.noteNumber,
        value,
        this.extension,
        this.adjudication,
        this.detailSequence,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse_Detail#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse_Detail withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableClaimResponse_Detail(
        this.id,
        this.noteNumber,
        this.subDetail,
        newValue,
        this.adjudication,
        this.detailSequence,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse_Detail#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse_Detail withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableClaimResponse_Detail(
        this.id,
        this.noteNumber,
        this.subDetail,
        value,
        this.adjudication,
        this.detailSequence,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link ClaimResponse_Detail#adjudication() adjudication}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse_Detail withAdjudication(com.fhir.ClaimResponse_Adjudication... elements) {
    java.util.List<com.fhir.ClaimResponse_Adjudication> newValue = createUnmodifiableList(false, createSafeList(java.util.Arrays.asList(elements), true, false));
    return new ImmutableClaimResponse_Detail(
        this.id,
        this.noteNumber,
        this.subDetail,
        this.extension,
        newValue,
        this.detailSequence,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link ClaimResponse_Detail#adjudication() adjudication}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of adjudication elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse_Detail withAdjudication(Iterable<? extends com.fhir.ClaimResponse_Adjudication> elements) {
    if (this.adjudication == elements) return this;
    java.util.List<com.fhir.ClaimResponse_Adjudication> newValue = createUnmodifiableList(false, createSafeList(elements, true, false));
    return new ImmutableClaimResponse_Detail(
        this.id,
        this.noteNumber,
        this.subDetail,
        this.extension,
        newValue,
        this.detailSequence,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse_Detail#detailSequence() detailSequence} attribute.
   * @param value The value for detailSequence
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse_Detail withDetailSequence(com.fhir.positiveInt value) {
    @javax.annotation.Nullable com.fhir.positiveInt newValue = java.util.Objects.requireNonNull(value, "detailSequence");
    if (this.detailSequence == newValue) return this;
    return new ImmutableClaimResponse_Detail(
        this.id,
        this.noteNumber,
        this.subDetail,
        this.extension,
        this.adjudication,
        newValue,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse_Detail#detailSequence() detailSequence} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for detailSequence
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse_Detail withDetailSequence(java.util.Optional<? extends com.fhir.positiveInt> optional) {
    @javax.annotation.Nullable com.fhir.positiveInt value = optional.orElse(null);
    if (this.detailSequence == value) return this;
    return new ImmutableClaimResponse_Detail(
        this.id,
        this.noteNumber,
        this.subDetail,
        this.extension,
        this.adjudication,
        value,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse_Detail#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse_Detail withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableClaimResponse_Detail(
        this.id,
        this.noteNumber,
        this.subDetail,
        this.extension,
        this.adjudication,
        this.detailSequence,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse_Detail#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse_Detail withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableClaimResponse_Detail(
        this.id,
        this.noteNumber,
        this.subDetail,
        this.extension,
        this.adjudication,
        this.detailSequence,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableClaimResponse_Detail} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableClaimResponse_Detail
        && equalTo((ImmutableClaimResponse_Detail) another);
  }

  private boolean equalTo(ImmutableClaimResponse_Detail another) {
    return java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(noteNumber, another.noteNumber)
        && java.util.Objects.equals(subDetail, another.subDetail)
        && java.util.Objects.equals(extension, another.extension)
        && adjudication.equals(another.adjudication)
        && java.util.Objects.equals(detailSequence, another.detailSequence)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension);
  }

  /**
   * Computes a hash code from attributes: {@code id}, {@code noteNumber}, {@code subDetail}, {@code extension}, {@code adjudication}, {@code detailSequence}, {@code modifierExtension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(noteNumber);
    h += (h << 5) + java.util.Objects.hashCode(subDetail);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + adjudication.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(detailSequence);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    return h;
  }

  /**
   * Prints the immutable value {@code ClaimResponse_Detail} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("ClaimResponse_Detail{");
    if (id != null) {
      builder.append("id=").append(id);
    }
    if (noteNumber != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("noteNumber=").append(noteNumber);
    }
    if (subDetail != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("subDetail=").append(subDetail);
    }
    if (extension != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (builder.length() > 21) builder.append(", ");
    builder.append("adjudication=").append(adjudication);
    if (detailSequence != null) {
      builder.append(", ");
      builder.append("detailSequence=").append(detailSequence);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "ClaimResponse_Detail", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.ClaimResponse_Detail {
    @javax.annotation.Nullable java.util.Optional<java.lang.String> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.positiveInt>> noteNumber = java.util.Optional.empty();
    boolean noteNumberIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ClaimResponse_SubDetail>> subDetail = java.util.Optional.empty();
    boolean subDetailIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.List<com.fhir.ClaimResponse_Adjudication> adjudication = java.util.Collections.emptyList();
    @javax.annotation.Nullable java.util.Optional<com.fhir.positiveInt> detailSequence = java.util.Optional.empty();
    boolean detailSequenceIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<java.lang.String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("noteNumber")
    public void setNoteNumber(java.util.Optional<java.util.List<com.fhir.positiveInt>> noteNumber) {
      this.noteNumber = noteNumber;
      this.noteNumberIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("subDetail")
    public void setSubDetail(java.util.Optional<java.util.List<com.fhir.ClaimResponse_SubDetail>> subDetail) {
      this.subDetail = subDetail;
      this.subDetailIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("adjudication")
    public void setAdjudication(java.util.List<com.fhir.ClaimResponse_Adjudication> adjudication) {
      this.adjudication = adjudication;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("detailSequence")
    public void setDetailSequence(java.util.Optional<com.fhir.positiveInt> detailSequence) {
      this.detailSequence = detailSequence;
      this.detailSequenceIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @Override
    public java.util.Optional<java.lang.String> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.positiveInt>> noteNumber() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ClaimResponse_SubDetail>> subDetail() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.List<com.fhir.ClaimResponse_Adjudication> adjudication() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.positiveInt> detailSequence() { throw new UnsupportedOperationException(); }
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
  static ImmutableClaimResponse_Detail fromJson(Json json) {
    ImmutableClaimResponse_Detail.Builder builder = ImmutableClaimResponse_Detail.builder();
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.noteNumberIsSet) {
      builder.noteNumber(json.noteNumber);
    }
    if (json.subDetailIsSet) {
      builder.subDetail(json.subDetail);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.adjudication != null) {
      builder.addAllAdjudication(json.adjudication);
    }
    if (json.detailSequenceIsSet) {
      builder.detailSequence(json.detailSequence);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    return (ImmutableClaimResponse_Detail) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ClaimResponse_Detail} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ClaimResponse_Detail instance
   */
  public static ClaimResponse_Detail copyOf(ClaimResponse_Detail instance) {
    if (instance instanceof ImmutableClaimResponse_Detail) {
      return (ImmutableClaimResponse_Detail) instance;
    }
    return ImmutableClaimResponse_Detail.builder()
        .id(instance.id())
        .noteNumber(instance.noteNumber())
        .subDetail(instance.subDetail())
        .extension(instance.extension())
        .addAllAdjudication(instance.adjudication())
        .detailSequence(instance.detailSequence())
        .modifierExtension(instance.modifierExtension())
        .build();
  }

  /**
   * Creates a builder for {@link ClaimResponse_Detail ClaimResponse_Detail}.
   * <pre>
   * ImmutableClaimResponse_Detail.builder()
   *    .id(String) // optional {@link ClaimResponse_Detail#id() id}
   *    .noteNumber(List&amp;lt;com.fhir.positiveInt&amp;gt;) // optional {@link ClaimResponse_Detail#noteNumber() noteNumber}
   *    .subDetail(List&amp;lt;com.fhir.ClaimResponse_SubDetail&amp;gt;) // optional {@link ClaimResponse_Detail#subDetail() subDetail}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link ClaimResponse_Detail#extension() extension}
   *    .addAdjudication|addAllAdjudication(com.fhir.ClaimResponse_Adjudication) // {@link ClaimResponse_Detail#adjudication() adjudication} elements
   *    .detailSequence(com.fhir.positiveInt) // optional {@link ClaimResponse_Detail#detailSequence() detailSequence}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link ClaimResponse_Detail#modifierExtension() modifierExtension}
   *    .build();
   * </pre>
   * @return A new ClaimResponse_Detail builder
   */
  public static ImmutableClaimResponse_Detail.Builder builder() {
    return new ImmutableClaimResponse_Detail.Builder();
  }

  /**
   * Builds instances of type {@link ClaimResponse_Detail ClaimResponse_Detail}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "ClaimResponse_Detail", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_ID = 0x1L;
    private static final long OPT_BIT_NOTE_NUMBER = 0x2L;
    private static final long OPT_BIT_SUB_DETAIL = 0x4L;
    private static final long OPT_BIT_EXTENSION = 0x8L;
    private static final long OPT_BIT_DETAIL_SEQUENCE = 0x10L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x20L;
    private long optBits;

    private @javax.annotation.Nullable java.lang.String id;
    private @javax.annotation.Nullable java.util.List<com.fhir.positiveInt> noteNumber;
    private @javax.annotation.Nullable java.util.List<com.fhir.ClaimResponse_SubDetail> subDetail;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private final java.util.List<com.fhir.ClaimResponse_Adjudication> adjudication = new java.util.ArrayList<com.fhir.ClaimResponse_Adjudication>();
    private @javax.annotation.Nullable com.fhir.positiveInt detailSequence;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link ClaimResponse_Detail#id() id} to id.
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
     * Initializes the optional value {@link ClaimResponse_Detail#id() id} to id.
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
     * Initializes the optional value {@link ClaimResponse_Detail#noteNumber() noteNumber} to noteNumber.
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
     * Initializes the optional value {@link ClaimResponse_Detail#noteNumber() noteNumber} to noteNumber.
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
     * Initializes the optional value {@link ClaimResponse_Detail#subDetail() subDetail} to subDetail.
     * @param subDetail The value for subDetail
     * @return {@code this} builder for chained invocation
     */
    public final Builder subDetail(java.util.List<com.fhir.ClaimResponse_SubDetail> subDetail) {
      checkNotIsSet(subDetailIsSet(), "subDetail");
      this.subDetail = java.util.Objects.requireNonNull(subDetail, "subDetail");
      optBits |= OPT_BIT_SUB_DETAIL;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse_Detail#subDetail() subDetail} to subDetail.
     * @param subDetail The value for subDetail
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("subDetail")
    public final Builder subDetail(java.util.Optional<? extends java.util.List<com.fhir.ClaimResponse_SubDetail>> subDetail) {
      checkNotIsSet(subDetailIsSet(), "subDetail");
      this.subDetail = subDetail.orElse(null);
      optBits |= OPT_BIT_SUB_DETAIL;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse_Detail#extension() extension} to extension.
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
     * Initializes the optional value {@link ClaimResponse_Detail#extension() extension} to extension.
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
     * Adds one element to {@link ClaimResponse_Detail#adjudication() adjudication} list.
     * @param element A adjudication element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAdjudication(com.fhir.ClaimResponse_Adjudication element) {
      this.adjudication.add(java.util.Objects.requireNonNull(element, "adjudication element"));
      return this;
    }

    /**
     * Adds elements to {@link ClaimResponse_Detail#adjudication() adjudication} list.
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
     * Adds elements to {@link ClaimResponse_Detail#adjudication() adjudication} list.
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
     * Initializes the optional value {@link ClaimResponse_Detail#detailSequence() detailSequence} to detailSequence.
     * @param detailSequence The value for detailSequence
     * @return {@code this} builder for chained invocation
     */
    public final Builder detailSequence(com.fhir.positiveInt detailSequence) {
      checkNotIsSet(detailSequenceIsSet(), "detailSequence");
      this.detailSequence = java.util.Objects.requireNonNull(detailSequence, "detailSequence");
      optBits |= OPT_BIT_DETAIL_SEQUENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse_Detail#detailSequence() detailSequence} to detailSequence.
     * @param detailSequence The value for detailSequence
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("detailSequence")
    public final Builder detailSequence(java.util.Optional<? extends com.fhir.positiveInt> detailSequence) {
      checkNotIsSet(detailSequenceIsSet(), "detailSequence");
      this.detailSequence = detailSequence.orElse(null);
      optBits |= OPT_BIT_DETAIL_SEQUENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse_Detail#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ClaimResponse_Detail#modifierExtension() modifierExtension} to modifierExtension.
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
     * Builds a new {@link ClaimResponse_Detail ClaimResponse_Detail}.
     * @return An immutable instance of ClaimResponse_Detail
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.ClaimResponse_Detail build() {
      return new ImmutableClaimResponse_Detail(
          id,
          noteNumber,
          subDetail,
          extension,
          createUnmodifiableList(true, adjudication),
          detailSequence,
          modifierExtension);
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean noteNumberIsSet() {
      return (optBits & OPT_BIT_NOTE_NUMBER) != 0;
    }

    private boolean subDetailIsSet() {
      return (optBits & OPT_BIT_SUB_DETAIL) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean detailSequenceIsSet() {
      return (optBits & OPT_BIT_DETAIL_SEQUENCE) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of ClaimResponse_Detail is strict, attribute is already set: ".concat(name));
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
