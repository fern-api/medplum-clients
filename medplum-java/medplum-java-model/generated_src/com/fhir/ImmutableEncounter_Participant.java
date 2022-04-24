package com.fhir;

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
 * Immutable implementation of {@link Encounter_Participant}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableEncounter_Participant.builder()}.
 */
@Generated(from = "Encounter_Participant", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableEncounter_Participant implements Encounter_Participant {
  private final @Nullable List<Extension> extension;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable List<CodeableConcept> type;
  private final @Nullable Period period;
  private final @Nullable Reference individual;
  private final @Nullable String id;

  private ImmutableEncounter_Participant(
      @Nullable List<Extension> extension,
      @Nullable List<Extension> modifierExtension,
      @Nullable List<CodeableConcept> type,
      @Nullable Period period,
      @Nullable Reference individual,
      @Nullable String id) {
    this.extension = extension;
    this.modifierExtension = modifierExtension;
    this.type = type;
    this.period = period;
    this.individual = individual;
    this.id = id;
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
   * @return The value of the {@code type} attribute
   */
  @JsonProperty("type")
  @Override
  public Optional<List<CodeableConcept>> type() {
    return Optional.ofNullable(type);
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
   * @return The value of the {@code individual} attribute
   */
  @JsonProperty("individual")
  @Override
  public Optional<Reference> individual() {
    return Optional.ofNullable(individual);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Encounter_Participant#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEncounter_Participant withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableEncounter_Participant(newValue, this.modifierExtension, this.type, this.period, this.individual, this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Encounter_Participant#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEncounter_Participant withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableEncounter_Participant(value, this.modifierExtension, this.type, this.period, this.individual, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Encounter_Participant#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEncounter_Participant withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableEncounter_Participant(this.extension, newValue, this.type, this.period, this.individual, this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Encounter_Participant#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEncounter_Participant withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableEncounter_Participant(this.extension, value, this.type, this.period, this.individual, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Encounter_Participant#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEncounter_Participant withType(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableEncounter_Participant(this.extension, this.modifierExtension, newValue, this.period, this.individual, this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Encounter_Participant#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEncounter_Participant withType(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableEncounter_Participant(this.extension, this.modifierExtension, value, this.period, this.individual, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Encounter_Participant#period() period} attribute.
   * @param value The value for period
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEncounter_Participant withPeriod(Period value) {
    @Nullable Period newValue = Objects.requireNonNull(value, "period");
    if (this.period == newValue) return this;
    return new ImmutableEncounter_Participant(this.extension, this.modifierExtension, this.type, newValue, this.individual, this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Encounter_Participant#period() period} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for period
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEncounter_Participant withPeriod(Optional<? extends Period> optional) {
    @Nullable Period value = optional.orElse(null);
    if (this.period == value) return this;
    return new ImmutableEncounter_Participant(this.extension, this.modifierExtension, this.type, value, this.individual, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Encounter_Participant#individual() individual} attribute.
   * @param value The value for individual
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEncounter_Participant withIndividual(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "individual");
    if (this.individual == newValue) return this;
    return new ImmutableEncounter_Participant(this.extension, this.modifierExtension, this.type, this.period, newValue, this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Encounter_Participant#individual() individual} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for individual
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEncounter_Participant withIndividual(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.individual == value) return this;
    return new ImmutableEncounter_Participant(this.extension, this.modifierExtension, this.type, this.period, value, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Encounter_Participant#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEncounter_Participant withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableEncounter_Participant(this.extension, this.modifierExtension, this.type, this.period, this.individual, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Encounter_Participant#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEncounter_Participant withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableEncounter_Participant(this.extension, this.modifierExtension, this.type, this.period, this.individual, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableEncounter_Participant} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableEncounter_Participant
        && equalTo((ImmutableEncounter_Participant) another);
  }

  private boolean equalTo(ImmutableEncounter_Participant another) {
    return Objects.equals(extension, another.extension)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(type, another.type)
        && Objects.equals(period, another.period)
        && Objects.equals(individual, another.individual)
        && Objects.equals(id, another.id);
  }

  /**
   * Computes a hash code from attributes: {@code extension}, {@code modifierExtension}, {@code type}, {@code period}, {@code individual}, {@code id}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(type);
    h += (h << 5) + Objects.hashCode(period);
    h += (h << 5) + Objects.hashCode(individual);
    h += (h << 5) + Objects.hashCode(id);
    return h;
  }

  /**
   * Prints the immutable value {@code Encounter_Participant} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Encounter_Participant{");
    if (extension != null) {
      builder.append("extension=").append(extension);
    }
    if (modifierExtension != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (type != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("type=").append(type);
    }
    if (period != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("period=").append(period);
    }
    if (individual != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("individual=").append(individual);
    }
    if (id != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("id=").append(id);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "Encounter_Participant", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Encounter_Participant {
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<List<CodeableConcept>> type = Optional.empty();
    boolean typeIsSet;
    @Nullable Optional<Period> period = Optional.empty();
    boolean periodIsSet;
    @Nullable Optional<Reference> individual = Optional.empty();
    boolean individualIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
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
    @JsonProperty("type")
    public void setType(Optional<List<CodeableConcept>> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @JsonProperty("period")
    public void setPeriod(Optional<Period> period) {
      this.period = period;
      this.periodIsSet = true;
    }
    @JsonProperty("individual")
    public void setIndividual(Optional<Reference> individual) {
      this.individual = individual;
      this.individualIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> type() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Period> period() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> individual() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableEncounter_Participant fromJson(Json json) {
    ImmutableEncounter_Participant.Builder builder = ImmutableEncounter_Participant.builder();
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.periodIsSet) {
      builder.period(json.period);
    }
    if (json.individualIsSet) {
      builder.individual(json.individual);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    return (ImmutableEncounter_Participant) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Encounter_Participant} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Encounter_Participant instance
   */
  public static Encounter_Participant copyOf(Encounter_Participant instance) {
    if (instance instanceof ImmutableEncounter_Participant) {
      return (ImmutableEncounter_Participant) instance;
    }
    return ImmutableEncounter_Participant.builder()
        .extension(instance.extension())
        .modifierExtension(instance.modifierExtension())
        .type(instance.type())
        .period(instance.period())
        .individual(instance.individual())
        .id(instance.id())
        .build();
  }

  /**
   * Creates a builder for {@link Encounter_Participant Encounter_Participant}.
   * <pre>
   * ImmutableEncounter_Participant.builder()
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Encounter_Participant#extension() extension}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Encounter_Participant#modifierExtension() modifierExtension}
   *    .type(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link Encounter_Participant#type() type}
   *    .period(com.fhir.Period) // optional {@link Encounter_Participant#period() period}
   *    .individual(com.fhir.Reference) // optional {@link Encounter_Participant#individual() individual}
   *    .id(String) // optional {@link Encounter_Participant#id() id}
   *    .build();
   * </pre>
   * @return A new Encounter_Participant builder
   */
  public static ImmutableEncounter_Participant.Builder builder() {
    return new ImmutableEncounter_Participant.Builder();
  }

  /**
   * Builds instances of type {@link Encounter_Participant Encounter_Participant}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Encounter_Participant", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_EXTENSION = 0x1L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x2L;
    private static final long OPT_BIT_TYPE = 0x4L;
    private static final long OPT_BIT_PERIOD = 0x8L;
    private static final long OPT_BIT_INDIVIDUAL = 0x10L;
    private static final long OPT_BIT_ID = 0x20L;
    private long optBits;

    private @Nullable List<Extension> extension;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable List<CodeableConcept> type;
    private @Nullable Period period;
    private @Nullable Reference individual;
    private @Nullable String id;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Encounter_Participant#extension() extension} to extension.
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
     * Initializes the optional value {@link Encounter_Participant#extension() extension} to extension.
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
     * Initializes the optional value {@link Encounter_Participant#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Encounter_Participant#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Encounter_Participant#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    public final Builder type(List<CodeableConcept> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = Objects.requireNonNull(type, "type");
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Encounter_Participant#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("type")
    public final Builder type(Optional<? extends List<CodeableConcept>> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = type.orElse(null);
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Encounter_Participant#period() period} to period.
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
     * Initializes the optional value {@link Encounter_Participant#period() period} to period.
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
     * Initializes the optional value {@link Encounter_Participant#individual() individual} to individual.
     * @param individual The value for individual
     * @return {@code this} builder for chained invocation
     */
    public final Builder individual(Reference individual) {
      checkNotIsSet(individualIsSet(), "individual");
      this.individual = Objects.requireNonNull(individual, "individual");
      optBits |= OPT_BIT_INDIVIDUAL;
      return this;
    }

    /**
     * Initializes the optional value {@link Encounter_Participant#individual() individual} to individual.
     * @param individual The value for individual
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("individual")
    public final Builder individual(Optional<? extends Reference> individual) {
      checkNotIsSet(individualIsSet(), "individual");
      this.individual = individual.orElse(null);
      optBits |= OPT_BIT_INDIVIDUAL;
      return this;
    }

    /**
     * Initializes the optional value {@link Encounter_Participant#id() id} to id.
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
     * Initializes the optional value {@link Encounter_Participant#id() id} to id.
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
     * Builds a new {@link Encounter_Participant Encounter_Participant}.
     * @return An immutable instance of Encounter_Participant
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Encounter_Participant build() {
      return new ImmutableEncounter_Participant(extension, modifierExtension, type, period, individual, id);
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean periodIsSet() {
      return (optBits & OPT_BIT_PERIOD) != 0;
    }

    private boolean individualIsSet() {
      return (optBits & OPT_BIT_INDIVIDUAL) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Encounter_Participant is strict, attribute is already set: ".concat(name));
    }
  }
}
