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
 * Immutable implementation of {@link Patient_Contact}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutablePatient_Contact.builder()}.
 */
@Generated(from = "Patient_Contact", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutablePatient_Contact implements Patient_Contact {
  private final @Nullable List<CodeableConcept> relationship;
  private final @Nullable String id;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable Reference organization;
  private final @Nullable List<ContactPoint> telecom;
  private final @Nullable Patient_contactGender gender;
  private final @Nullable HumanName name;
  private final @Nullable List<Extension> extension;
  private final @Nullable Address address;
  private final @Nullable Period period;

  private ImmutablePatient_Contact(
      @Nullable List<CodeableConcept> relationship,
      @Nullable String id,
      @Nullable List<Extension> modifierExtension,
      @Nullable Reference organization,
      @Nullable List<ContactPoint> telecom,
      @Nullable Patient_contactGender gender,
      @Nullable HumanName name,
      @Nullable List<Extension> extension,
      @Nullable Address address,
      @Nullable Period period) {
    this.relationship = relationship;
    this.id = id;
    this.modifierExtension = modifierExtension;
    this.organization = organization;
    this.telecom = telecom;
    this.gender = gender;
    this.name = name;
    this.extension = extension;
    this.address = address;
    this.period = period;
  }

  /**
   * @return The value of the {@code relationship} attribute
   */
  @JsonProperty("relationship")
  @Override
  public Optional<List<CodeableConcept>> relationship() {
    return Optional.ofNullable(relationship);
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @JsonProperty("modifierExtension")
  @Override
  public Optional<List<Extension>> modifierExtension() {
    return Optional.ofNullable(modifierExtension);
  }

  /**
   * @return The value of the {@code organization} attribute
   */
  @JsonProperty("organization")
  @Override
  public Optional<Reference> organization() {
    return Optional.ofNullable(organization);
  }

  /**
   * @return The value of the {@code telecom} attribute
   */
  @JsonProperty("telecom")
  @Override
  public Optional<List<ContactPoint>> telecom() {
    return Optional.ofNullable(telecom);
  }

  /**
   * @return The value of the {@code gender} attribute
   */
  @JsonProperty("gender")
  @Override
  public Optional<Patient_contactGender> gender() {
    return Optional.ofNullable(gender);
  }

  /**
   * @return The value of the {@code name} attribute
   */
  @JsonProperty("name")
  @Override
  public Optional<HumanName> name() {
    return Optional.ofNullable(name);
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
   * @return The value of the {@code address} attribute
   */
  @JsonProperty("address")
  @Override
  public Optional<Address> address() {
    return Optional.ofNullable(address);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Patient_Contact#relationship() relationship} attribute.
   * @param value The value for relationship
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePatient_Contact withRelationship(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "relationship");
    if (this.relationship == newValue) return this;
    return new ImmutablePatient_Contact(
        newValue,
        this.id,
        this.modifierExtension,
        this.organization,
        this.telecom,
        this.gender,
        this.name,
        this.extension,
        this.address,
        this.period);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Patient_Contact#relationship() relationship} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for relationship
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePatient_Contact withRelationship(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.relationship == value) return this;
    return new ImmutablePatient_Contact(
        value,
        this.id,
        this.modifierExtension,
        this.organization,
        this.telecom,
        this.gender,
        this.name,
        this.extension,
        this.address,
        this.period);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Patient_Contact#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePatient_Contact withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutablePatient_Contact(
        this.relationship,
        newValue,
        this.modifierExtension,
        this.organization,
        this.telecom,
        this.gender,
        this.name,
        this.extension,
        this.address,
        this.period);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Patient_Contact#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePatient_Contact withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutablePatient_Contact(
        this.relationship,
        value,
        this.modifierExtension,
        this.organization,
        this.telecom,
        this.gender,
        this.name,
        this.extension,
        this.address,
        this.period);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Patient_Contact#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePatient_Contact withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutablePatient_Contact(
        this.relationship,
        this.id,
        newValue,
        this.organization,
        this.telecom,
        this.gender,
        this.name,
        this.extension,
        this.address,
        this.period);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Patient_Contact#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePatient_Contact withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutablePatient_Contact(
        this.relationship,
        this.id,
        value,
        this.organization,
        this.telecom,
        this.gender,
        this.name,
        this.extension,
        this.address,
        this.period);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Patient_Contact#organization() organization} attribute.
   * @param value The value for organization
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePatient_Contact withOrganization(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "organization");
    if (this.organization == newValue) return this;
    return new ImmutablePatient_Contact(
        this.relationship,
        this.id,
        this.modifierExtension,
        newValue,
        this.telecom,
        this.gender,
        this.name,
        this.extension,
        this.address,
        this.period);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Patient_Contact#organization() organization} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for organization
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePatient_Contact withOrganization(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.organization == value) return this;
    return new ImmutablePatient_Contact(
        this.relationship,
        this.id,
        this.modifierExtension,
        value,
        this.telecom,
        this.gender,
        this.name,
        this.extension,
        this.address,
        this.period);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Patient_Contact#telecom() telecom} attribute.
   * @param value The value for telecom
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePatient_Contact withTelecom(List<ContactPoint> value) {
    @Nullable List<ContactPoint> newValue = Objects.requireNonNull(value, "telecom");
    if (this.telecom == newValue) return this;
    return new ImmutablePatient_Contact(
        this.relationship,
        this.id,
        this.modifierExtension,
        this.organization,
        newValue,
        this.gender,
        this.name,
        this.extension,
        this.address,
        this.period);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Patient_Contact#telecom() telecom} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for telecom
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePatient_Contact withTelecom(Optional<? extends List<ContactPoint>> optional) {
    @Nullable List<ContactPoint> value = optional.orElse(null);
    if (this.telecom == value) return this;
    return new ImmutablePatient_Contact(
        this.relationship,
        this.id,
        this.modifierExtension,
        this.organization,
        value,
        this.gender,
        this.name,
        this.extension,
        this.address,
        this.period);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Patient_Contact#gender() gender} attribute.
   * @param value The value for gender
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePatient_Contact withGender(Patient_contactGender value) {
    @Nullable Patient_contactGender newValue = Objects.requireNonNull(value, "gender");
    if (this.gender == newValue) return this;
    return new ImmutablePatient_Contact(
        this.relationship,
        this.id,
        this.modifierExtension,
        this.organization,
        this.telecom,
        newValue,
        this.name,
        this.extension,
        this.address,
        this.period);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Patient_Contact#gender() gender} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for gender
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePatient_Contact withGender(Optional<? extends Patient_contactGender> optional) {
    @Nullable Patient_contactGender value = optional.orElse(null);
    if (this.gender == value) return this;
    return new ImmutablePatient_Contact(
        this.relationship,
        this.id,
        this.modifierExtension,
        this.organization,
        this.telecom,
        value,
        this.name,
        this.extension,
        this.address,
        this.period);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Patient_Contact#name() name} attribute.
   * @param value The value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePatient_Contact withName(HumanName value) {
    @Nullable HumanName newValue = Objects.requireNonNull(value, "name");
    if (this.name == newValue) return this;
    return new ImmutablePatient_Contact(
        this.relationship,
        this.id,
        this.modifierExtension,
        this.organization,
        this.telecom,
        this.gender,
        newValue,
        this.extension,
        this.address,
        this.period);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Patient_Contact#name() name} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for name
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePatient_Contact withName(Optional<? extends HumanName> optional) {
    @Nullable HumanName value = optional.orElse(null);
    if (this.name == value) return this;
    return new ImmutablePatient_Contact(
        this.relationship,
        this.id,
        this.modifierExtension,
        this.organization,
        this.telecom,
        this.gender,
        value,
        this.extension,
        this.address,
        this.period);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Patient_Contact#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePatient_Contact withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutablePatient_Contact(
        this.relationship,
        this.id,
        this.modifierExtension,
        this.organization,
        this.telecom,
        this.gender,
        this.name,
        newValue,
        this.address,
        this.period);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Patient_Contact#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePatient_Contact withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutablePatient_Contact(
        this.relationship,
        this.id,
        this.modifierExtension,
        this.organization,
        this.telecom,
        this.gender,
        this.name,
        value,
        this.address,
        this.period);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Patient_Contact#address() address} attribute.
   * @param value The value for address
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePatient_Contact withAddress(Address value) {
    @Nullable Address newValue = Objects.requireNonNull(value, "address");
    if (this.address == newValue) return this;
    return new ImmutablePatient_Contact(
        this.relationship,
        this.id,
        this.modifierExtension,
        this.organization,
        this.telecom,
        this.gender,
        this.name,
        this.extension,
        newValue,
        this.period);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Patient_Contact#address() address} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for address
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePatient_Contact withAddress(Optional<? extends Address> optional) {
    @Nullable Address value = optional.orElse(null);
    if (this.address == value) return this;
    return new ImmutablePatient_Contact(
        this.relationship,
        this.id,
        this.modifierExtension,
        this.organization,
        this.telecom,
        this.gender,
        this.name,
        this.extension,
        value,
        this.period);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Patient_Contact#period() period} attribute.
   * @param value The value for period
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePatient_Contact withPeriod(Period value) {
    @Nullable Period newValue = Objects.requireNonNull(value, "period");
    if (this.period == newValue) return this;
    return new ImmutablePatient_Contact(
        this.relationship,
        this.id,
        this.modifierExtension,
        this.organization,
        this.telecom,
        this.gender,
        this.name,
        this.extension,
        this.address,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Patient_Contact#period() period} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for period
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePatient_Contact withPeriod(Optional<? extends Period> optional) {
    @Nullable Period value = optional.orElse(null);
    if (this.period == value) return this;
    return new ImmutablePatient_Contact(
        this.relationship,
        this.id,
        this.modifierExtension,
        this.organization,
        this.telecom,
        this.gender,
        this.name,
        this.extension,
        this.address,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutablePatient_Contact} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutablePatient_Contact
        && equalTo((ImmutablePatient_Contact) another);
  }

  private boolean equalTo(ImmutablePatient_Contact another) {
    return Objects.equals(relationship, another.relationship)
        && Objects.equals(id, another.id)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(organization, another.organization)
        && Objects.equals(telecom, another.telecom)
        && Objects.equals(gender, another.gender)
        && Objects.equals(name, another.name)
        && Objects.equals(extension, another.extension)
        && Objects.equals(address, another.address)
        && Objects.equals(period, another.period);
  }

  /**
   * Computes a hash code from attributes: {@code relationship}, {@code id}, {@code modifierExtension}, {@code organization}, {@code telecom}, {@code gender}, {@code name}, {@code extension}, {@code address}, {@code period}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(relationship);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(organization);
    h += (h << 5) + Objects.hashCode(telecom);
    h += (h << 5) + Objects.hashCode(gender);
    h += (h << 5) + Objects.hashCode(name);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(address);
    h += (h << 5) + Objects.hashCode(period);
    return h;
  }

  /**
   * Prints the immutable value {@code Patient_Contact} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Patient_Contact{");
    if (relationship != null) {
      builder.append("relationship=").append(relationship);
    }
    if (id != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (modifierExtension != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (organization != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("organization=").append(organization);
    }
    if (telecom != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("telecom=").append(telecom);
    }
    if (gender != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("gender=").append(gender);
    }
    if (name != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("name=").append(name);
    }
    if (extension != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (address != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("address=").append(address);
    }
    if (period != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("period=").append(period);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "Patient_Contact", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Patient_Contact {
    @Nullable Optional<List<CodeableConcept>> relationship = Optional.empty();
    boolean relationshipIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<Reference> organization = Optional.empty();
    boolean organizationIsSet;
    @Nullable Optional<List<ContactPoint>> telecom = Optional.empty();
    boolean telecomIsSet;
    @Nullable Optional<Patient_contactGender> gender = Optional.empty();
    boolean genderIsSet;
    @Nullable Optional<HumanName> name = Optional.empty();
    boolean nameIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<Address> address = Optional.empty();
    boolean addressIsSet;
    @Nullable Optional<Period> period = Optional.empty();
    boolean periodIsSet;
    @JsonProperty("relationship")
    public void setRelationship(Optional<List<CodeableConcept>> relationship) {
      this.relationship = relationship;
      this.relationshipIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("organization")
    public void setOrganization(Optional<Reference> organization) {
      this.organization = organization;
      this.organizationIsSet = true;
    }
    @JsonProperty("telecom")
    public void setTelecom(Optional<List<ContactPoint>> telecom) {
      this.telecom = telecom;
      this.telecomIsSet = true;
    }
    @JsonProperty("gender")
    public void setGender(Optional<Patient_contactGender> gender) {
      this.gender = gender;
      this.genderIsSet = true;
    }
    @JsonProperty("name")
    public void setName(Optional<HumanName> name) {
      this.name = name;
      this.nameIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("address")
    public void setAddress(Optional<Address> address) {
      this.address = address;
      this.addressIsSet = true;
    }
    @JsonProperty("period")
    public void setPeriod(Optional<Period> period) {
      this.period = period;
      this.periodIsSet = true;
    }
    @Override
    public Optional<List<CodeableConcept>> relationship() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> organization() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ContactPoint>> telecom() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Patient_contactGender> gender() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<HumanName> name() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Address> address() { throw new UnsupportedOperationException(); }
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
  static ImmutablePatient_Contact fromJson(Json json) {
    ImmutablePatient_Contact.Builder builder = ImmutablePatient_Contact.builder();
    if (json.relationshipIsSet) {
      builder.relationship(json.relationship);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.organizationIsSet) {
      builder.organization(json.organization);
    }
    if (json.telecomIsSet) {
      builder.telecom(json.telecom);
    }
    if (json.genderIsSet) {
      builder.gender(json.gender);
    }
    if (json.nameIsSet) {
      builder.name(json.name);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.addressIsSet) {
      builder.address(json.address);
    }
    if (json.periodIsSet) {
      builder.period(json.period);
    }
    return (ImmutablePatient_Contact) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Patient_Contact} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Patient_Contact instance
   */
  public static Patient_Contact copyOf(Patient_Contact instance) {
    if (instance instanceof ImmutablePatient_Contact) {
      return (ImmutablePatient_Contact) instance;
    }
    return ImmutablePatient_Contact.builder()
        .relationship(instance.relationship())
        .id(instance.id())
        .modifierExtension(instance.modifierExtension())
        .organization(instance.organization())
        .telecom(instance.telecom())
        .gender(instance.gender())
        .name(instance.name())
        .extension(instance.extension())
        .address(instance.address())
        .period(instance.period())
        .build();
  }

  /**
   * Creates a builder for {@link Patient_Contact Patient_Contact}.
   * <pre>
   * ImmutablePatient_Contact.builder()
   *    .relationship(List&amp;lt;com.medplum.types.fhir.CodeableConcept&amp;gt;) // optional {@link Patient_Contact#relationship() relationship}
   *    .id(String) // optional {@link Patient_Contact#id() id}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link Patient_Contact#modifierExtension() modifierExtension}
   *    .organization(com.medplum.types.fhir.Reference) // optional {@link Patient_Contact#organization() organization}
   *    .telecom(List&amp;lt;com.medplum.types.fhir.ContactPoint&amp;gt;) // optional {@link Patient_Contact#telecom() telecom}
   *    .gender(com.medplum.types.fhir.Patient_contactGender) // optional {@link Patient_Contact#gender() gender}
   *    .name(com.medplum.types.fhir.HumanName) // optional {@link Patient_Contact#name() name}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link Patient_Contact#extension() extension}
   *    .address(com.medplum.types.fhir.Address) // optional {@link Patient_Contact#address() address}
   *    .period(com.medplum.types.fhir.Period) // optional {@link Patient_Contact#period() period}
   *    .build();
   * </pre>
   * @return A new Patient_Contact builder
   */
  public static ImmutablePatient_Contact.Builder builder() {
    return new ImmutablePatient_Contact.Builder();
  }

  /**
   * Builds instances of type {@link Patient_Contact Patient_Contact}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Patient_Contact", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_RELATIONSHIP = 0x1L;
    private static final long OPT_BIT_ID = 0x2L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x4L;
    private static final long OPT_BIT_ORGANIZATION = 0x8L;
    private static final long OPT_BIT_TELECOM = 0x10L;
    private static final long OPT_BIT_GENDER = 0x20L;
    private static final long OPT_BIT_NAME = 0x40L;
    private static final long OPT_BIT_EXTENSION = 0x80L;
    private static final long OPT_BIT_ADDRESS = 0x100L;
    private static final long OPT_BIT_PERIOD = 0x200L;
    private long optBits;

    private @Nullable List<CodeableConcept> relationship;
    private @Nullable String id;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable Reference organization;
    private @Nullable List<ContactPoint> telecom;
    private @Nullable Patient_contactGender gender;
    private @Nullable HumanName name;
    private @Nullable List<Extension> extension;
    private @Nullable Address address;
    private @Nullable Period period;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Patient_Contact#relationship() relationship} to relationship.
     * @param relationship The value for relationship
     * @return {@code this} builder for chained invocation
     */
    public final Builder relationship(List<CodeableConcept> relationship) {
      checkNotIsSet(relationshipIsSet(), "relationship");
      this.relationship = Objects.requireNonNull(relationship, "relationship");
      optBits |= OPT_BIT_RELATIONSHIP;
      return this;
    }

    /**
     * Initializes the optional value {@link Patient_Contact#relationship() relationship} to relationship.
     * @param relationship The value for relationship
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("relationship")
    public final Builder relationship(Optional<? extends List<CodeableConcept>> relationship) {
      checkNotIsSet(relationshipIsSet(), "relationship");
      this.relationship = relationship.orElse(null);
      optBits |= OPT_BIT_RELATIONSHIP;
      return this;
    }

    /**
     * Initializes the optional value {@link Patient_Contact#id() id} to id.
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
     * Initializes the optional value {@link Patient_Contact#id() id} to id.
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
     * Initializes the optional value {@link Patient_Contact#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Patient_Contact#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Patient_Contact#organization() organization} to organization.
     * @param organization The value for organization
     * @return {@code this} builder for chained invocation
     */
    public final Builder organization(Reference organization) {
      checkNotIsSet(organizationIsSet(), "organization");
      this.organization = Objects.requireNonNull(organization, "organization");
      optBits |= OPT_BIT_ORGANIZATION;
      return this;
    }

    /**
     * Initializes the optional value {@link Patient_Contact#organization() organization} to organization.
     * @param organization The value for organization
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("organization")
    public final Builder organization(Optional<? extends Reference> organization) {
      checkNotIsSet(organizationIsSet(), "organization");
      this.organization = organization.orElse(null);
      optBits |= OPT_BIT_ORGANIZATION;
      return this;
    }

    /**
     * Initializes the optional value {@link Patient_Contact#telecom() telecom} to telecom.
     * @param telecom The value for telecom
     * @return {@code this} builder for chained invocation
     */
    public final Builder telecom(List<ContactPoint> telecom) {
      checkNotIsSet(telecomIsSet(), "telecom");
      this.telecom = Objects.requireNonNull(telecom, "telecom");
      optBits |= OPT_BIT_TELECOM;
      return this;
    }

    /**
     * Initializes the optional value {@link Patient_Contact#telecom() telecom} to telecom.
     * @param telecom The value for telecom
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("telecom")
    public final Builder telecom(Optional<? extends List<ContactPoint>> telecom) {
      checkNotIsSet(telecomIsSet(), "telecom");
      this.telecom = telecom.orElse(null);
      optBits |= OPT_BIT_TELECOM;
      return this;
    }

    /**
     * Initializes the optional value {@link Patient_Contact#gender() gender} to gender.
     * @param gender The value for gender
     * @return {@code this} builder for chained invocation
     */
    public final Builder gender(Patient_contactGender gender) {
      checkNotIsSet(genderIsSet(), "gender");
      this.gender = Objects.requireNonNull(gender, "gender");
      optBits |= OPT_BIT_GENDER;
      return this;
    }

    /**
     * Initializes the optional value {@link Patient_Contact#gender() gender} to gender.
     * @param gender The value for gender
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("gender")
    public final Builder gender(Optional<? extends Patient_contactGender> gender) {
      checkNotIsSet(genderIsSet(), "gender");
      this.gender = gender.orElse(null);
      optBits |= OPT_BIT_GENDER;
      return this;
    }

    /**
     * Initializes the optional value {@link Patient_Contact#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for chained invocation
     */
    public final Builder name(HumanName name) {
      checkNotIsSet(nameIsSet(), "name");
      this.name = Objects.requireNonNull(name, "name");
      optBits |= OPT_BIT_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link Patient_Contact#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("name")
    public final Builder name(Optional<? extends HumanName> name) {
      checkNotIsSet(nameIsSet(), "name");
      this.name = name.orElse(null);
      optBits |= OPT_BIT_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link Patient_Contact#extension() extension} to extension.
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
     * Initializes the optional value {@link Patient_Contact#extension() extension} to extension.
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
     * Initializes the optional value {@link Patient_Contact#address() address} to address.
     * @param address The value for address
     * @return {@code this} builder for chained invocation
     */
    public final Builder address(Address address) {
      checkNotIsSet(addressIsSet(), "address");
      this.address = Objects.requireNonNull(address, "address");
      optBits |= OPT_BIT_ADDRESS;
      return this;
    }

    /**
     * Initializes the optional value {@link Patient_Contact#address() address} to address.
     * @param address The value for address
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("address")
    public final Builder address(Optional<? extends Address> address) {
      checkNotIsSet(addressIsSet(), "address");
      this.address = address.orElse(null);
      optBits |= OPT_BIT_ADDRESS;
      return this;
    }

    /**
     * Initializes the optional value {@link Patient_Contact#period() period} to period.
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
     * Initializes the optional value {@link Patient_Contact#period() period} to period.
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
     * Builds a new {@link Patient_Contact Patient_Contact}.
     * @return An immutable instance of Patient_Contact
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Patient_Contact build() {
      return new ImmutablePatient_Contact(
          relationship,
          id,
          modifierExtension,
          organization,
          telecom,
          gender,
          name,
          extension,
          address,
          period);
    }

    private boolean relationshipIsSet() {
      return (optBits & OPT_BIT_RELATIONSHIP) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean organizationIsSet() {
      return (optBits & OPT_BIT_ORGANIZATION) != 0;
    }

    private boolean telecomIsSet() {
      return (optBits & OPT_BIT_TELECOM) != 0;
    }

    private boolean genderIsSet() {
      return (optBits & OPT_BIT_GENDER) != 0;
    }

    private boolean nameIsSet() {
      return (optBits & OPT_BIT_NAME) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean addressIsSet() {
      return (optBits & OPT_BIT_ADDRESS) != 0;
    }

    private boolean periodIsSet() {
      return (optBits & OPT_BIT_PERIOD) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Patient_Contact is strict, attribute is already set: ".concat(name));
    }
  }
}
