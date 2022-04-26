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
 * Immutable implementation of {@link Composition_RelatesTo}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableComposition_RelatesTo.builder()}.
 */
@Generated(from = "Composition_RelatesTo", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableComposition_RelatesTo implements Composition_RelatesTo {
  private final @Nullable Code code;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable String id;
  private final @Nullable Reference targetReference;
  private final @Nullable List<Extension> extension;
  private final @Nullable Identifier targetIdentifier;

  private ImmutableComposition_RelatesTo(
      @Nullable Code code,
      @Nullable List<Extension> modifierExtension,
      @Nullable String id,
      @Nullable Reference targetReference,
      @Nullable List<Extension> extension,
      @Nullable Identifier targetIdentifier) {
    this.code = code;
    this.modifierExtension = modifierExtension;
    this.id = id;
    this.targetReference = targetReference;
    this.extension = extension;
    this.targetIdentifier = targetIdentifier;
  }

  /**
   * @return The value of the {@code code} attribute
   */
  @JsonProperty("code")
  @Override
  public Optional<Code> code() {
    return Optional.ofNullable(code);
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
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<String> id() {
    return Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code targetReference} attribute
   */
  @JsonProperty("targetReference")
  @Override
  public Optional<Reference> targetReference() {
    return Optional.ofNullable(targetReference);
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
   * @return The value of the {@code targetIdentifier} attribute
   */
  @JsonProperty("targetIdentifier")
  @Override
  public Optional<Identifier> targetIdentifier() {
    return Optional.ofNullable(targetIdentifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Composition_RelatesTo#code() code} attribute.
   * @param value The value for code
   * @return A modified copy of {@code this} object
   */
  public final ImmutableComposition_RelatesTo withCode(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "code");
    if (this.code == newValue) return this;
    return new ImmutableComposition_RelatesTo(
        newValue,
        this.modifierExtension,
        this.id,
        this.targetReference,
        this.extension,
        this.targetIdentifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Composition_RelatesTo#code() code} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for code
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableComposition_RelatesTo withCode(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.code == value) return this;
    return new ImmutableComposition_RelatesTo(
        value,
        this.modifierExtension,
        this.id,
        this.targetReference,
        this.extension,
        this.targetIdentifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Composition_RelatesTo#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableComposition_RelatesTo withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableComposition_RelatesTo(this.code, newValue, this.id, this.targetReference, this.extension, this.targetIdentifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Composition_RelatesTo#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableComposition_RelatesTo withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableComposition_RelatesTo(this.code, value, this.id, this.targetReference, this.extension, this.targetIdentifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Composition_RelatesTo#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableComposition_RelatesTo withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableComposition_RelatesTo(
        this.code,
        this.modifierExtension,
        newValue,
        this.targetReference,
        this.extension,
        this.targetIdentifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Composition_RelatesTo#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableComposition_RelatesTo withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableComposition_RelatesTo(
        this.code,
        this.modifierExtension,
        value,
        this.targetReference,
        this.extension,
        this.targetIdentifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Composition_RelatesTo#targetReference() targetReference} attribute.
   * @param value The value for targetReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableComposition_RelatesTo withTargetReference(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "targetReference");
    if (this.targetReference == newValue) return this;
    return new ImmutableComposition_RelatesTo(this.code, this.modifierExtension, this.id, newValue, this.extension, this.targetIdentifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Composition_RelatesTo#targetReference() targetReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for targetReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableComposition_RelatesTo withTargetReference(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.targetReference == value) return this;
    return new ImmutableComposition_RelatesTo(this.code, this.modifierExtension, this.id, value, this.extension, this.targetIdentifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Composition_RelatesTo#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableComposition_RelatesTo withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableComposition_RelatesTo(
        this.code,
        this.modifierExtension,
        this.id,
        this.targetReference,
        newValue,
        this.targetIdentifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Composition_RelatesTo#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableComposition_RelatesTo withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableComposition_RelatesTo(this.code, this.modifierExtension, this.id, this.targetReference, value, this.targetIdentifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Composition_RelatesTo#targetIdentifier() targetIdentifier} attribute.
   * @param value The value for targetIdentifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableComposition_RelatesTo withTargetIdentifier(Identifier value) {
    @Nullable Identifier newValue = Objects.requireNonNull(value, "targetIdentifier");
    if (this.targetIdentifier == newValue) return this;
    return new ImmutableComposition_RelatesTo(this.code, this.modifierExtension, this.id, this.targetReference, this.extension, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Composition_RelatesTo#targetIdentifier() targetIdentifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for targetIdentifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableComposition_RelatesTo withTargetIdentifier(Optional<? extends Identifier> optional) {
    @Nullable Identifier value = optional.orElse(null);
    if (this.targetIdentifier == value) return this;
    return new ImmutableComposition_RelatesTo(this.code, this.modifierExtension, this.id, this.targetReference, this.extension, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableComposition_RelatesTo} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableComposition_RelatesTo
        && equalTo((ImmutableComposition_RelatesTo) another);
  }

  private boolean equalTo(ImmutableComposition_RelatesTo another) {
    return Objects.equals(code, another.code)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(id, another.id)
        && Objects.equals(targetReference, another.targetReference)
        && Objects.equals(extension, another.extension)
        && Objects.equals(targetIdentifier, another.targetIdentifier);
  }

  /**
   * Computes a hash code from attributes: {@code code}, {@code modifierExtension}, {@code id}, {@code targetReference}, {@code extension}, {@code targetIdentifier}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(code);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(targetReference);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(targetIdentifier);
    return h;
  }

  /**
   * Prints the immutable value {@code Composition_RelatesTo} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Composition_RelatesTo{");
    if (code != null) {
      builder.append("code=").append(code);
    }
    if (modifierExtension != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (id != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (targetReference != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("targetReference=").append(targetReference);
    }
    if (extension != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (targetIdentifier != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("targetIdentifier=").append(targetIdentifier);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "Composition_RelatesTo", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Composition_RelatesTo {
    @Nullable Optional<Code> code = Optional.empty();
    boolean codeIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<Reference> targetReference = Optional.empty();
    boolean targetReferenceIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<Identifier> targetIdentifier = Optional.empty();
    boolean targetIdentifierIsSet;
    @JsonProperty("code")
    public void setCode(Optional<Code> code) {
      this.code = code;
      this.codeIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("targetReference")
    public void setTargetReference(Optional<Reference> targetReference) {
      this.targetReference = targetReference;
      this.targetReferenceIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("targetIdentifier")
    public void setTargetIdentifier(Optional<Identifier> targetIdentifier) {
      this.targetIdentifier = targetIdentifier;
      this.targetIdentifierIsSet = true;
    }
    @Override
    public Optional<Code> code() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> targetReference() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Identifier> targetIdentifier() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableComposition_RelatesTo fromJson(Json json) {
    ImmutableComposition_RelatesTo.Builder builder = ImmutableComposition_RelatesTo.builder();
    if (json.codeIsSet) {
      builder.code(json.code);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.targetReferenceIsSet) {
      builder.targetReference(json.targetReference);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.targetIdentifierIsSet) {
      builder.targetIdentifier(json.targetIdentifier);
    }
    return (ImmutableComposition_RelatesTo) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Composition_RelatesTo} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Composition_RelatesTo instance
   */
  public static Composition_RelatesTo copyOf(Composition_RelatesTo instance) {
    if (instance instanceof ImmutableComposition_RelatesTo) {
      return (ImmutableComposition_RelatesTo) instance;
    }
    return ImmutableComposition_RelatesTo.builder()
        .code(instance.code())
        .modifierExtension(instance.modifierExtension())
        .id(instance.id())
        .targetReference(instance.targetReference())
        .extension(instance.extension())
        .targetIdentifier(instance.targetIdentifier())
        .build();
  }

  /**
   * Creates a builder for {@link Composition_RelatesTo Composition_RelatesTo}.
   * <pre>
   * ImmutableComposition_RelatesTo.builder()
   *    .code(com.medplum.types.fhir.Code) // optional {@link Composition_RelatesTo#code() code}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link Composition_RelatesTo#modifierExtension() modifierExtension}
   *    .id(String) // optional {@link Composition_RelatesTo#id() id}
   *    .targetReference(com.medplum.types.fhir.Reference) // optional {@link Composition_RelatesTo#targetReference() targetReference}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link Composition_RelatesTo#extension() extension}
   *    .targetIdentifier(com.medplum.types.fhir.Identifier) // optional {@link Composition_RelatesTo#targetIdentifier() targetIdentifier}
   *    .build();
   * </pre>
   * @return A new Composition_RelatesTo builder
   */
  public static ImmutableComposition_RelatesTo.Builder builder() {
    return new ImmutableComposition_RelatesTo.Builder();
  }

  /**
   * Builds instances of type {@link Composition_RelatesTo Composition_RelatesTo}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Composition_RelatesTo", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_CODE = 0x1L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x2L;
    private static final long OPT_BIT_ID = 0x4L;
    private static final long OPT_BIT_TARGET_REFERENCE = 0x8L;
    private static final long OPT_BIT_EXTENSION = 0x10L;
    private static final long OPT_BIT_TARGET_IDENTIFIER = 0x20L;
    private long optBits;

    private @Nullable Code code;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable String id;
    private @Nullable Reference targetReference;
    private @Nullable List<Extension> extension;
    private @Nullable Identifier targetIdentifier;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Composition_RelatesTo#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for chained invocation
     */
    public final Builder code(Code code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = Objects.requireNonNull(code, "code");
      optBits |= OPT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link Composition_RelatesTo#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("code")
    public final Builder code(Optional<? extends Code> code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = code.orElse(null);
      optBits |= OPT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link Composition_RelatesTo#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Composition_RelatesTo#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Composition_RelatesTo#id() id} to id.
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
     * Initializes the optional value {@link Composition_RelatesTo#id() id} to id.
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
     * Initializes the optional value {@link Composition_RelatesTo#targetReference() targetReference} to targetReference.
     * @param targetReference The value for targetReference
     * @return {@code this} builder for chained invocation
     */
    public final Builder targetReference(Reference targetReference) {
      checkNotIsSet(targetReferenceIsSet(), "targetReference");
      this.targetReference = Objects.requireNonNull(targetReference, "targetReference");
      optBits |= OPT_BIT_TARGET_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Composition_RelatesTo#targetReference() targetReference} to targetReference.
     * @param targetReference The value for targetReference
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("targetReference")
    public final Builder targetReference(Optional<? extends Reference> targetReference) {
      checkNotIsSet(targetReferenceIsSet(), "targetReference");
      this.targetReference = targetReference.orElse(null);
      optBits |= OPT_BIT_TARGET_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Composition_RelatesTo#extension() extension} to extension.
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
     * Initializes the optional value {@link Composition_RelatesTo#extension() extension} to extension.
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
     * Initializes the optional value {@link Composition_RelatesTo#targetIdentifier() targetIdentifier} to targetIdentifier.
     * @param targetIdentifier The value for targetIdentifier
     * @return {@code this} builder for chained invocation
     */
    public final Builder targetIdentifier(Identifier targetIdentifier) {
      checkNotIsSet(targetIdentifierIsSet(), "targetIdentifier");
      this.targetIdentifier = Objects.requireNonNull(targetIdentifier, "targetIdentifier");
      optBits |= OPT_BIT_TARGET_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link Composition_RelatesTo#targetIdentifier() targetIdentifier} to targetIdentifier.
     * @param targetIdentifier The value for targetIdentifier
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("targetIdentifier")
    public final Builder targetIdentifier(Optional<? extends Identifier> targetIdentifier) {
      checkNotIsSet(targetIdentifierIsSet(), "targetIdentifier");
      this.targetIdentifier = targetIdentifier.orElse(null);
      optBits |= OPT_BIT_TARGET_IDENTIFIER;
      return this;
    }

    /**
     * Builds a new {@link Composition_RelatesTo Composition_RelatesTo}.
     * @return An immutable instance of Composition_RelatesTo
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Composition_RelatesTo build() {
      return new ImmutableComposition_RelatesTo(code, modifierExtension, id, targetReference, extension, targetIdentifier);
    }

    private boolean codeIsSet() {
      return (optBits & OPT_BIT_CODE) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean targetReferenceIsSet() {
      return (optBits & OPT_BIT_TARGET_REFERENCE) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean targetIdentifierIsSet() {
      return (optBits & OPT_BIT_TARGET_IDENTIFIER) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Composition_RelatesTo is strict, attribute is already set: ".concat(name));
    }
  }
}
