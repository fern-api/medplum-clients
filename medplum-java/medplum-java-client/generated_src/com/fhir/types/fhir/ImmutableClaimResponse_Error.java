package com.fhir.types.fhir;

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
 * Immutable implementation of {@link ClaimResponse_Error}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableClaimResponse_Error.builder()}.
 */
@Generated(from = "ClaimResponse_Error", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableClaimResponse_Error implements ClaimResponse_Error {
  private final @Nullable String id;
  private final @Nullable PositiveInt subDetailSequence;
  private final @Nullable List<Extension> extension;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable PositiveInt itemSequence;
  private final CodeableConcept code;
  private final @Nullable PositiveInt detailSequence;

  private ImmutableClaimResponse_Error(
      @Nullable String id,
      @Nullable PositiveInt subDetailSequence,
      @Nullable List<Extension> extension,
      @Nullable List<Extension> modifierExtension,
      @Nullable PositiveInt itemSequence,
      CodeableConcept code,
      @Nullable PositiveInt detailSequence) {
    this.id = id;
    this.subDetailSequence = subDetailSequence;
    this.extension = extension;
    this.modifierExtension = modifierExtension;
    this.itemSequence = itemSequence;
    this.code = code;
    this.detailSequence = detailSequence;
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
   * @return The value of the {@code subDetailSequence} attribute
   */
  @JsonProperty("subDetailSequence")
  @Override
  public Optional<PositiveInt> subDetailSequence() {
    return Optional.ofNullable(subDetailSequence);
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
   * @return The value of the {@code itemSequence} attribute
   */
  @JsonProperty("itemSequence")
  @Override
  public Optional<PositiveInt> itemSequence() {
    return Optional.ofNullable(itemSequence);
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
   * @return The value of the {@code detailSequence} attribute
   */
  @JsonProperty("detailSequence")
  @Override
  public Optional<PositiveInt> detailSequence() {
    return Optional.ofNullable(detailSequence);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse_Error#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse_Error withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableClaimResponse_Error(
        newValue,
        this.subDetailSequence,
        this.extension,
        this.modifierExtension,
        this.itemSequence,
        this.code,
        this.detailSequence);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse_Error#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse_Error withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableClaimResponse_Error(
        value,
        this.subDetailSequence,
        this.extension,
        this.modifierExtension,
        this.itemSequence,
        this.code,
        this.detailSequence);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse_Error#subDetailSequence() subDetailSequence} attribute.
   * @param value The value for subDetailSequence
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse_Error withSubDetailSequence(PositiveInt value) {
    @Nullable PositiveInt newValue = Objects.requireNonNull(value, "subDetailSequence");
    if (this.subDetailSequence == newValue) return this;
    return new ImmutableClaimResponse_Error(
        this.id,
        newValue,
        this.extension,
        this.modifierExtension,
        this.itemSequence,
        this.code,
        this.detailSequence);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse_Error#subDetailSequence() subDetailSequence} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for subDetailSequence
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse_Error withSubDetailSequence(Optional<? extends PositiveInt> optional) {
    @Nullable PositiveInt value = optional.orElse(null);
    if (this.subDetailSequence == value) return this;
    return new ImmutableClaimResponse_Error(
        this.id,
        value,
        this.extension,
        this.modifierExtension,
        this.itemSequence,
        this.code,
        this.detailSequence);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse_Error#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse_Error withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableClaimResponse_Error(
        this.id,
        this.subDetailSequence,
        newValue,
        this.modifierExtension,
        this.itemSequence,
        this.code,
        this.detailSequence);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse_Error#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse_Error withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableClaimResponse_Error(
        this.id,
        this.subDetailSequence,
        value,
        this.modifierExtension,
        this.itemSequence,
        this.code,
        this.detailSequence);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse_Error#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse_Error withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableClaimResponse_Error(
        this.id,
        this.subDetailSequence,
        this.extension,
        newValue,
        this.itemSequence,
        this.code,
        this.detailSequence);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse_Error#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse_Error withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableClaimResponse_Error(
        this.id,
        this.subDetailSequence,
        this.extension,
        value,
        this.itemSequence,
        this.code,
        this.detailSequence);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse_Error#itemSequence() itemSequence} attribute.
   * @param value The value for itemSequence
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse_Error withItemSequence(PositiveInt value) {
    @Nullable PositiveInt newValue = Objects.requireNonNull(value, "itemSequence");
    if (this.itemSequence == newValue) return this;
    return new ImmutableClaimResponse_Error(
        this.id,
        this.subDetailSequence,
        this.extension,
        this.modifierExtension,
        newValue,
        this.code,
        this.detailSequence);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse_Error#itemSequence() itemSequence} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for itemSequence
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse_Error withItemSequence(Optional<? extends PositiveInt> optional) {
    @Nullable PositiveInt value = optional.orElse(null);
    if (this.itemSequence == value) return this;
    return new ImmutableClaimResponse_Error(
        this.id,
        this.subDetailSequence,
        this.extension,
        this.modifierExtension,
        value,
        this.code,
        this.detailSequence);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ClaimResponse_Error#code() code} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for code
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableClaimResponse_Error withCode(CodeableConcept value) {
    if (this.code == value) return this;
    CodeableConcept newValue = Objects.requireNonNull(value, "code");
    return new ImmutableClaimResponse_Error(
        this.id,
        this.subDetailSequence,
        this.extension,
        this.modifierExtension,
        this.itemSequence,
        newValue,
        this.detailSequence);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse_Error#detailSequence() detailSequence} attribute.
   * @param value The value for detailSequence
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse_Error withDetailSequence(PositiveInt value) {
    @Nullable PositiveInt newValue = Objects.requireNonNull(value, "detailSequence");
    if (this.detailSequence == newValue) return this;
    return new ImmutableClaimResponse_Error(
        this.id,
        this.subDetailSequence,
        this.extension,
        this.modifierExtension,
        this.itemSequence,
        this.code,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse_Error#detailSequence() detailSequence} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for detailSequence
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse_Error withDetailSequence(Optional<? extends PositiveInt> optional) {
    @Nullable PositiveInt value = optional.orElse(null);
    if (this.detailSequence == value) return this;
    return new ImmutableClaimResponse_Error(
        this.id,
        this.subDetailSequence,
        this.extension,
        this.modifierExtension,
        this.itemSequence,
        this.code,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableClaimResponse_Error} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableClaimResponse_Error
        && equalTo((ImmutableClaimResponse_Error) another);
  }

  private boolean equalTo(ImmutableClaimResponse_Error another) {
    return Objects.equals(id, another.id)
        && Objects.equals(subDetailSequence, another.subDetailSequence)
        && Objects.equals(extension, another.extension)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(itemSequence, another.itemSequence)
        && code.equals(another.code)
        && Objects.equals(detailSequence, another.detailSequence);
  }

  /**
   * Computes a hash code from attributes: {@code id}, {@code subDetailSequence}, {@code extension}, {@code modifierExtension}, {@code itemSequence}, {@code code}, {@code detailSequence}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(subDetailSequence);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(itemSequence);
    h += (h << 5) + code.hashCode();
    h += (h << 5) + Objects.hashCode(detailSequence);
    return h;
  }

  /**
   * Prints the immutable value {@code ClaimResponse_Error} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("ClaimResponse_Error{");
    if (id != null) {
      builder.append("id=").append(id);
    }
    if (subDetailSequence != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("subDetailSequence=").append(subDetailSequence);
    }
    if (extension != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (modifierExtension != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (itemSequence != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("itemSequence=").append(itemSequence);
    }
    if (builder.length() > 20) builder.append(", ");
    builder.append("code=").append(code);
    if (detailSequence != null) {
      builder.append(", ");
      builder.append("detailSequence=").append(detailSequence);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "ClaimResponse_Error", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements ClaimResponse_Error {
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<PositiveInt> subDetailSequence = Optional.empty();
    boolean subDetailSequenceIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<PositiveInt> itemSequence = Optional.empty();
    boolean itemSequenceIsSet;
    @Nullable CodeableConcept code;
    @Nullable Optional<PositiveInt> detailSequence = Optional.empty();
    boolean detailSequenceIsSet;
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("subDetailSequence")
    public void setSubDetailSequence(Optional<PositiveInt> subDetailSequence) {
      this.subDetailSequence = subDetailSequence;
      this.subDetailSequenceIsSet = true;
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
    @JsonProperty("itemSequence")
    public void setItemSequence(Optional<PositiveInt> itemSequence) {
      this.itemSequence = itemSequence;
      this.itemSequenceIsSet = true;
    }
    @JsonProperty("code")
    public void setCode(CodeableConcept code) {
      this.code = code;
    }
    @JsonProperty("detailSequence")
    public void setDetailSequence(Optional<PositiveInt> detailSequence) {
      this.detailSequence = detailSequence;
      this.detailSequenceIsSet = true;
    }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<PositiveInt> subDetailSequence() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<PositiveInt> itemSequence() { throw new UnsupportedOperationException(); }
    @Override
    public CodeableConcept code() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<PositiveInt> detailSequence() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableClaimResponse_Error fromJson(Json json) {
    ImmutableClaimResponse_Error.Builder builder = ((ImmutableClaimResponse_Error.Builder) ImmutableClaimResponse_Error.builder());
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.subDetailSequenceIsSet) {
      builder.subDetailSequence(json.subDetailSequence);
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
    if (json.code != null) {
      builder.code(json.code);
    }
    if (json.detailSequenceIsSet) {
      builder.detailSequence(json.detailSequence);
    }
    return (ImmutableClaimResponse_Error) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ClaimResponse_Error} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ClaimResponse_Error instance
   */
  public static ClaimResponse_Error copyOf(ClaimResponse_Error instance) {
    if (instance instanceof ImmutableClaimResponse_Error) {
      return (ImmutableClaimResponse_Error) instance;
    }
    return ((ImmutableClaimResponse_Error.Builder) ImmutableClaimResponse_Error.builder())
        .id(instance.id())
        .subDetailSequence(instance.subDetailSequence())
        .extension(instance.extension())
        .modifierExtension(instance.modifierExtension())
        .itemSequence(instance.itemSequence())
        .code(instance.code())
        .detailSequence(instance.detailSequence())
        .build();
  }

  /**
   * Creates a builder for {@link ClaimResponse_Error ClaimResponse_Error}.
   * <pre>
   * ImmutableClaimResponse_Error.builder()
   *    .id(String) // optional {@link ClaimResponse_Error#id() id}
   *    .subDetailSequence(com.fhir.types.fhir.PositiveInt) // optional {@link ClaimResponse_Error#subDetailSequence() subDetailSequence}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link ClaimResponse_Error#extension() extension}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link ClaimResponse_Error#modifierExtension() modifierExtension}
   *    .itemSequence(com.fhir.types.fhir.PositiveInt) // optional {@link ClaimResponse_Error#itemSequence() itemSequence}
   *    .code(com.fhir.types.fhir.CodeableConcept) // required {@link ClaimResponse_Error#code() code}
   *    .detailSequence(com.fhir.types.fhir.PositiveInt) // optional {@link ClaimResponse_Error#detailSequence() detailSequence}
   *    .build();
   * </pre>
   * @return A new ClaimResponse_Error builder
   */
  public static CodeBuildStage builder() {
    return new ImmutableClaimResponse_Error.Builder();
  }

  /**
   * Builds instances of type {@link ClaimResponse_Error ClaimResponse_Error}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "ClaimResponse_Error", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements CodeBuildStage, BuildFinal {
    private static final long INIT_BIT_CODE = 0x1L;
    private static final long OPT_BIT_ID = 0x1L;
    private static final long OPT_BIT_SUB_DETAIL_SEQUENCE = 0x2L;
    private static final long OPT_BIT_EXTENSION = 0x4L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x8L;
    private static final long OPT_BIT_ITEM_SEQUENCE = 0x10L;
    private static final long OPT_BIT_DETAIL_SEQUENCE = 0x20L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable String id;
    private @Nullable PositiveInt subDetailSequence;
    private @Nullable List<Extension> extension;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable PositiveInt itemSequence;
    private @Nullable CodeableConcept code;
    private @Nullable PositiveInt detailSequence;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link ClaimResponse_Error#id() id} to id.
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
     * Initializes the optional value {@link ClaimResponse_Error#id() id} to id.
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
     * Initializes the optional value {@link ClaimResponse_Error#subDetailSequence() subDetailSequence} to subDetailSequence.
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
     * Initializes the optional value {@link ClaimResponse_Error#subDetailSequence() subDetailSequence} to subDetailSequence.
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
     * Initializes the optional value {@link ClaimResponse_Error#extension() extension} to extension.
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
     * Initializes the optional value {@link ClaimResponse_Error#extension() extension} to extension.
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
     * Initializes the optional value {@link ClaimResponse_Error#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ClaimResponse_Error#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ClaimResponse_Error#itemSequence() itemSequence} to itemSequence.
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
     * Initializes the optional value {@link ClaimResponse_Error#itemSequence() itemSequence} to itemSequence.
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
     * Initializes the value for the {@link ClaimResponse_Error#code() code} attribute.
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
     * Initializes the optional value {@link ClaimResponse_Error#detailSequence() detailSequence} to detailSequence.
     * @param detailSequence The value for detailSequence
     * @return {@code this} builder for chained invocation
     */
    public final Builder detailSequence(PositiveInt detailSequence) {
      checkNotIsSet(detailSequenceIsSet(), "detailSequence");
      this.detailSequence = Objects.requireNonNull(detailSequence, "detailSequence");
      optBits |= OPT_BIT_DETAIL_SEQUENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse_Error#detailSequence() detailSequence} to detailSequence.
     * @param detailSequence The value for detailSequence
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("detailSequence")
    public final Builder detailSequence(Optional<? extends PositiveInt> detailSequence) {
      checkNotIsSet(detailSequenceIsSet(), "detailSequence");
      this.detailSequence = detailSequence.orElse(null);
      optBits |= OPT_BIT_DETAIL_SEQUENCE;
      return this;
    }

    /**
     * Builds a new {@link ClaimResponse_Error ClaimResponse_Error}.
     * @return An immutable instance of ClaimResponse_Error
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ClaimResponse_Error build() {
      checkRequiredAttributes();
      return new ImmutableClaimResponse_Error(id, subDetailSequence, extension, modifierExtension, itemSequence, code, detailSequence);
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean subDetailSequenceIsSet() {
      return (optBits & OPT_BIT_SUB_DETAIL_SEQUENCE) != 0;
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

    private boolean detailSequenceIsSet() {
      return (optBits & OPT_BIT_DETAIL_SEQUENCE) != 0;
    }

    private boolean codeIsSet() {
      return (initBits & INIT_BIT_CODE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of ClaimResponse_Error is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!codeIsSet()) attributes.add("code");
      return "Cannot build ClaimResponse_Error, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "ClaimResponse_Error", generator = "Immutables")
  public interface CodeBuildStage {
    /**
     * Initializes the value for the {@link ClaimResponse_Error#code() code} attribute.
     * @param code The value for code 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal code(CodeableConcept code);
  }

  @Generated(from = "ClaimResponse_Error", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link ClaimResponse_Error#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(String id);

    /**
     * Initializes the optional value {@link ClaimResponse_Error#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<String> id);

    /**
     * Initializes the optional value {@link ClaimResponse_Error#subDetailSequence() subDetailSequence} to subDetailSequence.
     * @param subDetailSequence The value for subDetailSequence
     * @return {@code this} builder for chained invocation
     */
    BuildFinal subDetailSequence(PositiveInt subDetailSequence);

    /**
     * Initializes the optional value {@link ClaimResponse_Error#subDetailSequence() subDetailSequence} to subDetailSequence.
     * @param subDetailSequence The value for subDetailSequence
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal subDetailSequence(Optional<? extends PositiveInt> subDetailSequence);

    /**
     * Initializes the optional value {@link ClaimResponse_Error#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link ClaimResponse_Error#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link ClaimResponse_Error#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link ClaimResponse_Error#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link ClaimResponse_Error#itemSequence() itemSequence} to itemSequence.
     * @param itemSequence The value for itemSequence
     * @return {@code this} builder for chained invocation
     */
    BuildFinal itemSequence(PositiveInt itemSequence);

    /**
     * Initializes the optional value {@link ClaimResponse_Error#itemSequence() itemSequence} to itemSequence.
     * @param itemSequence The value for itemSequence
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal itemSequence(Optional<? extends PositiveInt> itemSequence);

    /**
     * Initializes the optional value {@link ClaimResponse_Error#detailSequence() detailSequence} to detailSequence.
     * @param detailSequence The value for detailSequence
     * @return {@code this} builder for chained invocation
     */
    BuildFinal detailSequence(PositiveInt detailSequence);

    /**
     * Initializes the optional value {@link ClaimResponse_Error#detailSequence() detailSequence} to detailSequence.
     * @param detailSequence The value for detailSequence
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal detailSequence(Optional<? extends PositiveInt> detailSequence);

    /**
     * Builds a new {@link ClaimResponse_Error ClaimResponse_Error}.
     * @return An immutable instance of ClaimResponse_Error
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    ClaimResponse_Error build();
  }
}
