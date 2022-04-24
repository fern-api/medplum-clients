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
 * Immutable implementation of {@link Specimen_Processing}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableSpecimen_Processing.builder()}.
 */
@Generated(from = "Specimen_Processing", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableSpecimen_Processing implements Specimen_Processing {
  private final @Nullable Period timePeriod;
  private final @Nullable List<Reference> additive;
  private final @Nullable String description;
  private final @Nullable String id;
  private final @Nullable List<Extension> extension;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable String timeDateTime;
  private final @Nullable CodeableConcept procedure;

  private ImmutableSpecimen_Processing(
      @Nullable Period timePeriod,
      @Nullable List<Reference> additive,
      @Nullable String description,
      @Nullable String id,
      @Nullable List<Extension> extension,
      @Nullable List<Extension> modifierExtension,
      @Nullable String timeDateTime,
      @Nullable CodeableConcept procedure) {
    this.timePeriod = timePeriod;
    this.additive = additive;
    this.description = description;
    this.id = id;
    this.extension = extension;
    this.modifierExtension = modifierExtension;
    this.timeDateTime = timeDateTime;
    this.procedure = procedure;
  }

  /**
   * @return The value of the {@code timePeriod} attribute
   */
  @JsonProperty("timePeriod")
  @Override
  public Optional<Period> timePeriod() {
    return Optional.ofNullable(timePeriod);
  }

  /**
   * @return The value of the {@code additive} attribute
   */
  @JsonProperty("additive")
  @Override
  public Optional<List<Reference>> additive() {
    return Optional.ofNullable(additive);
  }

  /**
   * @return The value of the {@code description} attribute
   */
  @JsonProperty("description")
  @Override
  public Optional<String> description() {
    return Optional.ofNullable(description);
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
   * @return The value of the {@code timeDateTime} attribute
   */
  @JsonProperty("timeDateTime")
  @Override
  public Optional<String> timeDateTime() {
    return Optional.ofNullable(timeDateTime);
  }

  /**
   * @return The value of the {@code procedure} attribute
   */
  @JsonProperty("procedure")
  @Override
  public Optional<CodeableConcept> procedure() {
    return Optional.ofNullable(procedure);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Specimen_Processing#timePeriod() timePeriod} attribute.
   * @param value The value for timePeriod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimen_Processing withTimePeriod(Period value) {
    @Nullable Period newValue = Objects.requireNonNull(value, "timePeriod");
    if (this.timePeriod == newValue) return this;
    return new ImmutableSpecimen_Processing(
        newValue,
        this.additive,
        this.description,
        this.id,
        this.extension,
        this.modifierExtension,
        this.timeDateTime,
        this.procedure);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Specimen_Processing#timePeriod() timePeriod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for timePeriod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSpecimen_Processing withTimePeriod(Optional<? extends Period> optional) {
    @Nullable Period value = optional.orElse(null);
    if (this.timePeriod == value) return this;
    return new ImmutableSpecimen_Processing(
        value,
        this.additive,
        this.description,
        this.id,
        this.extension,
        this.modifierExtension,
        this.timeDateTime,
        this.procedure);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Specimen_Processing#additive() additive} attribute.
   * @param value The value for additive
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimen_Processing withAdditive(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "additive");
    if (this.additive == newValue) return this;
    return new ImmutableSpecimen_Processing(
        this.timePeriod,
        newValue,
        this.description,
        this.id,
        this.extension,
        this.modifierExtension,
        this.timeDateTime,
        this.procedure);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Specimen_Processing#additive() additive} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for additive
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSpecimen_Processing withAdditive(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.additive == value) return this;
    return new ImmutableSpecimen_Processing(
        this.timePeriod,
        value,
        this.description,
        this.id,
        this.extension,
        this.modifierExtension,
        this.timeDateTime,
        this.procedure);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Specimen_Processing#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimen_Processing withDescription(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "description");
    if (Objects.equals(this.description, newValue)) return this;
    return new ImmutableSpecimen_Processing(
        this.timePeriod,
        this.additive,
        newValue,
        this.id,
        this.extension,
        this.modifierExtension,
        this.timeDateTime,
        this.procedure);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Specimen_Processing#description() description} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimen_Processing withDescription(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.description, value)) return this;
    return new ImmutableSpecimen_Processing(
        this.timePeriod,
        this.additive,
        value,
        this.id,
        this.extension,
        this.modifierExtension,
        this.timeDateTime,
        this.procedure);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Specimen_Processing#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimen_Processing withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableSpecimen_Processing(
        this.timePeriod,
        this.additive,
        this.description,
        newValue,
        this.extension,
        this.modifierExtension,
        this.timeDateTime,
        this.procedure);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Specimen_Processing#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimen_Processing withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableSpecimen_Processing(
        this.timePeriod,
        this.additive,
        this.description,
        value,
        this.extension,
        this.modifierExtension,
        this.timeDateTime,
        this.procedure);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Specimen_Processing#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimen_Processing withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableSpecimen_Processing(
        this.timePeriod,
        this.additive,
        this.description,
        this.id,
        newValue,
        this.modifierExtension,
        this.timeDateTime,
        this.procedure);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Specimen_Processing#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSpecimen_Processing withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableSpecimen_Processing(
        this.timePeriod,
        this.additive,
        this.description,
        this.id,
        value,
        this.modifierExtension,
        this.timeDateTime,
        this.procedure);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Specimen_Processing#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimen_Processing withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableSpecimen_Processing(
        this.timePeriod,
        this.additive,
        this.description,
        this.id,
        this.extension,
        newValue,
        this.timeDateTime,
        this.procedure);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Specimen_Processing#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSpecimen_Processing withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableSpecimen_Processing(
        this.timePeriod,
        this.additive,
        this.description,
        this.id,
        this.extension,
        value,
        this.timeDateTime,
        this.procedure);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Specimen_Processing#timeDateTime() timeDateTime} attribute.
   * @param value The value for timeDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimen_Processing withTimeDateTime(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "timeDateTime");
    if (Objects.equals(this.timeDateTime, newValue)) return this;
    return new ImmutableSpecimen_Processing(
        this.timePeriod,
        this.additive,
        this.description,
        this.id,
        this.extension,
        this.modifierExtension,
        newValue,
        this.procedure);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Specimen_Processing#timeDateTime() timeDateTime} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for timeDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimen_Processing withTimeDateTime(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.timeDateTime, value)) return this;
    return new ImmutableSpecimen_Processing(
        this.timePeriod,
        this.additive,
        this.description,
        this.id,
        this.extension,
        this.modifierExtension,
        value,
        this.procedure);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Specimen_Processing#procedure() procedure} attribute.
   * @param value The value for procedure
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimen_Processing withProcedure(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "procedure");
    if (this.procedure == newValue) return this;
    return new ImmutableSpecimen_Processing(
        this.timePeriod,
        this.additive,
        this.description,
        this.id,
        this.extension,
        this.modifierExtension,
        this.timeDateTime,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Specimen_Processing#procedure() procedure} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for procedure
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSpecimen_Processing withProcedure(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.procedure == value) return this;
    return new ImmutableSpecimen_Processing(
        this.timePeriod,
        this.additive,
        this.description,
        this.id,
        this.extension,
        this.modifierExtension,
        this.timeDateTime,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableSpecimen_Processing} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableSpecimen_Processing
        && equalTo((ImmutableSpecimen_Processing) another);
  }

  private boolean equalTo(ImmutableSpecimen_Processing another) {
    return Objects.equals(timePeriod, another.timePeriod)
        && Objects.equals(additive, another.additive)
        && Objects.equals(description, another.description)
        && Objects.equals(id, another.id)
        && Objects.equals(extension, another.extension)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(timeDateTime, another.timeDateTime)
        && Objects.equals(procedure, another.procedure);
  }

  /**
   * Computes a hash code from attributes: {@code timePeriod}, {@code additive}, {@code description}, {@code id}, {@code extension}, {@code modifierExtension}, {@code timeDateTime}, {@code procedure}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(timePeriod);
    h += (h << 5) + Objects.hashCode(additive);
    h += (h << 5) + Objects.hashCode(description);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(timeDateTime);
    h += (h << 5) + Objects.hashCode(procedure);
    return h;
  }

  /**
   * Prints the immutable value {@code Specimen_Processing} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Specimen_Processing{");
    if (timePeriod != null) {
      builder.append("timePeriod=").append(timePeriod);
    }
    if (additive != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("additive=").append(additive);
    }
    if (description != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("description=").append(description);
    }
    if (id != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (extension != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (modifierExtension != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (timeDateTime != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("timeDateTime=").append(timeDateTime);
    }
    if (procedure != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("procedure=").append(procedure);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "Specimen_Processing", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Specimen_Processing {
    @Nullable Optional<Period> timePeriod = Optional.empty();
    boolean timePeriodIsSet;
    @Nullable Optional<List<Reference>> additive = Optional.empty();
    boolean additiveIsSet;
    @Nullable Optional<String> description = Optional.empty();
    boolean descriptionIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<String> timeDateTime = Optional.empty();
    boolean timeDateTimeIsSet;
    @Nullable Optional<CodeableConcept> procedure = Optional.empty();
    boolean procedureIsSet;
    @JsonProperty("timePeriod")
    public void setTimePeriod(Optional<Period> timePeriod) {
      this.timePeriod = timePeriod;
      this.timePeriodIsSet = true;
    }
    @JsonProperty("additive")
    public void setAdditive(Optional<List<Reference>> additive) {
      this.additive = additive;
      this.additiveIsSet = true;
    }
    @JsonProperty("description")
    public void setDescription(Optional<String> description) {
      this.description = description;
      this.descriptionIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
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
    @JsonProperty("timeDateTime")
    public void setTimeDateTime(Optional<String> timeDateTime) {
      this.timeDateTime = timeDateTime;
      this.timeDateTimeIsSet = true;
    }
    @JsonProperty("procedure")
    public void setProcedure(Optional<CodeableConcept> procedure) {
      this.procedure = procedure;
      this.procedureIsSet = true;
    }
    @Override
    public Optional<Period> timePeriod() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> additive() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> description() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> timeDateTime() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> procedure() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableSpecimen_Processing fromJson(Json json) {
    ImmutableSpecimen_Processing.Builder builder = ImmutableSpecimen_Processing.builder();
    if (json.timePeriodIsSet) {
      builder.timePeriod(json.timePeriod);
    }
    if (json.additiveIsSet) {
      builder.additive(json.additive);
    }
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.timeDateTimeIsSet) {
      builder.timeDateTime(json.timeDateTime);
    }
    if (json.procedureIsSet) {
      builder.procedure(json.procedure);
    }
    return (ImmutableSpecimen_Processing) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Specimen_Processing} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Specimen_Processing instance
   */
  public static Specimen_Processing copyOf(Specimen_Processing instance) {
    if (instance instanceof ImmutableSpecimen_Processing) {
      return (ImmutableSpecimen_Processing) instance;
    }
    return ImmutableSpecimen_Processing.builder()
        .timePeriod(instance.timePeriod())
        .additive(instance.additive())
        .description(instance.description())
        .id(instance.id())
        .extension(instance.extension())
        .modifierExtension(instance.modifierExtension())
        .timeDateTime(instance.timeDateTime())
        .procedure(instance.procedure())
        .build();
  }

  /**
   * Creates a builder for {@link Specimen_Processing Specimen_Processing}.
   * <pre>
   * ImmutableSpecimen_Processing.builder()
   *    .timePeriod(com.fhir.Period) // optional {@link Specimen_Processing#timePeriod() timePeriod}
   *    .additive(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link Specimen_Processing#additive() additive}
   *    .description(String) // optional {@link Specimen_Processing#description() description}
   *    .id(String) // optional {@link Specimen_Processing#id() id}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Specimen_Processing#extension() extension}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Specimen_Processing#modifierExtension() modifierExtension}
   *    .timeDateTime(String) // optional {@link Specimen_Processing#timeDateTime() timeDateTime}
   *    .procedure(com.fhir.CodeableConcept) // optional {@link Specimen_Processing#procedure() procedure}
   *    .build();
   * </pre>
   * @return A new Specimen_Processing builder
   */
  public static ImmutableSpecimen_Processing.Builder builder() {
    return new ImmutableSpecimen_Processing.Builder();
  }

  /**
   * Builds instances of type {@link Specimen_Processing Specimen_Processing}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Specimen_Processing", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_TIME_PERIOD = 0x1L;
    private static final long OPT_BIT_ADDITIVE = 0x2L;
    private static final long OPT_BIT_DESCRIPTION = 0x4L;
    private static final long OPT_BIT_ID = 0x8L;
    private static final long OPT_BIT_EXTENSION = 0x10L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x20L;
    private static final long OPT_BIT_TIME_DATE_TIME = 0x40L;
    private static final long OPT_BIT_PROCEDURE = 0x80L;
    private long optBits;

    private @Nullable Period timePeriod;
    private @Nullable List<Reference> additive;
    private @Nullable String description;
    private @Nullable String id;
    private @Nullable List<Extension> extension;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable String timeDateTime;
    private @Nullable CodeableConcept procedure;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Specimen_Processing#timePeriod() timePeriod} to timePeriod.
     * @param timePeriod The value for timePeriod
     * @return {@code this} builder for chained invocation
     */
    public final Builder timePeriod(Period timePeriod) {
      checkNotIsSet(timePeriodIsSet(), "timePeriod");
      this.timePeriod = Objects.requireNonNull(timePeriod, "timePeriod");
      optBits |= OPT_BIT_TIME_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link Specimen_Processing#timePeriod() timePeriod} to timePeriod.
     * @param timePeriod The value for timePeriod
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("timePeriod")
    public final Builder timePeriod(Optional<? extends Period> timePeriod) {
      checkNotIsSet(timePeriodIsSet(), "timePeriod");
      this.timePeriod = timePeriod.orElse(null);
      optBits |= OPT_BIT_TIME_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link Specimen_Processing#additive() additive} to additive.
     * @param additive The value for additive
     * @return {@code this} builder for chained invocation
     */
    public final Builder additive(List<Reference> additive) {
      checkNotIsSet(additiveIsSet(), "additive");
      this.additive = Objects.requireNonNull(additive, "additive");
      optBits |= OPT_BIT_ADDITIVE;
      return this;
    }

    /**
     * Initializes the optional value {@link Specimen_Processing#additive() additive} to additive.
     * @param additive The value for additive
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("additive")
    public final Builder additive(Optional<? extends List<Reference>> additive) {
      checkNotIsSet(additiveIsSet(), "additive");
      this.additive = additive.orElse(null);
      optBits |= OPT_BIT_ADDITIVE;
      return this;
    }

    /**
     * Initializes the optional value {@link Specimen_Processing#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    public final Builder description(String description) {
      checkNotIsSet(descriptionIsSet(), "description");
      this.description = Objects.requireNonNull(description, "description");
      optBits |= OPT_BIT_DESCRIPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link Specimen_Processing#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("description")
    public final Builder description(Optional<String> description) {
      checkNotIsSet(descriptionIsSet(), "description");
      this.description = description.orElse(null);
      optBits |= OPT_BIT_DESCRIPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link Specimen_Processing#id() id} to id.
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
     * Initializes the optional value {@link Specimen_Processing#id() id} to id.
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
     * Initializes the optional value {@link Specimen_Processing#extension() extension} to extension.
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
     * Initializes the optional value {@link Specimen_Processing#extension() extension} to extension.
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
     * Initializes the optional value {@link Specimen_Processing#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Specimen_Processing#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Specimen_Processing#timeDateTime() timeDateTime} to timeDateTime.
     * @param timeDateTime The value for timeDateTime
     * @return {@code this} builder for chained invocation
     */
    public final Builder timeDateTime(String timeDateTime) {
      checkNotIsSet(timeDateTimeIsSet(), "timeDateTime");
      this.timeDateTime = Objects.requireNonNull(timeDateTime, "timeDateTime");
      optBits |= OPT_BIT_TIME_DATE_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link Specimen_Processing#timeDateTime() timeDateTime} to timeDateTime.
     * @param timeDateTime The value for timeDateTime
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("timeDateTime")
    public final Builder timeDateTime(Optional<String> timeDateTime) {
      checkNotIsSet(timeDateTimeIsSet(), "timeDateTime");
      this.timeDateTime = timeDateTime.orElse(null);
      optBits |= OPT_BIT_TIME_DATE_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link Specimen_Processing#procedure() procedure} to procedure.
     * @param procedure The value for procedure
     * @return {@code this} builder for chained invocation
     */
    public final Builder procedure(CodeableConcept procedure) {
      checkNotIsSet(procedureIsSet(), "procedure");
      this.procedure = Objects.requireNonNull(procedure, "procedure");
      optBits |= OPT_BIT_PROCEDURE;
      return this;
    }

    /**
     * Initializes the optional value {@link Specimen_Processing#procedure() procedure} to procedure.
     * @param procedure The value for procedure
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("procedure")
    public final Builder procedure(Optional<? extends CodeableConcept> procedure) {
      checkNotIsSet(procedureIsSet(), "procedure");
      this.procedure = procedure.orElse(null);
      optBits |= OPT_BIT_PROCEDURE;
      return this;
    }

    /**
     * Builds a new {@link Specimen_Processing Specimen_Processing}.
     * @return An immutable instance of Specimen_Processing
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Specimen_Processing build() {
      return new ImmutableSpecimen_Processing(timePeriod, additive, description, id, extension, modifierExtension, timeDateTime, procedure);
    }

    private boolean timePeriodIsSet() {
      return (optBits & OPT_BIT_TIME_PERIOD) != 0;
    }

    private boolean additiveIsSet() {
      return (optBits & OPT_BIT_ADDITIVE) != 0;
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean timeDateTimeIsSet() {
      return (optBits & OPT_BIT_TIME_DATE_TIME) != 0;
    }

    private boolean procedureIsSet() {
      return (optBits & OPT_BIT_PROCEDURE) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Specimen_Processing is strict, attribute is already set: ".concat(name));
    }
  }
}
