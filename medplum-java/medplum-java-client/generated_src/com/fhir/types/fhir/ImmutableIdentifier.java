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
 * Immutable implementation of {@link Identifier}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableIdentifier.builder()}.
 */
@Generated(from = "Identifier", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableIdentifier implements Identifier {
  private final @Nullable String id;
  private final @Nullable Reference assigner;
  private final @Nullable Uri system;
  private final @Nullable Period period;
  private final @Nullable IdentifierUse use;
  private final @Nullable List<Extension> extension;
  private final @Nullable String value;
  private final @Nullable CodeableConcept type;

  private ImmutableIdentifier(
      @Nullable String id,
      @Nullable Reference assigner,
      @Nullable Uri system,
      @Nullable Period period,
      @Nullable IdentifierUse use,
      @Nullable List<Extension> extension,
      @Nullable String value,
      @Nullable CodeableConcept type) {
    this.id = id;
    this.assigner = assigner;
    this.system = system;
    this.period = period;
    this.use = use;
    this.extension = extension;
    this.value = value;
    this.type = type;
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
   * @return The value of the {@code assigner} attribute
   */
  @JsonProperty("assigner")
  @Override
  public Optional<Reference> assigner() {
    return Optional.ofNullable(assigner);
  }

  /**
   * @return The value of the {@code system} attribute
   */
  @JsonProperty("system")
  @Override
  public Optional<Uri> system() {
    return Optional.ofNullable(system);
  }

  /**
   * @return The value of the {@code period} attribute
   */
  @JsonProperty("period")
  @Override
  public Optional<Period> period() {
    return Optional.ofNullable(period);
  }

  /**
   * @return The value of the {@code use} attribute
   */
  @JsonProperty("use")
  @Override
  public Optional<IdentifierUse> use() {
    return Optional.ofNullable(use);
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
   * @return The value of the {@code value} attribute
   */
  @JsonProperty("value")
  @Override
  public Optional<String> value() {
    return Optional.ofNullable(value);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Identifier#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableIdentifier withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableIdentifier(
        newValue,
        this.assigner,
        this.system,
        this.period,
        this.use,
        this.extension,
        this.value,
        this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Identifier#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableIdentifier withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableIdentifier(value, this.assigner, this.system, this.period, this.use, this.extension, this.value, this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Identifier#assigner() assigner} attribute.
   * @param value The value for assigner
   * @return A modified copy of {@code this} object
   */
  public final ImmutableIdentifier withAssigner(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "assigner");
    if (this.assigner == newValue) return this;
    return new ImmutableIdentifier(this.id, newValue, this.system, this.period, this.use, this.extension, this.value, this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Identifier#assigner() assigner} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for assigner
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableIdentifier withAssigner(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.assigner == value) return this;
    return new ImmutableIdentifier(this.id, value, this.system, this.period, this.use, this.extension, this.value, this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Identifier#system() system} attribute.
   * @param value The value for system
   * @return A modified copy of {@code this} object
   */
  public final ImmutableIdentifier withSystem(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "system");
    if (this.system == newValue) return this;
    return new ImmutableIdentifier(this.id, this.assigner, newValue, this.period, this.use, this.extension, this.value, this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Identifier#system() system} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for system
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableIdentifier withSystem(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.system == value) return this;
    return new ImmutableIdentifier(this.id, this.assigner, value, this.period, this.use, this.extension, this.value, this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Identifier#period() period} attribute.
   * @param value The value for period
   * @return A modified copy of {@code this} object
   */
  public final ImmutableIdentifier withPeriod(Period value) {
    @Nullable Period newValue = Objects.requireNonNull(value, "period");
    if (this.period == newValue) return this;
    return new ImmutableIdentifier(this.id, this.assigner, this.system, newValue, this.use, this.extension, this.value, this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Identifier#period() period} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for period
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableIdentifier withPeriod(Optional<? extends Period> optional) {
    @Nullable Period value = optional.orElse(null);
    if (this.period == value) return this;
    return new ImmutableIdentifier(this.id, this.assigner, this.system, value, this.use, this.extension, this.value, this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Identifier#use() use} attribute.
   * @param value The value for use
   * @return A modified copy of {@code this} object
   */
  public final ImmutableIdentifier withUse(IdentifierUse value) {
    @Nullable IdentifierUse newValue = Objects.requireNonNull(value, "use");
    if (this.use == newValue) return this;
    return new ImmutableIdentifier(
        this.id,
        this.assigner,
        this.system,
        this.period,
        newValue,
        this.extension,
        this.value,
        this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Identifier#use() use} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for use
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableIdentifier withUse(Optional<? extends IdentifierUse> optional) {
    @Nullable IdentifierUse value = optional.orElse(null);
    if (this.use == value) return this;
    return new ImmutableIdentifier(this.id, this.assigner, this.system, this.period, value, this.extension, this.value, this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Identifier#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableIdentifier withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableIdentifier(this.id, this.assigner, this.system, this.period, this.use, newValue, this.value, this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Identifier#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableIdentifier withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableIdentifier(this.id, this.assigner, this.system, this.period, this.use, value, this.value, this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Identifier#value() value} attribute.
   * @param value The value for value
   * @return A modified copy of {@code this} object
   */
  public final ImmutableIdentifier withValue(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "value");
    if (Objects.equals(this.value, newValue)) return this;
    return new ImmutableIdentifier(this.id, this.assigner, this.system, this.period, this.use, this.extension, newValue, this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Identifier#value() value} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for value
   * @return A modified copy of {@code this} object
   */
  public final ImmutableIdentifier withValue(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.value, value)) return this;
    return new ImmutableIdentifier(this.id, this.assigner, this.system, this.period, this.use, this.extension, value, this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Identifier#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableIdentifier withType(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableIdentifier(
        this.id,
        this.assigner,
        this.system,
        this.period,
        this.use,
        this.extension,
        this.value,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Identifier#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableIdentifier withType(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableIdentifier(this.id, this.assigner, this.system, this.period, this.use, this.extension, this.value, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableIdentifier} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableIdentifier
        && equalTo((ImmutableIdentifier) another);
  }

  private boolean equalTo(ImmutableIdentifier another) {
    return Objects.equals(id, another.id)
        && Objects.equals(assigner, another.assigner)
        && Objects.equals(system, another.system)
        && Objects.equals(period, another.period)
        && Objects.equals(use, another.use)
        && Objects.equals(extension, another.extension)
        && Objects.equals(value, another.value)
        && Objects.equals(type, another.type);
  }

  /**
   * Computes a hash code from attributes: {@code id}, {@code assigner}, {@code system}, {@code period}, {@code use}, {@code extension}, {@code value}, {@code type}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(assigner);
    h += (h << 5) + Objects.hashCode(system);
    h += (h << 5) + Objects.hashCode(period);
    h += (h << 5) + Objects.hashCode(use);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(value);
    h += (h << 5) + Objects.hashCode(type);
    return h;
  }

  /**
   * Prints the immutable value {@code Identifier} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Identifier{");
    if (id != null) {
      builder.append("id=").append(id);
    }
    if (assigner != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("assigner=").append(assigner);
    }
    if (system != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("system=").append(system);
    }
    if (period != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("period=").append(period);
    }
    if (use != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("use=").append(use);
    }
    if (extension != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (value != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("value=").append(value);
    }
    if (type != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("type=").append(type);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "Identifier", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Identifier {
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<Reference> assigner = Optional.empty();
    boolean assignerIsSet;
    @Nullable Optional<Uri> system = Optional.empty();
    boolean systemIsSet;
    @Nullable Optional<Period> period = Optional.empty();
    boolean periodIsSet;
    @Nullable Optional<IdentifierUse> use = Optional.empty();
    boolean useIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<String> value = Optional.empty();
    boolean valueIsSet;
    @Nullable Optional<CodeableConcept> type = Optional.empty();
    boolean typeIsSet;
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("assigner")
    public void setAssigner(Optional<Reference> assigner) {
      this.assigner = assigner;
      this.assignerIsSet = true;
    }
    @JsonProperty("system")
    public void setSystem(Optional<Uri> system) {
      this.system = system;
      this.systemIsSet = true;
    }
    @JsonProperty("period")
    public void setPeriod(Optional<Period> period) {
      this.period = period;
      this.periodIsSet = true;
    }
    @JsonProperty("use")
    public void setUse(Optional<IdentifierUse> use) {
      this.use = use;
      this.useIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("value")
    public void setValue(Optional<String> value) {
      this.value = value;
      this.valueIsSet = true;
    }
    @JsonProperty("type")
    public void setType(Optional<CodeableConcept> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> assigner() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> system() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Period> period() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<IdentifierUse> use() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> value() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> type() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableIdentifier fromJson(Json json) {
    ImmutableIdentifier.Builder builder = ImmutableIdentifier.builder();
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.assignerIsSet) {
      builder.assigner(json.assigner);
    }
    if (json.systemIsSet) {
      builder.system(json.system);
    }
    if (json.periodIsSet) {
      builder.period(json.period);
    }
    if (json.useIsSet) {
      builder.use(json.use);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.valueIsSet) {
      builder.value(json.value);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    return (ImmutableIdentifier) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Identifier} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Identifier instance
   */
  public static Identifier copyOf(Identifier instance) {
    if (instance instanceof ImmutableIdentifier) {
      return (ImmutableIdentifier) instance;
    }
    return ImmutableIdentifier.builder()
        .id(instance.id())
        .assigner(instance.assigner())
        .system(instance.system())
        .period(instance.period())
        .use(instance.use())
        .extension(instance.extension())
        .value(instance.value())
        .type(instance.type())
        .build();
  }

  /**
   * Creates a builder for {@link Identifier Identifier}.
   * <pre>
   * ImmutableIdentifier.builder()
   *    .id(String) // optional {@link Identifier#id() id}
   *    .assigner(com.fhir.types.fhir.Reference) // optional {@link Identifier#assigner() assigner}
   *    .system(com.fhir.types.fhir.Uri) // optional {@link Identifier#system() system}
   *    .period(com.fhir.types.fhir.Period) // optional {@link Identifier#period() period}
   *    .use(com.fhir.types.fhir.IdentifierUse) // optional {@link Identifier#use() use}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link Identifier#extension() extension}
   *    .value(String) // optional {@link Identifier#value() value}
   *    .type(com.fhir.types.fhir.CodeableConcept) // optional {@link Identifier#type() type}
   *    .build();
   * </pre>
   * @return A new Identifier builder
   */
  public static ImmutableIdentifier.Builder builder() {
    return new ImmutableIdentifier.Builder();
  }

  /**
   * Builds instances of type {@link Identifier Identifier}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Identifier", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_ID = 0x1L;
    private static final long OPT_BIT_ASSIGNER = 0x2L;
    private static final long OPT_BIT_SYSTEM = 0x4L;
    private static final long OPT_BIT_PERIOD = 0x8L;
    private static final long OPT_BIT_USE = 0x10L;
    private static final long OPT_BIT_EXTENSION = 0x20L;
    private static final long OPT_BIT_VALUE = 0x40L;
    private static final long OPT_BIT_TYPE = 0x80L;
    private long optBits;

    private @Nullable String id;
    private @Nullable Reference assigner;
    private @Nullable Uri system;
    private @Nullable Period period;
    private @Nullable IdentifierUse use;
    private @Nullable List<Extension> extension;
    private @Nullable String value;
    private @Nullable CodeableConcept type;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Identifier#id() id} to id.
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
     * Initializes the optional value {@link Identifier#id() id} to id.
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
     * Initializes the optional value {@link Identifier#assigner() assigner} to assigner.
     * @param assigner The value for assigner
     * @return {@code this} builder for chained invocation
     */
    public final Builder assigner(Reference assigner) {
      checkNotIsSet(assignerIsSet(), "assigner");
      this.assigner = Objects.requireNonNull(assigner, "assigner");
      optBits |= OPT_BIT_ASSIGNER;
      return this;
    }

    /**
     * Initializes the optional value {@link Identifier#assigner() assigner} to assigner.
     * @param assigner The value for assigner
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("assigner")
    public final Builder assigner(Optional<? extends Reference> assigner) {
      checkNotIsSet(assignerIsSet(), "assigner");
      this.assigner = assigner.orElse(null);
      optBits |= OPT_BIT_ASSIGNER;
      return this;
    }

    /**
     * Initializes the optional value {@link Identifier#system() system} to system.
     * @param system The value for system
     * @return {@code this} builder for chained invocation
     */
    public final Builder system(Uri system) {
      checkNotIsSet(systemIsSet(), "system");
      this.system = Objects.requireNonNull(system, "system");
      optBits |= OPT_BIT_SYSTEM;
      return this;
    }

    /**
     * Initializes the optional value {@link Identifier#system() system} to system.
     * @param system The value for system
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("system")
    public final Builder system(Optional<? extends Uri> system) {
      checkNotIsSet(systemIsSet(), "system");
      this.system = system.orElse(null);
      optBits |= OPT_BIT_SYSTEM;
      return this;
    }

    /**
     * Initializes the optional value {@link Identifier#period() period} to period.
     * @param period The value for period
     * @return {@code this} builder for chained invocation
     */
    public final Builder period(Period period) {
      checkNotIsSet(periodIsSet(), "period");
      this.period = Objects.requireNonNull(period, "period");
      optBits |= OPT_BIT_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link Identifier#period() period} to period.
     * @param period The value for period
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("period")
    public final Builder period(Optional<? extends Period> period) {
      checkNotIsSet(periodIsSet(), "period");
      this.period = period.orElse(null);
      optBits |= OPT_BIT_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link Identifier#use() use} to use.
     * @param use The value for use
     * @return {@code this} builder for chained invocation
     */
    public final Builder use(IdentifierUse use) {
      checkNotIsSet(useIsSet(), "use");
      this.use = Objects.requireNonNull(use, "use");
      optBits |= OPT_BIT_USE;
      return this;
    }

    /**
     * Initializes the optional value {@link Identifier#use() use} to use.
     * @param use The value for use
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("use")
    public final Builder use(Optional<? extends IdentifierUse> use) {
      checkNotIsSet(useIsSet(), "use");
      this.use = use.orElse(null);
      optBits |= OPT_BIT_USE;
      return this;
    }

    /**
     * Initializes the optional value {@link Identifier#extension() extension} to extension.
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
     * Initializes the optional value {@link Identifier#extension() extension} to extension.
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
     * Initializes the optional value {@link Identifier#value() value} to value.
     * @param value The value for value
     * @return {@code this} builder for chained invocation
     */
    public final Builder value(String value) {
      checkNotIsSet(valueIsSet(), "value");
      this.value = Objects.requireNonNull(value, "value");
      optBits |= OPT_BIT_VALUE;
      return this;
    }

    /**
     * Initializes the optional value {@link Identifier#value() value} to value.
     * @param value The value for value
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("value")
    public final Builder value(Optional<String> value) {
      checkNotIsSet(valueIsSet(), "value");
      this.value = value.orElse(null);
      optBits |= OPT_BIT_VALUE;
      return this;
    }

    /**
     * Initializes the optional value {@link Identifier#type() type} to type.
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
     * Initializes the optional value {@link Identifier#type() type} to type.
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
     * Builds a new {@link Identifier Identifier}.
     * @return An immutable instance of Identifier
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Identifier build() {
      return new ImmutableIdentifier(id, assigner, system, period, use, extension, value, type);
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean assignerIsSet() {
      return (optBits & OPT_BIT_ASSIGNER) != 0;
    }

    private boolean systemIsSet() {
      return (optBits & OPT_BIT_SYSTEM) != 0;
    }

    private boolean periodIsSet() {
      return (optBits & OPT_BIT_PERIOD) != 0;
    }

    private boolean useIsSet() {
      return (optBits & OPT_BIT_USE) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean valueIsSet() {
      return (optBits & OPT_BIT_VALUE) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Identifier is strict, attribute is already set: ".concat(name));
    }
  }
}
