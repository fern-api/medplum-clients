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
 * Immutable implementation of {@link EffectEvidenceSynthesis_PrecisionEstimate}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableEffectEvidenceSynthesis_PrecisionEstimate.builder()}.
 */
@Generated(from = "EffectEvidenceSynthesis_PrecisionEstimate", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableEffectEvidenceSynthesis_PrecisionEstimate
    implements EffectEvidenceSynthesis_PrecisionEstimate {
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable Decimal from;
  private final @Nullable String id;
  private final @Nullable Decimal level;
  private final @Nullable CodeableConcept type;
  private final @Nullable List<Extension> extension;
  private final @Nullable Decimal to;

  private ImmutableEffectEvidenceSynthesis_PrecisionEstimate(
      @Nullable List<Extension> modifierExtension,
      @Nullable Decimal from,
      @Nullable String id,
      @Nullable Decimal level,
      @Nullable CodeableConcept type,
      @Nullable List<Extension> extension,
      @Nullable Decimal to) {
    this.modifierExtension = modifierExtension;
    this.from = from;
    this.id = id;
    this.level = level;
    this.type = type;
    this.extension = extension;
    this.to = to;
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
   * @return The value of the {@code from} attribute
   */
  @JsonProperty("from")
  @Override
  public Optional<Decimal> from() {
    return Optional.ofNullable(from);
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
   * @return The value of the {@code level} attribute
   */
  @JsonProperty("level")
  @Override
  public Optional<Decimal> level() {
    return Optional.ofNullable(level);
  }

  /**
   * @return The value of the {@code type} attribute
   */
  @JsonProperty("type")
  @Override
  public Optional<CodeableConcept> type() {
    return Optional.ofNullable(type);
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
   * @return The value of the {@code to} attribute
   */
  @JsonProperty("to")
  @Override
  public Optional<Decimal> to() {
    return Optional.ofNullable(to);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EffectEvidenceSynthesis_PrecisionEstimate#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEffectEvidenceSynthesis_PrecisionEstimate withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableEffectEvidenceSynthesis_PrecisionEstimate(newValue, this.from, this.id, this.level, this.type, this.extension, this.to);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EffectEvidenceSynthesis_PrecisionEstimate#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEffectEvidenceSynthesis_PrecisionEstimate withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableEffectEvidenceSynthesis_PrecisionEstimate(value, this.from, this.id, this.level, this.type, this.extension, this.to);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EffectEvidenceSynthesis_PrecisionEstimate#from() from} attribute.
   * @param value The value for from
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEffectEvidenceSynthesis_PrecisionEstimate withFrom(Decimal value) {
    @Nullable Decimal newValue = Objects.requireNonNull(value, "from");
    if (this.from == newValue) return this;
    return new ImmutableEffectEvidenceSynthesis_PrecisionEstimate(this.modifierExtension, newValue, this.id, this.level, this.type, this.extension, this.to);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EffectEvidenceSynthesis_PrecisionEstimate#from() from} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for from
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEffectEvidenceSynthesis_PrecisionEstimate withFrom(Optional<? extends Decimal> optional) {
    @Nullable Decimal value = optional.orElse(null);
    if (this.from == value) return this;
    return new ImmutableEffectEvidenceSynthesis_PrecisionEstimate(this.modifierExtension, value, this.id, this.level, this.type, this.extension, this.to);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EffectEvidenceSynthesis_PrecisionEstimate#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEffectEvidenceSynthesis_PrecisionEstimate withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableEffectEvidenceSynthesis_PrecisionEstimate(this.modifierExtension, this.from, newValue, this.level, this.type, this.extension, this.to);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EffectEvidenceSynthesis_PrecisionEstimate#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEffectEvidenceSynthesis_PrecisionEstimate withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableEffectEvidenceSynthesis_PrecisionEstimate(this.modifierExtension, this.from, value, this.level, this.type, this.extension, this.to);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EffectEvidenceSynthesis_PrecisionEstimate#level() level} attribute.
   * @param value The value for level
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEffectEvidenceSynthesis_PrecisionEstimate withLevel(Decimal value) {
    @Nullable Decimal newValue = Objects.requireNonNull(value, "level");
    if (this.level == newValue) return this;
    return new ImmutableEffectEvidenceSynthesis_PrecisionEstimate(this.modifierExtension, this.from, this.id, newValue, this.type, this.extension, this.to);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EffectEvidenceSynthesis_PrecisionEstimate#level() level} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for level
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEffectEvidenceSynthesis_PrecisionEstimate withLevel(Optional<? extends Decimal> optional) {
    @Nullable Decimal value = optional.orElse(null);
    if (this.level == value) return this;
    return new ImmutableEffectEvidenceSynthesis_PrecisionEstimate(this.modifierExtension, this.from, this.id, value, this.type, this.extension, this.to);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EffectEvidenceSynthesis_PrecisionEstimate#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEffectEvidenceSynthesis_PrecisionEstimate withType(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableEffectEvidenceSynthesis_PrecisionEstimate(this.modifierExtension, this.from, this.id, this.level, newValue, this.extension, this.to);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EffectEvidenceSynthesis_PrecisionEstimate#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEffectEvidenceSynthesis_PrecisionEstimate withType(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableEffectEvidenceSynthesis_PrecisionEstimate(this.modifierExtension, this.from, this.id, this.level, value, this.extension, this.to);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EffectEvidenceSynthesis_PrecisionEstimate#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEffectEvidenceSynthesis_PrecisionEstimate withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableEffectEvidenceSynthesis_PrecisionEstimate(this.modifierExtension, this.from, this.id, this.level, this.type, newValue, this.to);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EffectEvidenceSynthesis_PrecisionEstimate#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEffectEvidenceSynthesis_PrecisionEstimate withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableEffectEvidenceSynthesis_PrecisionEstimate(this.modifierExtension, this.from, this.id, this.level, this.type, value, this.to);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EffectEvidenceSynthesis_PrecisionEstimate#to() to} attribute.
   * @param value The value for to
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEffectEvidenceSynthesis_PrecisionEstimate withTo(Decimal value) {
    @Nullable Decimal newValue = Objects.requireNonNull(value, "to");
    if (this.to == newValue) return this;
    return new ImmutableEffectEvidenceSynthesis_PrecisionEstimate(this.modifierExtension, this.from, this.id, this.level, this.type, this.extension, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EffectEvidenceSynthesis_PrecisionEstimate#to() to} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for to
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEffectEvidenceSynthesis_PrecisionEstimate withTo(Optional<? extends Decimal> optional) {
    @Nullable Decimal value = optional.orElse(null);
    if (this.to == value) return this;
    return new ImmutableEffectEvidenceSynthesis_PrecisionEstimate(this.modifierExtension, this.from, this.id, this.level, this.type, this.extension, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableEffectEvidenceSynthesis_PrecisionEstimate} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableEffectEvidenceSynthesis_PrecisionEstimate
        && equalTo((ImmutableEffectEvidenceSynthesis_PrecisionEstimate) another);
  }

  private boolean equalTo(ImmutableEffectEvidenceSynthesis_PrecisionEstimate another) {
    return Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(from, another.from)
        && Objects.equals(id, another.id)
        && Objects.equals(level, another.level)
        && Objects.equals(type, another.type)
        && Objects.equals(extension, another.extension)
        && Objects.equals(to, another.to);
  }

  /**
   * Computes a hash code from attributes: {@code modifierExtension}, {@code from}, {@code id}, {@code level}, {@code type}, {@code extension}, {@code to}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(from);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(level);
    h += (h << 5) + Objects.hashCode(type);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(to);
    return h;
  }

  /**
   * Prints the immutable value {@code EffectEvidenceSynthesis_PrecisionEstimate} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("EffectEvidenceSynthesis_PrecisionEstimate{");
    if (modifierExtension != null) {
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (from != null) {
      if (builder.length() > 42) builder.append(", ");
      builder.append("from=").append(from);
    }
    if (id != null) {
      if (builder.length() > 42) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (level != null) {
      if (builder.length() > 42) builder.append(", ");
      builder.append("level=").append(level);
    }
    if (type != null) {
      if (builder.length() > 42) builder.append(", ");
      builder.append("type=").append(type);
    }
    if (extension != null) {
      if (builder.length() > 42) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (to != null) {
      if (builder.length() > 42) builder.append(", ");
      builder.append("to=").append(to);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "EffectEvidenceSynthesis_PrecisionEstimate", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements EffectEvidenceSynthesis_PrecisionEstimate {
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<Decimal> from = Optional.empty();
    boolean fromIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<Decimal> level = Optional.empty();
    boolean levelIsSet;
    @Nullable Optional<CodeableConcept> type = Optional.empty();
    boolean typeIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<Decimal> to = Optional.empty();
    boolean toIsSet;
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("from")
    public void setFrom(Optional<Decimal> from) {
      this.from = from;
      this.fromIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("level")
    public void setLevel(Optional<Decimal> level) {
      this.level = level;
      this.levelIsSet = true;
    }
    @JsonProperty("type")
    public void setType(Optional<CodeableConcept> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("to")
    public void setTo(Optional<Decimal> to) {
      this.to = to;
      this.toIsSet = true;
    }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Decimal> from() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Decimal> level() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> type() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Decimal> to() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableEffectEvidenceSynthesis_PrecisionEstimate fromJson(Json json) {
    ImmutableEffectEvidenceSynthesis_PrecisionEstimate.Builder builder = ImmutableEffectEvidenceSynthesis_PrecisionEstimate.builder();
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.fromIsSet) {
      builder.from(json.from);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.levelIsSet) {
      builder.level(json.level);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.toIsSet) {
      builder.to(json.to);
    }
    return (ImmutableEffectEvidenceSynthesis_PrecisionEstimate) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link EffectEvidenceSynthesis_PrecisionEstimate} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable EffectEvidenceSynthesis_PrecisionEstimate instance
   */
  public static EffectEvidenceSynthesis_PrecisionEstimate copyOf(EffectEvidenceSynthesis_PrecisionEstimate instance) {
    if (instance instanceof ImmutableEffectEvidenceSynthesis_PrecisionEstimate) {
      return (ImmutableEffectEvidenceSynthesis_PrecisionEstimate) instance;
    }
    return ImmutableEffectEvidenceSynthesis_PrecisionEstimate.builder()
        .modifierExtension(instance.modifierExtension())
        .from(instance.from())
        .id(instance.id())
        .level(instance.level())
        .type(instance.type())
        .extension(instance.extension())
        .to(instance.to())
        .build();
  }

  /**
   * Creates a builder for {@link EffectEvidenceSynthesis_PrecisionEstimate EffectEvidenceSynthesis_PrecisionEstimate}.
   * <pre>
   * ImmutableEffectEvidenceSynthesis_PrecisionEstimate.builder()
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link EffectEvidenceSynthesis_PrecisionEstimate#modifierExtension() modifierExtension}
   *    .from(com.medplum.types.fhir.Decimal) // optional {@link EffectEvidenceSynthesis_PrecisionEstimate#from() from}
   *    .id(String) // optional {@link EffectEvidenceSynthesis_PrecisionEstimate#id() id}
   *    .level(com.medplum.types.fhir.Decimal) // optional {@link EffectEvidenceSynthesis_PrecisionEstimate#level() level}
   *    .type(com.medplum.types.fhir.CodeableConcept) // optional {@link EffectEvidenceSynthesis_PrecisionEstimate#type() type}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link EffectEvidenceSynthesis_PrecisionEstimate#extension() extension}
   *    .to(com.medplum.types.fhir.Decimal) // optional {@link EffectEvidenceSynthesis_PrecisionEstimate#to() to}
   *    .build();
   * </pre>
   * @return A new EffectEvidenceSynthesis_PrecisionEstimate builder
   */
  public static ImmutableEffectEvidenceSynthesis_PrecisionEstimate.Builder builder() {
    return new ImmutableEffectEvidenceSynthesis_PrecisionEstimate.Builder();
  }

  /**
   * Builds instances of type {@link EffectEvidenceSynthesis_PrecisionEstimate EffectEvidenceSynthesis_PrecisionEstimate}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "EffectEvidenceSynthesis_PrecisionEstimate", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x1L;
    private static final long OPT_BIT_FROM = 0x2L;
    private static final long OPT_BIT_ID = 0x4L;
    private static final long OPT_BIT_LEVEL = 0x8L;
    private static final long OPT_BIT_TYPE = 0x10L;
    private static final long OPT_BIT_EXTENSION = 0x20L;
    private static final long OPT_BIT_TO = 0x40L;
    private long optBits;

    private @Nullable List<Extension> modifierExtension;
    private @Nullable Decimal from;
    private @Nullable String id;
    private @Nullable Decimal level;
    private @Nullable CodeableConcept type;
    private @Nullable List<Extension> extension;
    private @Nullable Decimal to;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis_PrecisionEstimate#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis_PrecisionEstimate#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis_PrecisionEstimate#from() from} to from.
     * @param from The value for from
     * @return {@code this} builder for chained invocation
     */
    public final Builder from(Decimal from) {
      checkNotIsSet(fromIsSet(), "from");
      this.from = Objects.requireNonNull(from, "from");
      optBits |= OPT_BIT_FROM;
      return this;
    }

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis_PrecisionEstimate#from() from} to from.
     * @param from The value for from
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("from")
    public final Builder from(Optional<? extends Decimal> from) {
      checkNotIsSet(fromIsSet(), "from");
      this.from = from.orElse(null);
      optBits |= OPT_BIT_FROM;
      return this;
    }

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis_PrecisionEstimate#id() id} to id.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis_PrecisionEstimate#id() id} to id.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis_PrecisionEstimate#level() level} to level.
     * @param level The value for level
     * @return {@code this} builder for chained invocation
     */
    public final Builder level(Decimal level) {
      checkNotIsSet(levelIsSet(), "level");
      this.level = Objects.requireNonNull(level, "level");
      optBits |= OPT_BIT_LEVEL;
      return this;
    }

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis_PrecisionEstimate#level() level} to level.
     * @param level The value for level
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("level")
    public final Builder level(Optional<? extends Decimal> level) {
      checkNotIsSet(levelIsSet(), "level");
      this.level = level.orElse(null);
      optBits |= OPT_BIT_LEVEL;
      return this;
    }

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis_PrecisionEstimate#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    public final Builder type(CodeableConcept type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = Objects.requireNonNull(type, "type");
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis_PrecisionEstimate#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("type")
    public final Builder type(Optional<? extends CodeableConcept> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = type.orElse(null);
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis_PrecisionEstimate#extension() extension} to extension.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis_PrecisionEstimate#extension() extension} to extension.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis_PrecisionEstimate#to() to} to to.
     * @param to The value for to
     * @return {@code this} builder for chained invocation
     */
    public final Builder to(Decimal to) {
      checkNotIsSet(toIsSet(), "to");
      this.to = Objects.requireNonNull(to, "to");
      optBits |= OPT_BIT_TO;
      return this;
    }

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis_PrecisionEstimate#to() to} to to.
     * @param to The value for to
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("to")
    public final Builder to(Optional<? extends Decimal> to) {
      checkNotIsSet(toIsSet(), "to");
      this.to = to.orElse(null);
      optBits |= OPT_BIT_TO;
      return this;
    }

    /**
     * Builds a new {@link EffectEvidenceSynthesis_PrecisionEstimate EffectEvidenceSynthesis_PrecisionEstimate}.
     * @return An immutable instance of EffectEvidenceSynthesis_PrecisionEstimate
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public EffectEvidenceSynthesis_PrecisionEstimate build() {
      return new ImmutableEffectEvidenceSynthesis_PrecisionEstimate(modifierExtension, from, id, level, type, extension, to);
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean fromIsSet() {
      return (optBits & OPT_BIT_FROM) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean levelIsSet() {
      return (optBits & OPT_BIT_LEVEL) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean toIsSet() {
      return (optBits & OPT_BIT_TO) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of EffectEvidenceSynthesis_PrecisionEstimate is strict, attribute is already set: ".concat(name));
    }
  }
}