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
 * Immutable implementation of {@link Organization_Contact}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableOrganization_Contact.builder()}.
 */
@Generated(from = "Organization_Contact", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableOrganization_Contact implements Organization_Contact {
  private final @Nullable List<ContactPoint> telecom;
  private final @Nullable String id;
  private final @Nullable CodeableConcept purpose;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable Address address;
  private final @Nullable List<Extension> extension;
  private final @Nullable HumanName name;

  private ImmutableOrganization_Contact(
      @Nullable List<ContactPoint> telecom,
      @Nullable String id,
      @Nullable CodeableConcept purpose,
      @Nullable List<Extension> modifierExtension,
      @Nullable Address address,
      @Nullable List<Extension> extension,
      @Nullable HumanName name) {
    this.telecom = telecom;
    this.id = id;
    this.purpose = purpose;
    this.modifierExtension = modifierExtension;
    this.address = address;
    this.extension = extension;
    this.name = name;
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
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<String> id() {
    return Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code purpose} attribute
   */
  @JsonProperty("purpose")
  @Override
  public Optional<CodeableConcept> purpose() {
    return Optional.ofNullable(purpose);
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
   * @return The value of the {@code address} attribute
   */
  @JsonProperty("address")
  @Override
  public Optional<Address> address() {
    return Optional.ofNullable(address);
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
   * @return The value of the {@code name} attribute
   */
  @JsonProperty("name")
  @Override
  public Optional<HumanName> name() {
    return Optional.ofNullable(name);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Organization_Contact#telecom() telecom} attribute.
   * @param value The value for telecom
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOrganization_Contact withTelecom(List<ContactPoint> value) {
    @Nullable List<ContactPoint> newValue = Objects.requireNonNull(value, "telecom");
    if (this.telecom == newValue) return this;
    return new ImmutableOrganization_Contact(
        newValue,
        this.id,
        this.purpose,
        this.modifierExtension,
        this.address,
        this.extension,
        this.name);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Organization_Contact#telecom() telecom} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for telecom
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOrganization_Contact withTelecom(Optional<? extends List<ContactPoint>> optional) {
    @Nullable List<ContactPoint> value = optional.orElse(null);
    if (this.telecom == value) return this;
    return new ImmutableOrganization_Contact(value, this.id, this.purpose, this.modifierExtension, this.address, this.extension, this.name);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Organization_Contact#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOrganization_Contact withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableOrganization_Contact(
        this.telecom,
        newValue,
        this.purpose,
        this.modifierExtension,
        this.address,
        this.extension,
        this.name);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Organization_Contact#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOrganization_Contact withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableOrganization_Contact(
        this.telecom,
        value,
        this.purpose,
        this.modifierExtension,
        this.address,
        this.extension,
        this.name);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Organization_Contact#purpose() purpose} attribute.
   * @param value The value for purpose
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOrganization_Contact withPurpose(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "purpose");
    if (this.purpose == newValue) return this;
    return new ImmutableOrganization_Contact(
        this.telecom,
        this.id,
        newValue,
        this.modifierExtension,
        this.address,
        this.extension,
        this.name);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Organization_Contact#purpose() purpose} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for purpose
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOrganization_Contact withPurpose(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.purpose == value) return this;
    return new ImmutableOrganization_Contact(this.telecom, this.id, value, this.modifierExtension, this.address, this.extension, this.name);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Organization_Contact#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOrganization_Contact withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableOrganization_Contact(this.telecom, this.id, this.purpose, newValue, this.address, this.extension, this.name);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Organization_Contact#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOrganization_Contact withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableOrganization_Contact(this.telecom, this.id, this.purpose, value, this.address, this.extension, this.name);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Organization_Contact#address() address} attribute.
   * @param value The value for address
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOrganization_Contact withAddress(Address value) {
    @Nullable Address newValue = Objects.requireNonNull(value, "address");
    if (this.address == newValue) return this;
    return new ImmutableOrganization_Contact(
        this.telecom,
        this.id,
        this.purpose,
        this.modifierExtension,
        newValue,
        this.extension,
        this.name);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Organization_Contact#address() address} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for address
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOrganization_Contact withAddress(Optional<? extends Address> optional) {
    @Nullable Address value = optional.orElse(null);
    if (this.address == value) return this;
    return new ImmutableOrganization_Contact(this.telecom, this.id, this.purpose, this.modifierExtension, value, this.extension, this.name);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Organization_Contact#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOrganization_Contact withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableOrganization_Contact(this.telecom, this.id, this.purpose, this.modifierExtension, this.address, newValue, this.name);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Organization_Contact#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOrganization_Contact withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableOrganization_Contact(this.telecom, this.id, this.purpose, this.modifierExtension, this.address, value, this.name);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Organization_Contact#name() name} attribute.
   * @param value The value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOrganization_Contact withName(HumanName value) {
    @Nullable HumanName newValue = Objects.requireNonNull(value, "name");
    if (this.name == newValue) return this;
    return new ImmutableOrganization_Contact(
        this.telecom,
        this.id,
        this.purpose,
        this.modifierExtension,
        this.address,
        this.extension,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Organization_Contact#name() name} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for name
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOrganization_Contact withName(Optional<? extends HumanName> optional) {
    @Nullable HumanName value = optional.orElse(null);
    if (this.name == value) return this;
    return new ImmutableOrganization_Contact(
        this.telecom,
        this.id,
        this.purpose,
        this.modifierExtension,
        this.address,
        this.extension,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableOrganization_Contact} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableOrganization_Contact
        && equalTo((ImmutableOrganization_Contact) another);
  }

  private boolean equalTo(ImmutableOrganization_Contact another) {
    return Objects.equals(telecom, another.telecom)
        && Objects.equals(id, another.id)
        && Objects.equals(purpose, another.purpose)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(address, another.address)
        && Objects.equals(extension, another.extension)
        && Objects.equals(name, another.name);
  }

  /**
   * Computes a hash code from attributes: {@code telecom}, {@code id}, {@code purpose}, {@code modifierExtension}, {@code address}, {@code extension}, {@code name}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(telecom);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(purpose);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(address);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(name);
    return h;
  }

  /**
   * Prints the immutable value {@code Organization_Contact} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Organization_Contact{");
    if (telecom != null) {
      builder.append("telecom=").append(telecom);
    }
    if (id != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (purpose != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("purpose=").append(purpose);
    }
    if (modifierExtension != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (address != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("address=").append(address);
    }
    if (extension != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (name != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("name=").append(name);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "Organization_Contact", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Organization_Contact {
    @Nullable Optional<List<ContactPoint>> telecom = Optional.empty();
    boolean telecomIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<CodeableConcept> purpose = Optional.empty();
    boolean purposeIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<Address> address = Optional.empty();
    boolean addressIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<HumanName> name = Optional.empty();
    boolean nameIsSet;
    @JsonProperty("telecom")
    public void setTelecom(Optional<List<ContactPoint>> telecom) {
      this.telecom = telecom;
      this.telecomIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("purpose")
    public void setPurpose(Optional<CodeableConcept> purpose) {
      this.purpose = purpose;
      this.purposeIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("address")
    public void setAddress(Optional<Address> address) {
      this.address = address;
      this.addressIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("name")
    public void setName(Optional<HumanName> name) {
      this.name = name;
      this.nameIsSet = true;
    }
    @Override
    public Optional<List<ContactPoint>> telecom() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> purpose() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Address> address() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<HumanName> name() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableOrganization_Contact fromJson(Json json) {
    ImmutableOrganization_Contact.Builder builder = ImmutableOrganization_Contact.builder();
    if (json.telecomIsSet) {
      builder.telecom(json.telecom);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.purposeIsSet) {
      builder.purpose(json.purpose);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.addressIsSet) {
      builder.address(json.address);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.nameIsSet) {
      builder.name(json.name);
    }
    return (ImmutableOrganization_Contact) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Organization_Contact} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Organization_Contact instance
   */
  public static Organization_Contact copyOf(Organization_Contact instance) {
    if (instance instanceof ImmutableOrganization_Contact) {
      return (ImmutableOrganization_Contact) instance;
    }
    return ImmutableOrganization_Contact.builder()
        .telecom(instance.telecom())
        .id(instance.id())
        .purpose(instance.purpose())
        .modifierExtension(instance.modifierExtension())
        .address(instance.address())
        .extension(instance.extension())
        .name(instance.name())
        .build();
  }

  /**
   * Creates a builder for {@link Organization_Contact Organization_Contact}.
   * <pre>
   * ImmutableOrganization_Contact.builder()
   *    .telecom(List&amp;lt;com.fhir.types.fhir.ContactPoint&amp;gt;) // optional {@link Organization_Contact#telecom() telecom}
   *    .id(String) // optional {@link Organization_Contact#id() id}
   *    .purpose(com.fhir.types.fhir.CodeableConcept) // optional {@link Organization_Contact#purpose() purpose}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link Organization_Contact#modifierExtension() modifierExtension}
   *    .address(com.fhir.types.fhir.Address) // optional {@link Organization_Contact#address() address}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link Organization_Contact#extension() extension}
   *    .name(com.fhir.types.fhir.HumanName) // optional {@link Organization_Contact#name() name}
   *    .build();
   * </pre>
   * @return A new Organization_Contact builder
   */
  public static ImmutableOrganization_Contact.Builder builder() {
    return new ImmutableOrganization_Contact.Builder();
  }

  /**
   * Builds instances of type {@link Organization_Contact Organization_Contact}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Organization_Contact", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_TELECOM = 0x1L;
    private static final long OPT_BIT_ID = 0x2L;
    private static final long OPT_BIT_PURPOSE = 0x4L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x8L;
    private static final long OPT_BIT_ADDRESS = 0x10L;
    private static final long OPT_BIT_EXTENSION = 0x20L;
    private static final long OPT_BIT_NAME = 0x40L;
    private long optBits;

    private @Nullable List<ContactPoint> telecom;
    private @Nullable String id;
    private @Nullable CodeableConcept purpose;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable Address address;
    private @Nullable List<Extension> extension;
    private @Nullable HumanName name;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Organization_Contact#telecom() telecom} to telecom.
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
     * Initializes the optional value {@link Organization_Contact#telecom() telecom} to telecom.
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
     * Initializes the optional value {@link Organization_Contact#id() id} to id.
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
     * Initializes the optional value {@link Organization_Contact#id() id} to id.
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
     * Initializes the optional value {@link Organization_Contact#purpose() purpose} to purpose.
     * @param purpose The value for purpose
     * @return {@code this} builder for chained invocation
     */
    public final Builder purpose(CodeableConcept purpose) {
      checkNotIsSet(purposeIsSet(), "purpose");
      this.purpose = Objects.requireNonNull(purpose, "purpose");
      optBits |= OPT_BIT_PURPOSE;
      return this;
    }

    /**
     * Initializes the optional value {@link Organization_Contact#purpose() purpose} to purpose.
     * @param purpose The value for purpose
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("purpose")
    public final Builder purpose(Optional<? extends CodeableConcept> purpose) {
      checkNotIsSet(purposeIsSet(), "purpose");
      this.purpose = purpose.orElse(null);
      optBits |= OPT_BIT_PURPOSE;
      return this;
    }

    /**
     * Initializes the optional value {@link Organization_Contact#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Organization_Contact#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Organization_Contact#address() address} to address.
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
     * Initializes the optional value {@link Organization_Contact#address() address} to address.
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
     * Initializes the optional value {@link Organization_Contact#extension() extension} to extension.
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
     * Initializes the optional value {@link Organization_Contact#extension() extension} to extension.
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
     * Initializes the optional value {@link Organization_Contact#name() name} to name.
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
     * Initializes the optional value {@link Organization_Contact#name() name} to name.
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
     * Builds a new {@link Organization_Contact Organization_Contact}.
     * @return An immutable instance of Organization_Contact
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Organization_Contact build() {
      return new ImmutableOrganization_Contact(telecom, id, purpose, modifierExtension, address, extension, name);
    }

    private boolean telecomIsSet() {
      return (optBits & OPT_BIT_TELECOM) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean purposeIsSet() {
      return (optBits & OPT_BIT_PURPOSE) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean addressIsSet() {
      return (optBits & OPT_BIT_ADDRESS) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean nameIsSet() {
      return (optBits & OPT_BIT_NAME) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Organization_Contact is strict, attribute is already set: ".concat(name));
    }
  }
}
