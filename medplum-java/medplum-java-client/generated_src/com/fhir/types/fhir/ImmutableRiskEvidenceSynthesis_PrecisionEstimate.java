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
 * Immutable implementation of {@link RiskEvidenceSynthesis_PrecisionEstimate}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableRiskEvidenceSynthesis_PrecisionEstimate.builder()}.
 */
@Generated(from = "RiskEvidenceSynthesis_PrecisionEstimate", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableRiskEvidenceSynthesis_PrecisionEstimate
    implements RiskEvidenceSynthesis_PrecisionEstimate {
  private final @Nullable Decimal from;
  private final @Nullable CodeableConcept type;
  private final @Nullable List<Extension> extension;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable String id;
  private final @Nullable Decimal to;
  private final @Nullable Decimal level;

  private ImmutableRiskEvidenceSynthesis_PrecisionEstimate(
      @Nullable Decimal from,
      @Nullable CodeableConcept type,
      @Nullable List<Extension> extension,
      @Nullable List<Extension> modifierExtension,
      @Nullable String id,
      @Nullable Decimal to,
      @Nullable Decimal level) {
    this.from = from;
    this.type = type;
    this.extension = extension;
    this.modifierExtension = modifierExtension;
    this.id = id;
    this.to = to;
    this.level = level;
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
   * @return The value of the {@code to} attribute
   */
  @JsonProperty("to")
  @Override
  public Optional<Decimal> to() {
    return Optional.ofNullable(to);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskEvidenceSynthesis_PrecisionEstimate#from() from} attribute.
   * @param value The value for from
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskEvidenceSynthesis_PrecisionEstimate withFrom(Decimal value) {
    @Nullable Decimal newValue = Objects.requireNonNull(value, "from");
    if (this.from == newValue) return this;
    return new ImmutableRiskEvidenceSynthesis_PrecisionEstimate(newValue, this.type, this.extension, this.modifierExtension, this.id, this.to, this.level);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskEvidenceSynthesis_PrecisionEstimate#from() from} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for from
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskEvidenceSynthesis_PrecisionEstimate withFrom(Optional<? extends Decimal> optional) {
    @Nullable Decimal value = optional.orElse(null);
    if (this.from == value) return this;
    return new ImmutableRiskEvidenceSynthesis_PrecisionEstimate(value, this.type, this.extension, this.modifierExtension, this.id, this.to, this.level);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskEvidenceSynthesis_PrecisionEstimate#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskEvidenceSynthesis_PrecisionEstimate withType(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableRiskEvidenceSynthesis_PrecisionEstimate(this.from, newValue, this.extension, this.modifierExtension, this.id, this.to, this.level);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskEvidenceSynthesis_PrecisionEstimate#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskEvidenceSynthesis_PrecisionEstimate withType(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableRiskEvidenceSynthesis_PrecisionEstimate(this.from, value, this.extension, this.modifierExtension, this.id, this.to, this.level);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskEvidenceSynthesis_PrecisionEstimate#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskEvidenceSynthesis_PrecisionEstimate withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableRiskEvidenceSynthesis_PrecisionEstimate(this.from, this.type, newValue, this.modifierExtension, this.id, this.to, this.level);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskEvidenceSynthesis_PrecisionEstimate#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskEvidenceSynthesis_PrecisionEstimate withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableRiskEvidenceSynthesis_PrecisionEstimate(this.from, this.type, value, this.modifierExtension, this.id, this.to, this.level);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskEvidenceSynthesis_PrecisionEstimate#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskEvidenceSynthesis_PrecisionEstimate withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableRiskEvidenceSynthesis_PrecisionEstimate(this.from, this.type, this.extension, newValue, this.id, this.to, this.level);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskEvidenceSynthesis_PrecisionEstimate#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskEvidenceSynthesis_PrecisionEstimate withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableRiskEvidenceSynthesis_PrecisionEstimate(this.from, this.type, this.extension, value, this.id, this.to, this.level);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskEvidenceSynthesis_PrecisionEstimate#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskEvidenceSynthesis_PrecisionEstimate withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableRiskEvidenceSynthesis_PrecisionEstimate(this.from, this.type, this.extension, this.modifierExtension, newValue, this.to, this.level);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskEvidenceSynthesis_PrecisionEstimate#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskEvidenceSynthesis_PrecisionEstimate withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableRiskEvidenceSynthesis_PrecisionEstimate(this.from, this.type, this.extension, this.modifierExtension, value, this.to, this.level);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskEvidenceSynthesis_PrecisionEstimate#to() to} attribute.
   * @param value The value for to
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskEvidenceSynthesis_PrecisionEstimate withTo(Decimal value) {
    @Nullable Decimal newValue = Objects.requireNonNull(value, "to");
    if (this.to == newValue) return this;
    return new ImmutableRiskEvidenceSynthesis_PrecisionEstimate(this.from, this.type, this.extension, this.modifierExtension, this.id, newValue, this.level);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskEvidenceSynthesis_PrecisionEstimate#to() to} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for to
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskEvidenceSynthesis_PrecisionEstimate withTo(Optional<? extends Decimal> optional) {
    @Nullable Decimal value = optional.orElse(null);
    if (this.to == value) return this;
    return new ImmutableRiskEvidenceSynthesis_PrecisionEstimate(this.from, this.type, this.extension, this.modifierExtension, this.id, value, this.level);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RiskEvidenceSynthesis_PrecisionEstimate#level() level} attribute.
   * @param value The value for level
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRiskEvidenceSynthesis_PrecisionEstimate withLevel(Decimal value) {
    @Nullable Decimal newValue = Objects.requireNonNull(value, "level");
    if (this.level == newValue) return this;
    return new ImmutableRiskEvidenceSynthesis_PrecisionEstimate(this.from, this.type, this.extension, this.modifierExtension, this.id, this.to, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RiskEvidenceSynthesis_PrecisionEstimate#level() level} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for level
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRiskEvidenceSynthesis_PrecisionEstimate withLevel(Optional<? extends Decimal> optional) {
    @Nullable Decimal value = optional.orElse(null);
    if (this.level == value) return this;
    return new ImmutableRiskEvidenceSynthesis_PrecisionEstimate(this.from, this.type, this.extension, this.modifierExtension, this.id, this.to, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableRiskEvidenceSynthesis_PrecisionEstimate} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableRiskEvidenceSynthesis_PrecisionEstimate
        && equalTo((ImmutableRiskEvidenceSynthesis_PrecisionEstimate) another);
  }

  private boolean equalTo(ImmutableRiskEvidenceSynthesis_PrecisionEstimate another) {
    return Objects.equals(from, another.from)
        && Objects.equals(type, another.type)
        && Objects.equals(extension, another.extension)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(id, another.id)
        && Objects.equals(to, another.to)
        && Objects.equals(level, another.level);
  }

  /**
   * Computes a hash code from attributes: {@code from}, {@code type}, {@code extension}, {@code modifierExtension}, {@code id}, {@code to}, {@code level}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(from);
    h += (h << 5) + Objects.hashCode(type);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(to);
    h += (h << 5) + Objects.hashCode(level);
    return h;
  }

  /**
   * Prints the immutable value {@code RiskEvidenceSynthesis_PrecisionEstimate} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("RiskEvidenceSynthesis_PrecisionEstimate{");
    if (from != null) {
      builder.append("from=").append(from);
    }
    if (type != null) {
      if (builder.length() > 40) builder.append(", ");
      builder.append("type=").append(type);
    }
    if (extension != null) {
      if (builder.length() > 40) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (modifierExtension != null) {
      if (builder.length() > 40) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (id != null) {
      if (builder.length() > 40) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (to != null) {
      if (builder.length() > 40) builder.append(", ");
      builder.append("to=").append(to);
    }
    if (level != null) {
      if (builder.length() > 40) builder.append(", ");
      builder.append("level=").append(level);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "RiskEvidenceSynthesis_PrecisionEstimate", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements RiskEvidenceSynthesis_PrecisionEstimate {
    @Nullable Optional<Decimal> from = Optional.empty();
    boolean fromIsSet;
    @Nullable Optional<CodeableConcept> type = Optional.empty();
    boolean typeIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<Decimal> to = Optional.empty();
    boolean toIsSet;
    @Nullable Optional<Decimal> level = Optional.empty();
    boolean levelIsSet;
    @JsonProperty("from")
    public void setFrom(Optional<Decimal> from) {
      this.from = from;
      this.fromIsSet = true;
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
    @JsonProperty("to")
    public void setTo(Optional<Decimal> to) {
      this.to = to;
      this.toIsSet = true;
    }
    @JsonProperty("level")
    public void setLevel(Optional<Decimal> level) {
      this.level = level;
      this.levelIsSet = true;
    }
    @Override
    public Optional<Decimal> from() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> type() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Decimal> to() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Decimal> level() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableRiskEvidenceSynthesis_PrecisionEstimate fromJson(Json json) {
    ImmutableRiskEvidenceSynthesis_PrecisionEstimate.Builder builder = ImmutableRiskEvidenceSynthesis_PrecisionEstimate.builder();
    if (json.fromIsSet) {
      builder.from(json.from);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.toIsSet) {
      builder.to(json.to);
    }
    if (json.levelIsSet) {
      builder.level(json.level);
    }
    return (ImmutableRiskEvidenceSynthesis_PrecisionEstimate) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link RiskEvidenceSynthesis_PrecisionEstimate} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable RiskEvidenceSynthesis_PrecisionEstimate instance
   */
  public static RiskEvidenceSynthesis_PrecisionEstimate copyOf(RiskEvidenceSynthesis_PrecisionEstimate instance) {
    if (instance instanceof ImmutableRiskEvidenceSynthesis_PrecisionEstimate) {
      return (ImmutableRiskEvidenceSynthesis_PrecisionEstimate) instance;
    }
    return ImmutableRiskEvidenceSynthesis_PrecisionEstimate.builder()
        .from(instance.from())
        .type(instance.type())
        .extension(instance.extension())
        .modifierExtension(instance.modifierExtension())
        .id(instance.id())
        .to(instance.to())
        .level(instance.level())
        .build();
  }

  /**
   * Creates a builder for {@link RiskEvidenceSynthesis_PrecisionEstimate RiskEvidenceSynthesis_PrecisionEstimate}.
   * <pre>
   * ImmutableRiskEvidenceSynthesis_PrecisionEstimate.builder()
   *    .from(com.fhir.types.fhir.Decimal) // optional {@link RiskEvidenceSynthesis_PrecisionEstimate#from() from}
   *    .type(com.fhir.types.fhir.CodeableConcept) // optional {@link RiskEvidenceSynthesis_PrecisionEstimate#type() type}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link RiskEvidenceSynthesis_PrecisionEstimate#extension() extension}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link RiskEvidenceSynthesis_PrecisionEstimate#modifierExtension() modifierExtension}
   *    .id(String) // optional {@link RiskEvidenceSynthesis_PrecisionEstimate#id() id}
   *    .to(com.fhir.types.fhir.Decimal) // optional {@link RiskEvidenceSynthesis_PrecisionEstimate#to() to}
   *    .level(com.fhir.types.fhir.Decimal) // optional {@link RiskEvidenceSynthesis_PrecisionEstimate#level() level}
   *    .build();
   * </pre>
   * @return A new RiskEvidenceSynthesis_PrecisionEstimate builder
   */
  public static ImmutableRiskEvidenceSynthesis_PrecisionEstimate.Builder builder() {
    return new ImmutableRiskEvidenceSynthesis_PrecisionEstimate.Builder();
  }

  /**
   * Builds instances of type {@link RiskEvidenceSynthesis_PrecisionEstimate RiskEvidenceSynthesis_PrecisionEstimate}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "RiskEvidenceSynthesis_PrecisionEstimate", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_FROM = 0x1L;
    private static final long OPT_BIT_TYPE = 0x2L;
    private static final long OPT_BIT_EXTENSION = 0x4L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x8L;
    private static final long OPT_BIT_ID = 0x10L;
    private static final long OPT_BIT_TO = 0x20L;
    private static final long OPT_BIT_LEVEL = 0x40L;
    private long optBits;

    private @Nullable Decimal from;
    private @Nullable CodeableConcept type;
    private @Nullable List<Extension> extension;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable String id;
    private @Nullable Decimal to;
    private @Nullable Decimal level;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link RiskEvidenceSynthesis_PrecisionEstimate#from() from} to from.
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
     * Initializes the optional value {@link RiskEvidenceSynthesis_PrecisionEstimate#from() from} to from.
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
     * Initializes the optional value {@link RiskEvidenceSynthesis_PrecisionEstimate#type() type} to type.
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
     * Initializes the optional value {@link RiskEvidenceSynthesis_PrecisionEstimate#type() type} to type.
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
     * Initializes the optional value {@link RiskEvidenceSynthesis_PrecisionEstimate#extension() extension} to extension.
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
     * Initializes the optional value {@link RiskEvidenceSynthesis_PrecisionEstimate#extension() extension} to extension.
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
     * Initializes the optional value {@link RiskEvidenceSynthesis_PrecisionEstimate#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link RiskEvidenceSynthesis_PrecisionEstimate#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link RiskEvidenceSynthesis_PrecisionEstimate#id() id} to id.
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
     * Initializes the optional value {@link RiskEvidenceSynthesis_PrecisionEstimate#id() id} to id.
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
     * Initializes the optional value {@link RiskEvidenceSynthesis_PrecisionEstimate#to() to} to to.
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
     * Initializes the optional value {@link RiskEvidenceSynthesis_PrecisionEstimate#to() to} to to.
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
     * Initializes the optional value {@link RiskEvidenceSynthesis_PrecisionEstimate#level() level} to level.
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
     * Initializes the optional value {@link RiskEvidenceSynthesis_PrecisionEstimate#level() level} to level.
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
     * Builds a new {@link RiskEvidenceSynthesis_PrecisionEstimate RiskEvidenceSynthesis_PrecisionEstimate}.
     * @return An immutable instance of RiskEvidenceSynthesis_PrecisionEstimate
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public RiskEvidenceSynthesis_PrecisionEstimate build() {
      return new ImmutableRiskEvidenceSynthesis_PrecisionEstimate(from, type, extension, modifierExtension, id, to, level);
    }

    private boolean fromIsSet() {
      return (optBits & OPT_BIT_FROM) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean toIsSet() {
      return (optBits & OPT_BIT_TO) != 0;
    }

    private boolean levelIsSet() {
      return (optBits & OPT_BIT_LEVEL) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of RiskEvidenceSynthesis_PrecisionEstimate is strict, attribute is already set: ".concat(name));
    }
  }
}
