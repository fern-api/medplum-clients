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
 * Immutable implementation of {@link Appointment_Participant}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableAppointment_Participant.builder()}.
 */
@Generated(from = "Appointment_Participant", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableAppointment_Participant implements Appointment_Participant {
  private final @Nullable List<CodeableConcept> type;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable Appointment_participantRequired required;
  private final @Nullable Reference actor;
  private final @Nullable Appointment_participantStatus status;
  private final @Nullable List<Extension> extension;
  private final @Nullable String id;
  private final @Nullable Period period;

  private ImmutableAppointment_Participant(
      @Nullable List<CodeableConcept> type,
      @Nullable List<Extension> modifierExtension,
      @Nullable Appointment_participantRequired required,
      @Nullable Reference actor,
      @Nullable Appointment_participantStatus status,
      @Nullable List<Extension> extension,
      @Nullable String id,
      @Nullable Period period) {
    this.type = type;
    this.modifierExtension = modifierExtension;
    this.required = required;
    this.actor = actor;
    this.status = status;
    this.extension = extension;
    this.id = id;
    this.period = period;
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @JsonProperty("modifierExtension")
  @Override
  public Optional<List<Extension>> modifierExtension() {
    return Optional.ofNullable(modifierExtension);
  }

  /**
   * @return The value of the {@code required} attribute
   */
  @JsonProperty("required")
  @Override
  public Optional<Appointment_participantRequired> required() {
    return Optional.ofNullable(required);
  }

  /**
   * @return The value of the {@code actor} attribute
   */
  @JsonProperty("actor")
  @Override
  public Optional<Reference> actor() {
    return Optional.ofNullable(actor);
  }

  /**
   * @return The value of the {@code status} attribute
   */
  @JsonProperty("status")
  @Override
  public Optional<Appointment_participantStatus> status() {
    return Optional.ofNullable(status);
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
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<String> id() {
    return Optional.ofNullable(id);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Appointment_Participant#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAppointment_Participant withType(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableAppointment_Participant(
        newValue,
        this.modifierExtension,
        this.required,
        this.actor,
        this.status,
        this.extension,
        this.id,
        this.period);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Appointment_Participant#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAppointment_Participant withType(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableAppointment_Participant(
        value,
        this.modifierExtension,
        this.required,
        this.actor,
        this.status,
        this.extension,
        this.id,
        this.period);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Appointment_Participant#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAppointment_Participant withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableAppointment_Participant(
        this.type,
        newValue,
        this.required,
        this.actor,
        this.status,
        this.extension,
        this.id,
        this.period);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Appointment_Participant#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAppointment_Participant withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableAppointment_Participant(this.type, value, this.required, this.actor, this.status, this.extension, this.id, this.period);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Appointment_Participant#required() required} attribute.
   * @param value The value for required
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAppointment_Participant withRequired(Appointment_participantRequired value) {
    @Nullable Appointment_participantRequired newValue = Objects.requireNonNull(value, "required");
    if (this.required == newValue) return this;
    return new ImmutableAppointment_Participant(
        this.type,
        this.modifierExtension,
        newValue,
        this.actor,
        this.status,
        this.extension,
        this.id,
        this.period);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Appointment_Participant#required() required} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for required
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAppointment_Participant withRequired(Optional<? extends Appointment_participantRequired> optional) {
    @Nullable Appointment_participantRequired value = optional.orElse(null);
    if (this.required == value) return this;
    return new ImmutableAppointment_Participant(
        this.type,
        this.modifierExtension,
        value,
        this.actor,
        this.status,
        this.extension,
        this.id,
        this.period);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Appointment_Participant#actor() actor} attribute.
   * @param value The value for actor
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAppointment_Participant withActor(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "actor");
    if (this.actor == newValue) return this;
    return new ImmutableAppointment_Participant(
        this.type,
        this.modifierExtension,
        this.required,
        newValue,
        this.status,
        this.extension,
        this.id,
        this.period);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Appointment_Participant#actor() actor} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for actor
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAppointment_Participant withActor(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.actor == value) return this;
    return new ImmutableAppointment_Participant(
        this.type,
        this.modifierExtension,
        this.required,
        value,
        this.status,
        this.extension,
        this.id,
        this.period);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Appointment_Participant#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAppointment_Participant withStatus(Appointment_participantStatus value) {
    @Nullable Appointment_participantStatus newValue = Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableAppointment_Participant(
        this.type,
        this.modifierExtension,
        this.required,
        this.actor,
        newValue,
        this.extension,
        this.id,
        this.period);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Appointment_Participant#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAppointment_Participant withStatus(Optional<? extends Appointment_participantStatus> optional) {
    @Nullable Appointment_participantStatus value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableAppointment_Participant(
        this.type,
        this.modifierExtension,
        this.required,
        this.actor,
        value,
        this.extension,
        this.id,
        this.period);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Appointment_Participant#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAppointment_Participant withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableAppointment_Participant(
        this.type,
        this.modifierExtension,
        this.required,
        this.actor,
        this.status,
        newValue,
        this.id,
        this.period);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Appointment_Participant#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAppointment_Participant withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableAppointment_Participant(
        this.type,
        this.modifierExtension,
        this.required,
        this.actor,
        this.status,
        value,
        this.id,
        this.period);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Appointment_Participant#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAppointment_Participant withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableAppointment_Participant(
        this.type,
        this.modifierExtension,
        this.required,
        this.actor,
        this.status,
        this.extension,
        newValue,
        this.period);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Appointment_Participant#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAppointment_Participant withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableAppointment_Participant(
        this.type,
        this.modifierExtension,
        this.required,
        this.actor,
        this.status,
        this.extension,
        value,
        this.period);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Appointment_Participant#period() period} attribute.
   * @param value The value for period
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAppointment_Participant withPeriod(Period value) {
    @Nullable Period newValue = Objects.requireNonNull(value, "period");
    if (this.period == newValue) return this;
    return new ImmutableAppointment_Participant(
        this.type,
        this.modifierExtension,
        this.required,
        this.actor,
        this.status,
        this.extension,
        this.id,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Appointment_Participant#period() period} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for period
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAppointment_Participant withPeriod(Optional<? extends Period> optional) {
    @Nullable Period value = optional.orElse(null);
    if (this.period == value) return this;
    return new ImmutableAppointment_Participant(
        this.type,
        this.modifierExtension,
        this.required,
        this.actor,
        this.status,
        this.extension,
        this.id,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableAppointment_Participant} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableAppointment_Participant
        && equalTo((ImmutableAppointment_Participant) another);
  }

  private boolean equalTo(ImmutableAppointment_Participant another) {
    return Objects.equals(type, another.type)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(required, another.required)
        && Objects.equals(actor, another.actor)
        && Objects.equals(status, another.status)
        && Objects.equals(extension, another.extension)
        && Objects.equals(id, another.id)
        && Objects.equals(period, another.period);
  }

  /**
   * Computes a hash code from attributes: {@code type}, {@code modifierExtension}, {@code required}, {@code actor}, {@code status}, {@code extension}, {@code id}, {@code period}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(type);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(required);
    h += (h << 5) + Objects.hashCode(actor);
    h += (h << 5) + Objects.hashCode(status);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(period);
    return h;
  }

  /**
   * Prints the immutable value {@code Appointment_Participant} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Appointment_Participant{");
    if (type != null) {
      builder.append("type=").append(type);
    }
    if (modifierExtension != null) {
      if (builder.length() > 24) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (required != null) {
      if (builder.length() > 24) builder.append(", ");
      builder.append("required=").append(required);
    }
    if (actor != null) {
      if (builder.length() > 24) builder.append(", ");
      builder.append("actor=").append(actor);
    }
    if (status != null) {
      if (builder.length() > 24) builder.append(", ");
      builder.append("status=").append(status);
    }
    if (extension != null) {
      if (builder.length() > 24) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (id != null) {
      if (builder.length() > 24) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (period != null) {
      if (builder.length() > 24) builder.append(", ");
      builder.append("period=").append(period);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "Appointment_Participant", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Appointment_Participant {
    @Nullable Optional<List<CodeableConcept>> type = Optional.empty();
    boolean typeIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<Appointment_participantRequired> required = Optional.empty();
    boolean requiredIsSet;
    @Nullable Optional<Reference> actor = Optional.empty();
    boolean actorIsSet;
    @Nullable Optional<Appointment_participantStatus> status = Optional.empty();
    boolean statusIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<Period> period = Optional.empty();
    boolean periodIsSet;
    @JsonProperty("type")
    public void setType(Optional<List<CodeableConcept>> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("required")
    public void setRequired(Optional<Appointment_participantRequired> required) {
      this.required = required;
      this.requiredIsSet = true;
    }
    @JsonProperty("actor")
    public void setActor(Optional<Reference> actor) {
      this.actor = actor;
      this.actorIsSet = true;
    }
    @JsonProperty("status")
    public void setStatus(Optional<Appointment_participantStatus> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("period")
    public void setPeriod(Optional<Period> period) {
      this.period = period;
      this.periodIsSet = true;
    }
    @Override
    public Optional<List<CodeableConcept>> type() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Appointment_participantRequired> required() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> actor() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Appointment_participantStatus> status() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Period> period() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableAppointment_Participant fromJson(Json json) {
    ImmutableAppointment_Participant.Builder builder = ImmutableAppointment_Participant.builder();
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.requiredIsSet) {
      builder.required(json.required);
    }
    if (json.actorIsSet) {
      builder.actor(json.actor);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.periodIsSet) {
      builder.period(json.period);
    }
    return (ImmutableAppointment_Participant) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Appointment_Participant} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Appointment_Participant instance
   */
  public static Appointment_Participant copyOf(Appointment_Participant instance) {
    if (instance instanceof ImmutableAppointment_Participant) {
      return (ImmutableAppointment_Participant) instance;
    }
    return ImmutableAppointment_Participant.builder()
        .type(instance.type())
        .modifierExtension(instance.modifierExtension())
        .required(instance.required())
        .actor(instance.actor())
        .status(instance.status())
        .extension(instance.extension())
        .id(instance.id())
        .period(instance.period())
        .build();
  }

  /**
   * Creates a builder for {@link Appointment_Participant Appointment_Participant}.
   * <pre>
   * ImmutableAppointment_Participant.builder()
   *    .type(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link Appointment_Participant#type() type}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Appointment_Participant#modifierExtension() modifierExtension}
   *    .required(com.fhir.Appointment_participantRequired) // optional {@link Appointment_Participant#required() required}
   *    .actor(com.fhir.Reference) // optional {@link Appointment_Participant#actor() actor}
   *    .status(com.fhir.Appointment_participantStatus) // optional {@link Appointment_Participant#status() status}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Appointment_Participant#extension() extension}
   *    .id(String) // optional {@link Appointment_Participant#id() id}
   *    .period(com.fhir.Period) // optional {@link Appointment_Participant#period() period}
   *    .build();
   * </pre>
   * @return A new Appointment_Participant builder
   */
  public static ImmutableAppointment_Participant.Builder builder() {
    return new ImmutableAppointment_Participant.Builder();
  }

  /**
   * Builds instances of type {@link Appointment_Participant Appointment_Participant}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Appointment_Participant", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_TYPE = 0x1L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x2L;
    private static final long OPT_BIT_REQUIRED = 0x4L;
    private static final long OPT_BIT_ACTOR = 0x8L;
    private static final long OPT_BIT_STATUS = 0x10L;
    private static final long OPT_BIT_EXTENSION = 0x20L;
    private static final long OPT_BIT_ID = 0x40L;
    private static final long OPT_BIT_PERIOD = 0x80L;
    private long optBits;

    private @Nullable List<CodeableConcept> type;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable Appointment_participantRequired required;
    private @Nullable Reference actor;
    private @Nullable Appointment_participantStatus status;
    private @Nullable List<Extension> extension;
    private @Nullable String id;
    private @Nullable Period period;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Appointment_Participant#type() type} to type.
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
     * Initializes the optional value {@link Appointment_Participant#type() type} to type.
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
     * Initializes the optional value {@link Appointment_Participant#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Appointment_Participant#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Appointment_Participant#required() required} to required.
     * @param required The value for required
     * @return {@code this} builder for chained invocation
     */
    public final Builder required(Appointment_participantRequired required) {
      checkNotIsSet(requiredIsSet(), "required");
      this.required = Objects.requireNonNull(required, "required");
      optBits |= OPT_BIT_REQUIRED;
      return this;
    }

    /**
     * Initializes the optional value {@link Appointment_Participant#required() required} to required.
     * @param required The value for required
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("required")
    public final Builder required(Optional<? extends Appointment_participantRequired> required) {
      checkNotIsSet(requiredIsSet(), "required");
      this.required = required.orElse(null);
      optBits |= OPT_BIT_REQUIRED;
      return this;
    }

    /**
     * Initializes the optional value {@link Appointment_Participant#actor() actor} to actor.
     * @param actor The value for actor
     * @return {@code this} builder for chained invocation
     */
    public final Builder actor(Reference actor) {
      checkNotIsSet(actorIsSet(), "actor");
      this.actor = Objects.requireNonNull(actor, "actor");
      optBits |= OPT_BIT_ACTOR;
      return this;
    }

    /**
     * Initializes the optional value {@link Appointment_Participant#actor() actor} to actor.
     * @param actor The value for actor
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("actor")
    public final Builder actor(Optional<? extends Reference> actor) {
      checkNotIsSet(actorIsSet(), "actor");
      this.actor = actor.orElse(null);
      optBits |= OPT_BIT_ACTOR;
      return this;
    }

    /**
     * Initializes the optional value {@link Appointment_Participant#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(Appointment_participantStatus status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link Appointment_Participant#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("status")
    public final Builder status(Optional<? extends Appointment_participantStatus> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link Appointment_Participant#extension() extension} to extension.
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
     * Initializes the optional value {@link Appointment_Participant#extension() extension} to extension.
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
     * Initializes the optional value {@link Appointment_Participant#id() id} to id.
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
     * Initializes the optional value {@link Appointment_Participant#id() id} to id.
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
     * Initializes the optional value {@link Appointment_Participant#period() period} to period.
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
     * Initializes the optional value {@link Appointment_Participant#period() period} to period.
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
     * Builds a new {@link Appointment_Participant Appointment_Participant}.
     * @return An immutable instance of Appointment_Participant
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Appointment_Participant build() {
      return new ImmutableAppointment_Participant(type, modifierExtension, required, actor, status, extension, id, period);
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean requiredIsSet() {
      return (optBits & OPT_BIT_REQUIRED) != 0;
    }

    private boolean actorIsSet() {
      return (optBits & OPT_BIT_ACTOR) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean periodIsSet() {
      return (optBits & OPT_BIT_PERIOD) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Appointment_Participant is strict, attribute is already set: ".concat(name));
    }
  }
}
