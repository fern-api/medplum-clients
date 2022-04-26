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
 * Immutable implementation of {@link ClaimResponse_SubDetail}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableClaimResponse_SubDetail.builder()}.
 */
@Generated(from = "ClaimResponse_SubDetail", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableClaimResponse_SubDetail implements ClaimResponse_SubDetail {
  private final @Nullable List<Extension> extension;
  private final @Nullable PositiveInt subDetailSequence;
  private final @Nullable List<PositiveInt> noteNumber;
  private final @Nullable String id;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable List<ClaimResponse_Adjudication> adjudication;

  private ImmutableClaimResponse_SubDetail(
      @Nullable List<Extension> extension,
      @Nullable PositiveInt subDetailSequence,
      @Nullable List<PositiveInt> noteNumber,
      @Nullable String id,
      @Nullable List<Extension> modifierExtension,
      @Nullable List<ClaimResponse_Adjudication> adjudication) {
    this.extension = extension;
    this.subDetailSequence = subDetailSequence;
    this.noteNumber = noteNumber;
    this.id = id;
    this.modifierExtension = modifierExtension;
    this.adjudication = adjudication;
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
   * @return The value of the {@code subDetailSequence} attribute
   */
  @JsonProperty("subDetailSequence")
  @Override
  public Optional<PositiveInt> subDetailSequence() {
    return Optional.ofNullable(subDetailSequence);
  }

  /**
   * @return The value of the {@code noteNumber} attribute
   */
  @JsonProperty("noteNumber")
  @Override
  public Optional<List<PositiveInt>> noteNumber() {
    return Optional.ofNullable(noteNumber);
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
   * @return The value of the {@code adjudication} attribute
   */
  @JsonProperty("adjudication")
  @Override
  public Optional<List<ClaimResponse_Adjudication>> adjudication() {
    return Optional.ofNullable(adjudication);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse_SubDetail#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse_SubDetail withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableClaimResponse_SubDetail(
        newValue,
        this.subDetailSequence,
        this.noteNumber,
        this.id,
        this.modifierExtension,
        this.adjudication);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse_SubDetail#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse_SubDetail withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableClaimResponse_SubDetail(
        value,
        this.subDetailSequence,
        this.noteNumber,
        this.id,
        this.modifierExtension,
        this.adjudication);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse_SubDetail#subDetailSequence() subDetailSequence} attribute.
   * @param value The value for subDetailSequence
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse_SubDetail withSubDetailSequence(PositiveInt value) {
    @Nullable PositiveInt newValue = Objects.requireNonNull(value, "subDetailSequence");
    if (this.subDetailSequence == newValue) return this;
    return new ImmutableClaimResponse_SubDetail(this.extension, newValue, this.noteNumber, this.id, this.modifierExtension, this.adjudication);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse_SubDetail#subDetailSequence() subDetailSequence} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for subDetailSequence
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse_SubDetail withSubDetailSequence(Optional<? extends PositiveInt> optional) {
    @Nullable PositiveInt value = optional.orElse(null);
    if (this.subDetailSequence == value) return this;
    return new ImmutableClaimResponse_SubDetail(this.extension, value, this.noteNumber, this.id, this.modifierExtension, this.adjudication);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse_SubDetail#noteNumber() noteNumber} attribute.
   * @param value The value for noteNumber
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse_SubDetail withNoteNumber(List<PositiveInt> value) {
    @Nullable List<PositiveInt> newValue = Objects.requireNonNull(value, "noteNumber");
    if (this.noteNumber == newValue) return this;
    return new ImmutableClaimResponse_SubDetail(
        this.extension,
        this.subDetailSequence,
        newValue,
        this.id,
        this.modifierExtension,
        this.adjudication);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse_SubDetail#noteNumber() noteNumber} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for noteNumber
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse_SubDetail withNoteNumber(Optional<? extends List<PositiveInt>> optional) {
    @Nullable List<PositiveInt> value = optional.orElse(null);
    if (this.noteNumber == value) return this;
    return new ImmutableClaimResponse_SubDetail(
        this.extension,
        this.subDetailSequence,
        value,
        this.id,
        this.modifierExtension,
        this.adjudication);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse_SubDetail#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse_SubDetail withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableClaimResponse_SubDetail(
        this.extension,
        this.subDetailSequence,
        this.noteNumber,
        newValue,
        this.modifierExtension,
        this.adjudication);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse_SubDetail#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse_SubDetail withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableClaimResponse_SubDetail(
        this.extension,
        this.subDetailSequence,
        this.noteNumber,
        value,
        this.modifierExtension,
        this.adjudication);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse_SubDetail#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse_SubDetail withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableClaimResponse_SubDetail(this.extension, this.subDetailSequence, this.noteNumber, this.id, newValue, this.adjudication);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse_SubDetail#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse_SubDetail withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableClaimResponse_SubDetail(this.extension, this.subDetailSequence, this.noteNumber, this.id, value, this.adjudication);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse_SubDetail#adjudication() adjudication} attribute.
   * @param value The value for adjudication
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse_SubDetail withAdjudication(List<ClaimResponse_Adjudication> value) {
    @Nullable List<ClaimResponse_Adjudication> newValue = Objects.requireNonNull(value, "adjudication");
    if (this.adjudication == newValue) return this;
    return new ImmutableClaimResponse_SubDetail(
        this.extension,
        this.subDetailSequence,
        this.noteNumber,
        this.id,
        this.modifierExtension,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse_SubDetail#adjudication() adjudication} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for adjudication
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse_SubDetail withAdjudication(Optional<? extends List<ClaimResponse_Adjudication>> optional) {
    @Nullable List<ClaimResponse_Adjudication> value = optional.orElse(null);
    if (this.adjudication == value) return this;
    return new ImmutableClaimResponse_SubDetail(this.extension, this.subDetailSequence, this.noteNumber, this.id, this.modifierExtension, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableClaimResponse_SubDetail} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableClaimResponse_SubDetail
        && equalTo((ImmutableClaimResponse_SubDetail) another);
  }

  private boolean equalTo(ImmutableClaimResponse_SubDetail another) {
    return Objects.equals(extension, another.extension)
        && Objects.equals(subDetailSequence, another.subDetailSequence)
        && Objects.equals(noteNumber, another.noteNumber)
        && Objects.equals(id, another.id)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(adjudication, another.adjudication);
  }

  /**
   * Computes a hash code from attributes: {@code extension}, {@code subDetailSequence}, {@code noteNumber}, {@code id}, {@code modifierExtension}, {@code adjudication}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(subDetailSequence);
    h += (h << 5) + Objects.hashCode(noteNumber);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(adjudication);
    return h;
  }

  /**
   * Prints the immutable value {@code ClaimResponse_SubDetail} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("ClaimResponse_SubDetail{");
    if (extension != null) {
      builder.append("extension=").append(extension);
    }
    if (subDetailSequence != null) {
      if (builder.length() > 24) builder.append(", ");
      builder.append("subDetailSequence=").append(subDetailSequence);
    }
    if (noteNumber != null) {
      if (builder.length() > 24) builder.append(", ");
      builder.append("noteNumber=").append(noteNumber);
    }
    if (id != null) {
      if (builder.length() > 24) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (modifierExtension != null) {
      if (builder.length() > 24) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (adjudication != null) {
      if (builder.length() > 24) builder.append(", ");
      builder.append("adjudication=").append(adjudication);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "ClaimResponse_SubDetail", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements ClaimResponse_SubDetail {
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<PositiveInt> subDetailSequence = Optional.empty();
    boolean subDetailSequenceIsSet;
    @Nullable Optional<List<PositiveInt>> noteNumber = Optional.empty();
    boolean noteNumberIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<List<ClaimResponse_Adjudication>> adjudication = Optional.empty();
    boolean adjudicationIsSet;
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("subDetailSequence")
    public void setSubDetailSequence(Optional<PositiveInt> subDetailSequence) {
      this.subDetailSequence = subDetailSequence;
      this.subDetailSequenceIsSet = true;
    }
    @JsonProperty("noteNumber")
    public void setNoteNumber(Optional<List<PositiveInt>> noteNumber) {
      this.noteNumber = noteNumber;
      this.noteNumberIsSet = true;
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
    @JsonProperty("adjudication")
    public void setAdjudication(Optional<List<ClaimResponse_Adjudication>> adjudication) {
      this.adjudication = adjudication;
      this.adjudicationIsSet = true;
    }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<PositiveInt> subDetailSequence() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<PositiveInt>> noteNumber() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ClaimResponse_Adjudication>> adjudication() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableClaimResponse_SubDetail fromJson(Json json) {
    ImmutableClaimResponse_SubDetail.Builder builder = ImmutableClaimResponse_SubDetail.builder();
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.subDetailSequenceIsSet) {
      builder.subDetailSequence(json.subDetailSequence);
    }
    if (json.noteNumberIsSet) {
      builder.noteNumber(json.noteNumber);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.adjudicationIsSet) {
      builder.adjudication(json.adjudication);
    }
    return (ImmutableClaimResponse_SubDetail) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ClaimResponse_SubDetail} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ClaimResponse_SubDetail instance
   */
  public static ClaimResponse_SubDetail copyOf(ClaimResponse_SubDetail instance) {
    if (instance instanceof ImmutableClaimResponse_SubDetail) {
      return (ImmutableClaimResponse_SubDetail) instance;
    }
    return ImmutableClaimResponse_SubDetail.builder()
        .extension(instance.extension())
        .subDetailSequence(instance.subDetailSequence())
        .noteNumber(instance.noteNumber())
        .id(instance.id())
        .modifierExtension(instance.modifierExtension())
        .adjudication(instance.adjudication())
        .build();
  }

  /**
   * Creates a builder for {@link ClaimResponse_SubDetail ClaimResponse_SubDetail}.
   * <pre>
   * ImmutableClaimResponse_SubDetail.builder()
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link ClaimResponse_SubDetail#extension() extension}
   *    .subDetailSequence(com.fhir.types.fhir.PositiveInt) // optional {@link ClaimResponse_SubDetail#subDetailSequence() subDetailSequence}
   *    .noteNumber(List&amp;lt;com.fhir.types.fhir.PositiveInt&amp;gt;) // optional {@link ClaimResponse_SubDetail#noteNumber() noteNumber}
   *    .id(String) // optional {@link ClaimResponse_SubDetail#id() id}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link ClaimResponse_SubDetail#modifierExtension() modifierExtension}
   *    .adjudication(List&amp;lt;com.fhir.types.fhir.ClaimResponse_Adjudication&amp;gt;) // optional {@link ClaimResponse_SubDetail#adjudication() adjudication}
   *    .build();
   * </pre>
   * @return A new ClaimResponse_SubDetail builder
   */
  public static ImmutableClaimResponse_SubDetail.Builder builder() {
    return new ImmutableClaimResponse_SubDetail.Builder();
  }

  /**
   * Builds instances of type {@link ClaimResponse_SubDetail ClaimResponse_SubDetail}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "ClaimResponse_SubDetail", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_EXTENSION = 0x1L;
    private static final long OPT_BIT_SUB_DETAIL_SEQUENCE = 0x2L;
    private static final long OPT_BIT_NOTE_NUMBER = 0x4L;
    private static final long OPT_BIT_ID = 0x8L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x10L;
    private static final long OPT_BIT_ADJUDICATION = 0x20L;
    private long optBits;

    private @Nullable List<Extension> extension;
    private @Nullable PositiveInt subDetailSequence;
    private @Nullable List<PositiveInt> noteNumber;
    private @Nullable String id;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable List<ClaimResponse_Adjudication> adjudication;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link ClaimResponse_SubDetail#extension() extension} to extension.
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
     * Initializes the optional value {@link ClaimResponse_SubDetail#extension() extension} to extension.
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
     * Initializes the optional value {@link ClaimResponse_SubDetail#subDetailSequence() subDetailSequence} to subDetailSequence.
     * @param subDetailSequence The value for subDetailSequence
     * @return {@code this} builder for chained invocation
     */
    public final Builder subDetailSequence(PositiveInt subDetailSequence) {
      checkNotIsSet(subDetailSequenceIsSet(), "subDetailSequence");
      this.subDetailSequence = Objects.requireNonNull(subDetailSequence, "subDetailSequence");
      optBits |= OPT_BIT_SUB_DETAIL_SEQUENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse_SubDetail#subDetailSequence() subDetailSequence} to subDetailSequence.
     * @param subDetailSequence The value for subDetailSequence
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("subDetailSequence")
    public final Builder subDetailSequence(Optional<? extends PositiveInt> subDetailSequence) {
      checkNotIsSet(subDetailSequenceIsSet(), "subDetailSequence");
      this.subDetailSequence = subDetailSequence.orElse(null);
      optBits |= OPT_BIT_SUB_DETAIL_SEQUENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse_SubDetail#noteNumber() noteNumber} to noteNumber.
     * @param noteNumber The value for noteNumber
     * @return {@code this} builder for chained invocation
     */
    public final Builder noteNumber(List<PositiveInt> noteNumber) {
      checkNotIsSet(noteNumberIsSet(), "noteNumber");
      this.noteNumber = Objects.requireNonNull(noteNumber, "noteNumber");
      optBits |= OPT_BIT_NOTE_NUMBER;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse_SubDetail#noteNumber() noteNumber} to noteNumber.
     * @param noteNumber The value for noteNumber
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("noteNumber")
    public final Builder noteNumber(Optional<? extends List<PositiveInt>> noteNumber) {
      checkNotIsSet(noteNumberIsSet(), "noteNumber");
      this.noteNumber = noteNumber.orElse(null);
      optBits |= OPT_BIT_NOTE_NUMBER;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse_SubDetail#id() id} to id.
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
     * Initializes the optional value {@link ClaimResponse_SubDetail#id() id} to id.
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
     * Initializes the optional value {@link ClaimResponse_SubDetail#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ClaimResponse_SubDetail#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ClaimResponse_SubDetail#adjudication() adjudication} to adjudication.
     * @param adjudication The value for adjudication
     * @return {@code this} builder for chained invocation
     */
    public final Builder adjudication(List<ClaimResponse_Adjudication> adjudication) {
      checkNotIsSet(adjudicationIsSet(), "adjudication");
      this.adjudication = Objects.requireNonNull(adjudication, "adjudication");
      optBits |= OPT_BIT_ADJUDICATION;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse_SubDetail#adjudication() adjudication} to adjudication.
     * @param adjudication The value for adjudication
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("adjudication")
    public final Builder adjudication(Optional<? extends List<ClaimResponse_Adjudication>> adjudication) {
      checkNotIsSet(adjudicationIsSet(), "adjudication");
      this.adjudication = adjudication.orElse(null);
      optBits |= OPT_BIT_ADJUDICATION;
      return this;
    }

    /**
     * Builds a new {@link ClaimResponse_SubDetail ClaimResponse_SubDetail}.
     * @return An immutable instance of ClaimResponse_SubDetail
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ClaimResponse_SubDetail build() {
      return new ImmutableClaimResponse_SubDetail(extension, subDetailSequence, noteNumber, id, modifierExtension, adjudication);
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean subDetailSequenceIsSet() {
      return (optBits & OPT_BIT_SUB_DETAIL_SEQUENCE) != 0;
    }

    private boolean noteNumberIsSet() {
      return (optBits & OPT_BIT_NOTE_NUMBER) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean adjudicationIsSet() {
      return (optBits & OPT_BIT_ADJUDICATION) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of ClaimResponse_SubDetail is strict, attribute is already set: ".concat(name));
    }
  }
}
