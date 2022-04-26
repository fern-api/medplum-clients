package com.medplum.types.fhir;

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
 * Immutable implementation of {@link MedicinalProductAuthorization_Procedure}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableMedicinalProductAuthorization_Procedure.builder()}.
 */
@Generated(from = "MedicinalProductAuthorization_Procedure", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableMedicinalProductAuthorization_Procedure
    implements MedicinalProductAuthorization_Procedure {
  private final @Nullable String dateDateTime;
  private final @Nullable List<MedicinalProductAuthorization_Procedure> application;
  private final @Nullable String id;
  private final @Nullable Identifier identifier;
  private final @Nullable Period datePeriod;
  private final @Nullable List<Extension> extension;
  private final CodeableConcept type;
  private final @Nullable List<Extension> modifierExtension;

  private ImmutableMedicinalProductAuthorization_Procedure(
      @Nullable String dateDateTime,
      @Nullable List<MedicinalProductAuthorization_Procedure> application,
      @Nullable String id,
      @Nullable Identifier identifier,
      @Nullable Period datePeriod,
      @Nullable List<Extension> extension,
      CodeableConcept type,
      @Nullable List<Extension> modifierExtension) {
    this.dateDateTime = dateDateTime;
    this.application = application;
    this.id = id;
    this.identifier = identifier;
    this.datePeriod = datePeriod;
    this.extension = extension;
    this.type = type;
    this.modifierExtension = modifierExtension;
  }

  /**
   * @return The value of the {@code dateDateTime} attribute
   */
  @JsonProperty("dateDateTime")
  @Override
  public Optional<String> dateDateTime() {
    return Optional.ofNullable(dateDateTime);
  }

  /**
   * @return The value of the {@code application} attribute
   */
  @JsonProperty("application")
  @Override
  public Optional<List<MedicinalProductAuthorization_Procedure>> application() {
    return Optional.ofNullable(application);
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
   * @return The value of the {@code identifier} attribute
   */
  @JsonProperty("identifier")
  @Override
  public Optional<Identifier> identifier() {
    return Optional.ofNullable(identifier);
  }

  /**
   * @return The value of the {@code datePeriod} attribute
   */
  @JsonProperty("datePeriod")
  @Override
  public Optional<Period> datePeriod() {
    return Optional.ofNullable(datePeriod);
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
   * @return The value of the {@code type} attribute
   */
  @JsonProperty("type")
  @Override
  public CodeableConcept type() {
    return type;
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductAuthorization_Procedure#dateDateTime() dateDateTime} attribute.
   * @param value The value for dateDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductAuthorization_Procedure withDateDateTime(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "dateDateTime");
    if (Objects.equals(this.dateDateTime, newValue)) return this;
    return new ImmutableMedicinalProductAuthorization_Procedure(
        newValue,
        this.application,
        this.id,
        this.identifier,
        this.datePeriod,
        this.extension,
        this.type,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductAuthorization_Procedure#dateDateTime() dateDateTime} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for dateDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductAuthorization_Procedure withDateDateTime(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.dateDateTime, value)) return this;
    return new ImmutableMedicinalProductAuthorization_Procedure(
        value,
        this.application,
        this.id,
        this.identifier,
        this.datePeriod,
        this.extension,
        this.type,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductAuthorization_Procedure#application() application} attribute.
   * @param value The value for application
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductAuthorization_Procedure withApplication(List<MedicinalProductAuthorization_Procedure> value) {
    @Nullable List<MedicinalProductAuthorization_Procedure> newValue = Objects.requireNonNull(value, "application");
    if (this.application == newValue) return this;
    return new ImmutableMedicinalProductAuthorization_Procedure(
        this.dateDateTime,
        newValue,
        this.id,
        this.identifier,
        this.datePeriod,
        this.extension,
        this.type,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductAuthorization_Procedure#application() application} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for application
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductAuthorization_Procedure withApplication(Optional<? extends List<MedicinalProductAuthorization_Procedure>> optional) {
    @Nullable List<MedicinalProductAuthorization_Procedure> value = optional.orElse(null);
    if (this.application == value) return this;
    return new ImmutableMedicinalProductAuthorization_Procedure(
        this.dateDateTime,
        value,
        this.id,
        this.identifier,
        this.datePeriod,
        this.extension,
        this.type,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductAuthorization_Procedure#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductAuthorization_Procedure withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableMedicinalProductAuthorization_Procedure(
        this.dateDateTime,
        this.application,
        newValue,
        this.identifier,
        this.datePeriod,
        this.extension,
        this.type,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductAuthorization_Procedure#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductAuthorization_Procedure withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableMedicinalProductAuthorization_Procedure(
        this.dateDateTime,
        this.application,
        value,
        this.identifier,
        this.datePeriod,
        this.extension,
        this.type,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductAuthorization_Procedure#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductAuthorization_Procedure withIdentifier(Identifier value) {
    @Nullable Identifier newValue = Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableMedicinalProductAuthorization_Procedure(
        this.dateDateTime,
        this.application,
        this.id,
        newValue,
        this.datePeriod,
        this.extension,
        this.type,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductAuthorization_Procedure#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductAuthorization_Procedure withIdentifier(Optional<? extends Identifier> optional) {
    @Nullable Identifier value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableMedicinalProductAuthorization_Procedure(
        this.dateDateTime,
        this.application,
        this.id,
        value,
        this.datePeriod,
        this.extension,
        this.type,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductAuthorization_Procedure#datePeriod() datePeriod} attribute.
   * @param value The value for datePeriod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductAuthorization_Procedure withDatePeriod(Period value) {
    @Nullable Period newValue = Objects.requireNonNull(value, "datePeriod");
    if (this.datePeriod == newValue) return this;
    return new ImmutableMedicinalProductAuthorization_Procedure(
        this.dateDateTime,
        this.application,
        this.id,
        this.identifier,
        newValue,
        this.extension,
        this.type,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductAuthorization_Procedure#datePeriod() datePeriod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for datePeriod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductAuthorization_Procedure withDatePeriod(Optional<? extends Period> optional) {
    @Nullable Period value = optional.orElse(null);
    if (this.datePeriod == value) return this;
    return new ImmutableMedicinalProductAuthorization_Procedure(
        this.dateDateTime,
        this.application,
        this.id,
        this.identifier,
        value,
        this.extension,
        this.type,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductAuthorization_Procedure#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductAuthorization_Procedure withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableMedicinalProductAuthorization_Procedure(
        this.dateDateTime,
        this.application,
        this.id,
        this.identifier,
        this.datePeriod,
        newValue,
        this.type,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductAuthorization_Procedure#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductAuthorization_Procedure withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableMedicinalProductAuthorization_Procedure(
        this.dateDateTime,
        this.application,
        this.id,
        this.identifier,
        this.datePeriod,
        value,
        this.type,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MedicinalProductAuthorization_Procedure#type() type} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for type
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMedicinalProductAuthorization_Procedure withType(CodeableConcept value) {
    if (this.type == value) return this;
    CodeableConcept newValue = Objects.requireNonNull(value, "type");
    return new ImmutableMedicinalProductAuthorization_Procedure(
        this.dateDateTime,
        this.application,
        this.id,
        this.identifier,
        this.datePeriod,
        this.extension,
        newValue,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductAuthorization_Procedure#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductAuthorization_Procedure withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableMedicinalProductAuthorization_Procedure(
        this.dateDateTime,
        this.application,
        this.id,
        this.identifier,
        this.datePeriod,
        this.extension,
        this.type,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductAuthorization_Procedure#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductAuthorization_Procedure withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableMedicinalProductAuthorization_Procedure(
        this.dateDateTime,
        this.application,
        this.id,
        this.identifier,
        this.datePeriod,
        this.extension,
        this.type,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableMedicinalProductAuthorization_Procedure} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableMedicinalProductAuthorization_Procedure
        && equalTo((ImmutableMedicinalProductAuthorization_Procedure) another);
  }

  private boolean equalTo(ImmutableMedicinalProductAuthorization_Procedure another) {
    return Objects.equals(dateDateTime, another.dateDateTime)
        && Objects.equals(application, another.application)
        && Objects.equals(id, another.id)
        && Objects.equals(identifier, another.identifier)
        && Objects.equals(datePeriod, another.datePeriod)
        && Objects.equals(extension, another.extension)
        && type.equals(another.type)
        && Objects.equals(modifierExtension, another.modifierExtension);
  }

  /**
   * Computes a hash code from attributes: {@code dateDateTime}, {@code application}, {@code id}, {@code identifier}, {@code datePeriod}, {@code extension}, {@code type}, {@code modifierExtension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(dateDateTime);
    h += (h << 5) + Objects.hashCode(application);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(identifier);
    h += (h << 5) + Objects.hashCode(datePeriod);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + type.hashCode();
    h += (h << 5) + Objects.hashCode(modifierExtension);
    return h;
  }

  /**
   * Prints the immutable value {@code MedicinalProductAuthorization_Procedure} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("MedicinalProductAuthorization_Procedure{");
    if (dateDateTime != null) {
      builder.append("dateDateTime=").append(dateDateTime);
    }
    if (application != null) {
      if (builder.length() > 40) builder.append(", ");
      builder.append("application=").append(application);
    }
    if (id != null) {
      if (builder.length() > 40) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (identifier != null) {
      if (builder.length() > 40) builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (datePeriod != null) {
      if (builder.length() > 40) builder.append(", ");
      builder.append("datePeriod=").append(datePeriod);
    }
    if (extension != null) {
      if (builder.length() > 40) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (builder.length() > 40) builder.append(", ");
    builder.append("type=").append(type);
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "MedicinalProductAuthorization_Procedure", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements MedicinalProductAuthorization_Procedure {
    @Nullable Optional<String> dateDateTime = Optional.empty();
    boolean dateDateTimeIsSet;
    @Nullable Optional<List<MedicinalProductAuthorization_Procedure>> application = Optional.empty();
    boolean applicationIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<Identifier> identifier = Optional.empty();
    boolean identifierIsSet;
    @Nullable Optional<Period> datePeriod = Optional.empty();
    boolean datePeriodIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable CodeableConcept type;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @JsonProperty("dateDateTime")
    public void setDateDateTime(Optional<String> dateDateTime) {
      this.dateDateTime = dateDateTime;
      this.dateDateTimeIsSet = true;
    }
    @JsonProperty("application")
    public void setApplication(Optional<List<MedicinalProductAuthorization_Procedure>> application) {
      this.application = application;
      this.applicationIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("identifier")
    public void setIdentifier(Optional<Identifier> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @JsonProperty("datePeriod")
    public void setDatePeriod(Optional<Period> datePeriod) {
      this.datePeriod = datePeriod;
      this.datePeriodIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("type")
    public void setType(CodeableConcept type) {
      this.type = type;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @Override
    public Optional<String> dateDateTime() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<MedicinalProductAuthorization_Procedure>> application() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Identifier> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Period> datePeriod() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public CodeableConcept type() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableMedicinalProductAuthorization_Procedure fromJson(Json json) {
    ImmutableMedicinalProductAuthorization_Procedure.Builder builder = ((ImmutableMedicinalProductAuthorization_Procedure.Builder) ImmutableMedicinalProductAuthorization_Procedure.builder());
    if (json.dateDateTimeIsSet) {
      builder.dateDateTime(json.dateDateTime);
    }
    if (json.applicationIsSet) {
      builder.application(json.application);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.datePeriodIsSet) {
      builder.datePeriod(json.datePeriod);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.type != null) {
      builder.type(json.type);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    return (ImmutableMedicinalProductAuthorization_Procedure) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link MedicinalProductAuthorization_Procedure} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable MedicinalProductAuthorization_Procedure instance
   */
  public static MedicinalProductAuthorization_Procedure copyOf(MedicinalProductAuthorization_Procedure instance) {
    if (instance instanceof ImmutableMedicinalProductAuthorization_Procedure) {
      return (ImmutableMedicinalProductAuthorization_Procedure) instance;
    }
    return ((ImmutableMedicinalProductAuthorization_Procedure.Builder) ImmutableMedicinalProductAuthorization_Procedure.builder())
        .dateDateTime(instance.dateDateTime())
        .application(instance.application())
        .id(instance.id())
        .identifier(instance.identifier())
        .datePeriod(instance.datePeriod())
        .extension(instance.extension())
        .type(instance.type())
        .modifierExtension(instance.modifierExtension())
        .build();
  }

  /**
   * Creates a builder for {@link MedicinalProductAuthorization_Procedure MedicinalProductAuthorization_Procedure}.
   * <pre>
   * ImmutableMedicinalProductAuthorization_Procedure.builder()
   *    .dateDateTime(String) // optional {@link MedicinalProductAuthorization_Procedure#dateDateTime() dateDateTime}
   *    .application(List&amp;lt;com.medplum.types.fhir.MedicinalProductAuthorization_Procedure&amp;gt;) // optional {@link MedicinalProductAuthorization_Procedure#application() application}
   *    .id(String) // optional {@link MedicinalProductAuthorization_Procedure#id() id}
   *    .identifier(com.medplum.types.fhir.Identifier) // optional {@link MedicinalProductAuthorization_Procedure#identifier() identifier}
   *    .datePeriod(com.medplum.types.fhir.Period) // optional {@link MedicinalProductAuthorization_Procedure#datePeriod() datePeriod}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link MedicinalProductAuthorization_Procedure#extension() extension}
   *    .type(com.medplum.types.fhir.CodeableConcept) // required {@link MedicinalProductAuthorization_Procedure#type() type}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link MedicinalProductAuthorization_Procedure#modifierExtension() modifierExtension}
   *    .build();
   * </pre>
   * @return A new MedicinalProductAuthorization_Procedure builder
   */
  public static TypeBuildStage builder() {
    return new ImmutableMedicinalProductAuthorization_Procedure.Builder();
  }

  /**
   * Builds instances of type {@link MedicinalProductAuthorization_Procedure MedicinalProductAuthorization_Procedure}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "MedicinalProductAuthorization_Procedure", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements TypeBuildStage, BuildFinal {
    private static final long INIT_BIT_TYPE = 0x1L;
    private static final long OPT_BIT_DATE_DATE_TIME = 0x1L;
    private static final long OPT_BIT_APPLICATION = 0x2L;
    private static final long OPT_BIT_ID = 0x4L;
    private static final long OPT_BIT_IDENTIFIER = 0x8L;
    private static final long OPT_BIT_DATE_PERIOD = 0x10L;
    private static final long OPT_BIT_EXTENSION = 0x20L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x40L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable String dateDateTime;
    private @Nullable List<MedicinalProductAuthorization_Procedure> application;
    private @Nullable String id;
    private @Nullable Identifier identifier;
    private @Nullable Period datePeriod;
    private @Nullable List<Extension> extension;
    private @Nullable CodeableConcept type;
    private @Nullable List<Extension> modifierExtension;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization_Procedure#dateDateTime() dateDateTime} to dateDateTime.
     * @param dateDateTime The value for dateDateTime
     * @return {@code this} builder for chained invocation
     */
    public final Builder dateDateTime(String dateDateTime) {
      checkNotIsSet(dateDateTimeIsSet(), "dateDateTime");
      this.dateDateTime = Objects.requireNonNull(dateDateTime, "dateDateTime");
      optBits |= OPT_BIT_DATE_DATE_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization_Procedure#dateDateTime() dateDateTime} to dateDateTime.
     * @param dateDateTime The value for dateDateTime
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("dateDateTime")
    public final Builder dateDateTime(Optional<String> dateDateTime) {
      checkNotIsSet(dateDateTimeIsSet(), "dateDateTime");
      this.dateDateTime = dateDateTime.orElse(null);
      optBits |= OPT_BIT_DATE_DATE_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization_Procedure#application() application} to application.
     * @param application The value for application
     * @return {@code this} builder for chained invocation
     */
    public final Builder application(List<MedicinalProductAuthorization_Procedure> application) {
      checkNotIsSet(applicationIsSet(), "application");
      this.application = Objects.requireNonNull(application, "application");
      optBits |= OPT_BIT_APPLICATION;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization_Procedure#application() application} to application.
     * @param application The value for application
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("application")
    public final Builder application(Optional<? extends List<MedicinalProductAuthorization_Procedure>> application) {
      checkNotIsSet(applicationIsSet(), "application");
      this.application = application.orElse(null);
      optBits |= OPT_BIT_APPLICATION;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization_Procedure#id() id} to id.
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
     * Initializes the optional value {@link MedicinalProductAuthorization_Procedure#id() id} to id.
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
     * Initializes the optional value {@link MedicinalProductAuthorization_Procedure#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    public final Builder identifier(Identifier identifier) {
      checkNotIsSet(identifierIsSet(), "identifier");
      this.identifier = Objects.requireNonNull(identifier, "identifier");
      optBits |= OPT_BIT_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization_Procedure#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("identifier")
    public final Builder identifier(Optional<? extends Identifier> identifier) {
      checkNotIsSet(identifierIsSet(), "identifier");
      this.identifier = identifier.orElse(null);
      optBits |= OPT_BIT_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization_Procedure#datePeriod() datePeriod} to datePeriod.
     * @param datePeriod The value for datePeriod
     * @return {@code this} builder for chained invocation
     */
    public final Builder datePeriod(Period datePeriod) {
      checkNotIsSet(datePeriodIsSet(), "datePeriod");
      this.datePeriod = Objects.requireNonNull(datePeriod, "datePeriod");
      optBits |= OPT_BIT_DATE_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization_Procedure#datePeriod() datePeriod} to datePeriod.
     * @param datePeriod The value for datePeriod
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("datePeriod")
    public final Builder datePeriod(Optional<? extends Period> datePeriod) {
      checkNotIsSet(datePeriodIsSet(), "datePeriod");
      this.datePeriod = datePeriod.orElse(null);
      optBits |= OPT_BIT_DATE_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization_Procedure#extension() extension} to extension.
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
     * Initializes the optional value {@link MedicinalProductAuthorization_Procedure#extension() extension} to extension.
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
     * Initializes the value for the {@link MedicinalProductAuthorization_Procedure#type() type} attribute.
     * @param type The value for type 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("type")
    public final Builder type(CodeableConcept type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = Objects.requireNonNull(type, "type");
      initBits &= ~INIT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization_Procedure#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MedicinalProductAuthorization_Procedure#modifierExtension() modifierExtension} to modifierExtension.
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
     * Builds a new {@link MedicinalProductAuthorization_Procedure MedicinalProductAuthorization_Procedure}.
     * @return An immutable instance of MedicinalProductAuthorization_Procedure
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public MedicinalProductAuthorization_Procedure build() {
      checkRequiredAttributes();
      return new ImmutableMedicinalProductAuthorization_Procedure(dateDateTime, application, id, identifier, datePeriod, extension, type, modifierExtension);
    }

    private boolean dateDateTimeIsSet() {
      return (optBits & OPT_BIT_DATE_DATE_TIME) != 0;
    }

    private boolean applicationIsSet() {
      return (optBits & OPT_BIT_APPLICATION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean datePeriodIsSet() {
      return (optBits & OPT_BIT_DATE_PERIOD) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean typeIsSet() {
      return (initBits & INIT_BIT_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of MedicinalProductAuthorization_Procedure is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!typeIsSet()) attributes.add("type");
      return "Cannot build MedicinalProductAuthorization_Procedure, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "MedicinalProductAuthorization_Procedure", generator = "Immutables")
  public interface TypeBuildStage {
    /**
     * Initializes the value for the {@link MedicinalProductAuthorization_Procedure#type() type} attribute.
     * @param type The value for type 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal type(CodeableConcept type);
  }

  @Generated(from = "MedicinalProductAuthorization_Procedure", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization_Procedure#dateDateTime() dateDateTime} to dateDateTime.
     * @param dateDateTime The value for dateDateTime
     * @return {@code this} builder for chained invocation
     */
    BuildFinal dateDateTime(String dateDateTime);

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization_Procedure#dateDateTime() dateDateTime} to dateDateTime.
     * @param dateDateTime The value for dateDateTime
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal dateDateTime(Optional<String> dateDateTime);

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization_Procedure#application() application} to application.
     * @param application The value for application
     * @return {@code this} builder for chained invocation
     */
    BuildFinal application(List<MedicinalProductAuthorization_Procedure> application);

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization_Procedure#application() application} to application.
     * @param application The value for application
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal application(Optional<? extends List<MedicinalProductAuthorization_Procedure>> application);

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization_Procedure#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(String id);

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization_Procedure#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<String> id);

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization_Procedure#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(Identifier identifier);

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization_Procedure#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(Optional<? extends Identifier> identifier);

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization_Procedure#datePeriod() datePeriod} to datePeriod.
     * @param datePeriod The value for datePeriod
     * @return {@code this} builder for chained invocation
     */
    BuildFinal datePeriod(Period datePeriod);

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization_Procedure#datePeriod() datePeriod} to datePeriod.
     * @param datePeriod The value for datePeriod
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal datePeriod(Optional<? extends Period> datePeriod);

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization_Procedure#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization_Procedure#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization_Procedure#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization_Procedure#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Builds a new {@link MedicinalProductAuthorization_Procedure MedicinalProductAuthorization_Procedure}.
     * @return An immutable instance of MedicinalProductAuthorization_Procedure
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    MedicinalProductAuthorization_Procedure build();
  }
}
