package com.fhir.types.fhir;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link ClaimResponse_Item}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableClaimResponse_Item.builder()}.
 */
@Generated(from = "ClaimResponse_Item", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableClaimResponse_Item implements ClaimResponse_Item {
  private final @Nullable PositiveInt itemSequence;
  private final @Nullable List<PositiveInt> noteNumber;
  private final @Nullable String id;
  private final @Nullable List<ClaimResponse_Detail> detail;
  private final @Nullable List<Extension> extension;
  private final @Nullable List<Extension> modifierExtension;
  private final List<ClaimResponse_Adjudication> adjudication;

  private ImmutableClaimResponse_Item(
      @Nullable PositiveInt itemSequence,
      @Nullable List<PositiveInt> noteNumber,
      @Nullable String id,
      @Nullable List<ClaimResponse_Detail> detail,
      @Nullable List<Extension> extension,
      @Nullable List<Extension> modifierExtension,
      List<ClaimResponse_Adjudication> adjudication) {
    this.itemSequence = itemSequence;
    this.noteNumber = noteNumber;
    this.id = id;
    this.detail = detail;
    this.extension = extension;
    this.modifierExtension = modifierExtension;
    this.adjudication = adjudication;
  }

  /**
   * @return The value of the {@code itemSequence} attribute
   */
  @JsonProperty("itemSequence")
  @Override
  public Optional<PositiveInt> itemSequence() {
    return Optional.ofNullable(itemSequence);
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
   * @return The value of the {@code detail} attribute
   */
  @JsonProperty("detail")
  @Override
  public Optional<List<ClaimResponse_Detail>> detail() {
    return Optional.ofNullable(detail);
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
  public List<ClaimResponse_Adjudication> adjudication() {
    return adjudication;
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse_Item#itemSequence() itemSequence} attribute.
   * @param value The value for itemSequence
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse_Item withItemSequence(PositiveInt value) {
    @Nullable PositiveInt newValue = Objects.requireNonNull(value, "itemSequence");
    if (this.itemSequence == newValue) return this;
    return new ImmutableClaimResponse_Item(
        newValue,
        this.noteNumber,
        this.id,
        this.detail,
        this.extension,
        this.modifierExtension,
        this.adjudication);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse_Item#itemSequence() itemSequence} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for itemSequence
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse_Item withItemSequence(Optional<? extends PositiveInt> optional) {
    @Nullable PositiveInt value = optional.orElse(null);
    if (this.itemSequence == value) return this;
    return new ImmutableClaimResponse_Item(
        value,
        this.noteNumber,
        this.id,
        this.detail,
        this.extension,
        this.modifierExtension,
        this.adjudication);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse_Item#noteNumber() noteNumber} attribute.
   * @param value The value for noteNumber
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse_Item withNoteNumber(List<PositiveInt> value) {
    @Nullable List<PositiveInt> newValue = Objects.requireNonNull(value, "noteNumber");
    if (this.noteNumber == newValue) return this;
    return new ImmutableClaimResponse_Item(
        this.itemSequence,
        newValue,
        this.id,
        this.detail,
        this.extension,
        this.modifierExtension,
        this.adjudication);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse_Item#noteNumber() noteNumber} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for noteNumber
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse_Item withNoteNumber(Optional<? extends List<PositiveInt>> optional) {
    @Nullable List<PositiveInt> value = optional.orElse(null);
    if (this.noteNumber == value) return this;
    return new ImmutableClaimResponse_Item(
        this.itemSequence,
        value,
        this.id,
        this.detail,
        this.extension,
        this.modifierExtension,
        this.adjudication);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse_Item#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse_Item withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableClaimResponse_Item(
        this.itemSequence,
        this.noteNumber,
        newValue,
        this.detail,
        this.extension,
        this.modifierExtension,
        this.adjudication);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse_Item#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse_Item withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableClaimResponse_Item(
        this.itemSequence,
        this.noteNumber,
        value,
        this.detail,
        this.extension,
        this.modifierExtension,
        this.adjudication);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse_Item#detail() detail} attribute.
   * @param value The value for detail
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse_Item withDetail(List<ClaimResponse_Detail> value) {
    @Nullable List<ClaimResponse_Detail> newValue = Objects.requireNonNull(value, "detail");
    if (this.detail == newValue) return this;
    return new ImmutableClaimResponse_Item(
        this.itemSequence,
        this.noteNumber,
        this.id,
        newValue,
        this.extension,
        this.modifierExtension,
        this.adjudication);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse_Item#detail() detail} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for detail
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse_Item withDetail(Optional<? extends List<ClaimResponse_Detail>> optional) {
    @Nullable List<ClaimResponse_Detail> value = optional.orElse(null);
    if (this.detail == value) return this;
    return new ImmutableClaimResponse_Item(
        this.itemSequence,
        this.noteNumber,
        this.id,
        value,
        this.extension,
        this.modifierExtension,
        this.adjudication);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse_Item#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse_Item withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableClaimResponse_Item(
        this.itemSequence,
        this.noteNumber,
        this.id,
        this.detail,
        newValue,
        this.modifierExtension,
        this.adjudication);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse_Item#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse_Item withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableClaimResponse_Item(
        this.itemSequence,
        this.noteNumber,
        this.id,
        this.detail,
        value,
        this.modifierExtension,
        this.adjudication);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse_Item#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse_Item withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableClaimResponse_Item(
        this.itemSequence,
        this.noteNumber,
        this.id,
        this.detail,
        this.extension,
        newValue,
        this.adjudication);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse_Item#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse_Item withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableClaimResponse_Item(
        this.itemSequence,
        this.noteNumber,
        this.id,
        this.detail,
        this.extension,
        value,
        this.adjudication);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link ClaimResponse_Item#adjudication() adjudication}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse_Item withAdjudication(ClaimResponse_Adjudication... elements) {
    List<ClaimResponse_Adjudication> newValue = createUnmodifiableList(false, createSafeList(Arrays.asList(elements), true, false));
    return new ImmutableClaimResponse_Item(
        this.itemSequence,
        this.noteNumber,
        this.id,
        this.detail,
        this.extension,
        this.modifierExtension,
        newValue);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link ClaimResponse_Item#adjudication() adjudication}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of adjudication elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse_Item withAdjudication(Iterable<? extends ClaimResponse_Adjudication> elements) {
    if (this.adjudication == elements) return this;
    List<ClaimResponse_Adjudication> newValue = createUnmodifiableList(false, createSafeList(elements, true, false));
    return new ImmutableClaimResponse_Item(
        this.itemSequence,
        this.noteNumber,
        this.id,
        this.detail,
        this.extension,
        this.modifierExtension,
        newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableClaimResponse_Item} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableClaimResponse_Item
        && equalTo((ImmutableClaimResponse_Item) another);
  }

  private boolean equalTo(ImmutableClaimResponse_Item another) {
    return Objects.equals(itemSequence, another.itemSequence)
        && Objects.equals(noteNumber, another.noteNumber)
        && Objects.equals(id, another.id)
        && Objects.equals(detail, another.detail)
        && Objects.equals(extension, another.extension)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && adjudication.equals(another.adjudication);
  }

  /**
   * Computes a hash code from attributes: {@code itemSequence}, {@code noteNumber}, {@code id}, {@code detail}, {@code extension}, {@code modifierExtension}, {@code adjudication}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(itemSequence);
    h += (h << 5) + Objects.hashCode(noteNumber);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(detail);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + adjudication.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code ClaimResponse_Item} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("ClaimResponse_Item{");
    if (itemSequence != null) {
      builder.append("itemSequence=").append(itemSequence);
    }
    if (noteNumber != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("noteNumber=").append(noteNumber);
    }
    if (id != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (detail != null) {
      if (builder.length() > 19) builder.append(", ");
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
    if (builder.length() > 19) builder.append(", ");
    builder.append("adjudication=").append(adjudication);
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "ClaimResponse_Item", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements ClaimResponse_Item {
    @Nullable Optional<PositiveInt> itemSequence = Optional.empty();
    boolean itemSequenceIsSet;
    @Nullable Optional<List<PositiveInt>> noteNumber = Optional.empty();
    boolean noteNumberIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<ClaimResponse_Detail>> detail = Optional.empty();
    boolean detailIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable List<ClaimResponse_Adjudication> adjudication = Collections.emptyList();
    @JsonProperty("itemSequence")
    public void setItemSequence(Optional<PositiveInt> itemSequence) {
      this.itemSequence = itemSequence;
      this.itemSequenceIsSet = true;
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
    @JsonProperty("detail")
    public void setDetail(Optional<List<ClaimResponse_Detail>> detail) {
      this.detail = detail;
      this.detailIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("adjudication")
    public void setAdjudication(List<ClaimResponse_Adjudication> adjudication) {
      this.adjudication = adjudication;
    }
    @Override
    public Optional<PositiveInt> itemSequence() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<PositiveInt>> noteNumber() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ClaimResponse_Detail>> detail() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public List<ClaimResponse_Adjudication> adjudication() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableClaimResponse_Item fromJson(Json json) {
    ImmutableClaimResponse_Item.Builder builder = ImmutableClaimResponse_Item.builder();
    if (json.itemSequenceIsSet) {
      builder.itemSequence(json.itemSequence);
    }
    if (json.noteNumberIsSet) {
      builder.noteNumber(json.noteNumber);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.detailIsSet) {
      builder.detail(json.detail);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.adjudication != null) {
      builder.addAllAdjudication(json.adjudication);
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
        .itemSequence(instance.itemSequence())
        .noteNumber(instance.noteNumber())
        .id(instance.id())
        .detail(instance.detail())
        .extension(instance.extension())
        .modifierExtension(instance.modifierExtension())
        .addAllAdjudication(instance.adjudication())
        .build();
  }

  /**
   * Creates a builder for {@link ClaimResponse_Item ClaimResponse_Item}.
   * <pre>
   * ImmutableClaimResponse_Item.builder()
   *    .itemSequence(com.fhir.types.fhir.PositiveInt) // optional {@link ClaimResponse_Item#itemSequence() itemSequence}
   *    .noteNumber(List&amp;lt;com.fhir.types.fhir.PositiveInt&amp;gt;) // optional {@link ClaimResponse_Item#noteNumber() noteNumber}
   *    .id(String) // optional {@link ClaimResponse_Item#id() id}
   *    .detail(List&amp;lt;com.fhir.types.fhir.ClaimResponse_Detail&amp;gt;) // optional {@link ClaimResponse_Item#detail() detail}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link ClaimResponse_Item#extension() extension}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link ClaimResponse_Item#modifierExtension() modifierExtension}
   *    .addAdjudication|addAllAdjudication(com.fhir.types.fhir.ClaimResponse_Adjudication) // {@link ClaimResponse_Item#adjudication() adjudication} elements
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
  @Generated(from = "ClaimResponse_Item", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_ITEM_SEQUENCE = 0x1L;
    private static final long OPT_BIT_NOTE_NUMBER = 0x2L;
    private static final long OPT_BIT_ID = 0x4L;
    private static final long OPT_BIT_DETAIL = 0x8L;
    private static final long OPT_BIT_EXTENSION = 0x10L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x20L;
    private long optBits;

    private @Nullable PositiveInt itemSequence;
    private @Nullable List<PositiveInt> noteNumber;
    private @Nullable String id;
    private @Nullable List<ClaimResponse_Detail> detail;
    private @Nullable List<Extension> extension;
    private @Nullable List<Extension> modifierExtension;
    private final List<ClaimResponse_Adjudication> adjudication = new ArrayList<ClaimResponse_Adjudication>();

    private Builder() {
    }

    /**
     * Initializes the optional value {@link ClaimResponse_Item#itemSequence() itemSequence} to itemSequence.
     * @param itemSequence The value for itemSequence
     * @return {@code this} builder for chained invocation
     */
    public final Builder itemSequence(PositiveInt itemSequence) {
      checkNotIsSet(itemSequenceIsSet(), "itemSequence");
      this.itemSequence = Objects.requireNonNull(itemSequence, "itemSequence");
      optBits |= OPT_BIT_ITEM_SEQUENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse_Item#itemSequence() itemSequence} to itemSequence.
     * @param itemSequence The value for itemSequence
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("itemSequence")
    public final Builder itemSequence(Optional<? extends PositiveInt> itemSequence) {
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
    public final Builder noteNumber(List<PositiveInt> noteNumber) {
      checkNotIsSet(noteNumberIsSet(), "noteNumber");
      this.noteNumber = Objects.requireNonNull(noteNumber, "noteNumber");
      optBits |= OPT_BIT_NOTE_NUMBER;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse_Item#noteNumber() noteNumber} to noteNumber.
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
     * Initializes the optional value {@link ClaimResponse_Item#id() id} to id.
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
     * Initializes the optional value {@link ClaimResponse_Item#id() id} to id.
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
     * Initializes the optional value {@link ClaimResponse_Item#detail() detail} to detail.
     * @param detail The value for detail
     * @return {@code this} builder for chained invocation
     */
    public final Builder detail(List<ClaimResponse_Detail> detail) {
      checkNotIsSet(detailIsSet(), "detail");
      this.detail = Objects.requireNonNull(detail, "detail");
      optBits |= OPT_BIT_DETAIL;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse_Item#detail() detail} to detail.
     * @param detail The value for detail
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("detail")
    public final Builder detail(Optional<? extends List<ClaimResponse_Detail>> detail) {
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
    public final Builder extension(List<Extension> extension) {
      checkNotIsSet(extensionIsSet(), "extension");
      this.extension = Objects.requireNonNull(extension, "extension");
      optBits |= OPT_BIT_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse_Item#extension() extension} to extension.
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
     * Initializes the optional value {@link ClaimResponse_Item#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ClaimResponse_Item#modifierExtension() modifierExtension} to modifierExtension.
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
     * Adds one element to {@link ClaimResponse_Item#adjudication() adjudication} list.
     * @param element A adjudication element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAdjudication(ClaimResponse_Adjudication element) {
      this.adjudication.add(Objects.requireNonNull(element, "adjudication element"));
      return this;
    }

    /**
     * Adds elements to {@link ClaimResponse_Item#adjudication() adjudication} list.
     * @param elements An array of adjudication elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAdjudication(ClaimResponse_Adjudication... elements) {
      for (ClaimResponse_Adjudication element : elements) {
        this.adjudication.add(Objects.requireNonNull(element, "adjudication element"));
      }
      return this;
    }


    /**
     * Adds elements to {@link ClaimResponse_Item#adjudication() adjudication} list.
     * @param elements An iterable of adjudication elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllAdjudication(Iterable<? extends ClaimResponse_Adjudication> elements) {
      for (ClaimResponse_Adjudication element : elements) {
        this.adjudication.add(Objects.requireNonNull(element, "adjudication element"));
      }
      return this;
    }

    /**
     * Builds a new {@link ClaimResponse_Item ClaimResponse_Item}.
     * @return An immutable instance of ClaimResponse_Item
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ClaimResponse_Item build() {
      return new ImmutableClaimResponse_Item(
          itemSequence,
          noteNumber,
          id,
          detail,
          extension,
          modifierExtension,
          createUnmodifiableList(true, adjudication));
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

    private boolean detailIsSet() {
      return (optBits & OPT_BIT_DETAIL) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of ClaimResponse_Item is strict, attribute is already set: ".concat(name));
    }
  }

  private static <T> List<T> createSafeList(Iterable<? extends T> iterable, boolean checkNulls, boolean skipNulls) {
    ArrayList<T> list;
    if (iterable instanceof Collection<?>) {
      int size = ((Collection<?>) iterable).size();
      if (size == 0) return Collections.emptyList();
      list = new ArrayList<>();
    } else {
      list = new ArrayList<>();
    }
    for (T element : iterable) {
      if (skipNulls && element == null) continue;
      if (checkNulls) Objects.requireNonNull(element, "element");
      list.add(element);
    }
    return list;
  }

  private static <T> List<T> createUnmodifiableList(boolean clone, List<T> list) {
    switch(list.size()) {
    case 0: return Collections.emptyList();
    case 1: return Collections.singletonList(list.get(0));
    default:
      if (clone) {
        return Collections.unmodifiableList(new ArrayList<>(list));
      } else {
        if (list instanceof ArrayList<?>) {
          ((ArrayList<?>) list).trimToSize();
        }
        return Collections.unmodifiableList(list);
      }
    }
  }
}
