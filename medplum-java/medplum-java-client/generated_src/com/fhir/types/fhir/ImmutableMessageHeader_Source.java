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
 * Immutable implementation of {@link MessageHeader_Source}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableMessageHeader_Source.builder()}.
 */
@Generated(from = "MessageHeader_Source", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableMessageHeader_Source implements MessageHeader_Source {
  private final @Nullable String software;
  private final @Nullable String name;
  private final @Nullable ContactPoint contact;
  private final @Nullable String id;
  private final @Nullable List<Extension> extension;
  private final @Nullable String version;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable Url endpoint;

  private ImmutableMessageHeader_Source(
      @Nullable String software,
      @Nullable String name,
      @Nullable ContactPoint contact,
      @Nullable String id,
      @Nullable List<Extension> extension,
      @Nullable String version,
      @Nullable List<Extension> modifierExtension,
      @Nullable Url endpoint) {
    this.software = software;
    this.name = name;
    this.contact = contact;
    this.id = id;
    this.extension = extension;
    this.version = version;
    this.modifierExtension = modifierExtension;
    this.endpoint = endpoint;
  }

  /**
   * @return The value of the {@code software} attribute
   */
  @JsonProperty("software")
  @Override
  public Optional<String> software() {
    return Optional.ofNullable(software);
  }

  /**
   * @return The value of the {@code name} attribute
   */
  @JsonProperty("name")
  @Override
  public Optional<String> name() {
    return Optional.ofNullable(name);
  }

  /**
   * @return The value of the {@code contact} attribute
   */
  @JsonProperty("contact")
  @Override
  public Optional<ContactPoint> contact() {
    return Optional.ofNullable(contact);
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
   * @return The value of the {@code version} attribute
   */
  @JsonProperty("version")
  @Override
  public Optional<String> version() {
    return Optional.ofNullable(version);
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
   * @return The value of the {@code endpoint} attribute
   */
  @JsonProperty("endpoint")
  @Override
  public Optional<Url> endpoint() {
    return Optional.ofNullable(endpoint);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageHeader_Source#software() software} attribute.
   * @param value The value for software
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageHeader_Source withSoftware(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "software");
    if (Objects.equals(this.software, newValue)) return this;
    return new ImmutableMessageHeader_Source(
        newValue,
        this.name,
        this.contact,
        this.id,
        this.extension,
        this.version,
        this.modifierExtension,
        this.endpoint);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageHeader_Source#software() software} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for software
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageHeader_Source withSoftware(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.software, value)) return this;
    return new ImmutableMessageHeader_Source(
        value,
        this.name,
        this.contact,
        this.id,
        this.extension,
        this.version,
        this.modifierExtension,
        this.endpoint);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageHeader_Source#name() name} attribute.
   * @param value The value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageHeader_Source withName(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "name");
    if (Objects.equals(this.name, newValue)) return this;
    return new ImmutableMessageHeader_Source(
        this.software,
        newValue,
        this.contact,
        this.id,
        this.extension,
        this.version,
        this.modifierExtension,
        this.endpoint);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageHeader_Source#name() name} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageHeader_Source withName(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.name, value)) return this;
    return new ImmutableMessageHeader_Source(
        this.software,
        value,
        this.contact,
        this.id,
        this.extension,
        this.version,
        this.modifierExtension,
        this.endpoint);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageHeader_Source#contact() contact} attribute.
   * @param value The value for contact
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageHeader_Source withContact(ContactPoint value) {
    @Nullable ContactPoint newValue = Objects.requireNonNull(value, "contact");
    if (this.contact == newValue) return this;
    return new ImmutableMessageHeader_Source(
        this.software,
        this.name,
        newValue,
        this.id,
        this.extension,
        this.version,
        this.modifierExtension,
        this.endpoint);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageHeader_Source#contact() contact} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contact
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMessageHeader_Source withContact(Optional<? extends ContactPoint> optional) {
    @Nullable ContactPoint value = optional.orElse(null);
    if (this.contact == value) return this;
    return new ImmutableMessageHeader_Source(
        this.software,
        this.name,
        value,
        this.id,
        this.extension,
        this.version,
        this.modifierExtension,
        this.endpoint);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageHeader_Source#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageHeader_Source withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableMessageHeader_Source(
        this.software,
        this.name,
        this.contact,
        newValue,
        this.extension,
        this.version,
        this.modifierExtension,
        this.endpoint);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageHeader_Source#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageHeader_Source withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableMessageHeader_Source(
        this.software,
        this.name,
        this.contact,
        value,
        this.extension,
        this.version,
        this.modifierExtension,
        this.endpoint);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageHeader_Source#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageHeader_Source withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableMessageHeader_Source(
        this.software,
        this.name,
        this.contact,
        this.id,
        newValue,
        this.version,
        this.modifierExtension,
        this.endpoint);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageHeader_Source#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMessageHeader_Source withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableMessageHeader_Source(
        this.software,
        this.name,
        this.contact,
        this.id,
        value,
        this.version,
        this.modifierExtension,
        this.endpoint);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageHeader_Source#version() version} attribute.
   * @param value The value for version
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageHeader_Source withVersion(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "version");
    if (Objects.equals(this.version, newValue)) return this;
    return new ImmutableMessageHeader_Source(
        this.software,
        this.name,
        this.contact,
        this.id,
        this.extension,
        newValue,
        this.modifierExtension,
        this.endpoint);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageHeader_Source#version() version} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for version
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageHeader_Source withVersion(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.version, value)) return this;
    return new ImmutableMessageHeader_Source(
        this.software,
        this.name,
        this.contact,
        this.id,
        this.extension,
        value,
        this.modifierExtension,
        this.endpoint);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageHeader_Source#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageHeader_Source withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableMessageHeader_Source(
        this.software,
        this.name,
        this.contact,
        this.id,
        this.extension,
        this.version,
        newValue,
        this.endpoint);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageHeader_Source#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMessageHeader_Source withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableMessageHeader_Source(
        this.software,
        this.name,
        this.contact,
        this.id,
        this.extension,
        this.version,
        value,
        this.endpoint);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageHeader_Source#endpoint() endpoint} attribute.
   * @param value The value for endpoint
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageHeader_Source withEndpoint(Url value) {
    @Nullable Url newValue = Objects.requireNonNull(value, "endpoint");
    if (this.endpoint == newValue) return this;
    return new ImmutableMessageHeader_Source(
        this.software,
        this.name,
        this.contact,
        this.id,
        this.extension,
        this.version,
        this.modifierExtension,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageHeader_Source#endpoint() endpoint} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for endpoint
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMessageHeader_Source withEndpoint(Optional<? extends Url> optional) {
    @Nullable Url value = optional.orElse(null);
    if (this.endpoint == value) return this;
    return new ImmutableMessageHeader_Source(
        this.software,
        this.name,
        this.contact,
        this.id,
        this.extension,
        this.version,
        this.modifierExtension,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableMessageHeader_Source} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableMessageHeader_Source
        && equalTo((ImmutableMessageHeader_Source) another);
  }

  private boolean equalTo(ImmutableMessageHeader_Source another) {
    return Objects.equals(software, another.software)
        && Objects.equals(name, another.name)
        && Objects.equals(contact, another.contact)
        && Objects.equals(id, another.id)
        && Objects.equals(extension, another.extension)
        && Objects.equals(version, another.version)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(endpoint, another.endpoint);
  }

  /**
   * Computes a hash code from attributes: {@code software}, {@code name}, {@code contact}, {@code id}, {@code extension}, {@code version}, {@code modifierExtension}, {@code endpoint}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(software);
    h += (h << 5) + Objects.hashCode(name);
    h += (h << 5) + Objects.hashCode(contact);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(version);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(endpoint);
    return h;
  }

  /**
   * Prints the immutable value {@code MessageHeader_Source} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("MessageHeader_Source{");
    if (software != null) {
      builder.append("software=").append(software);
    }
    if (name != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("name=").append(name);
    }
    if (contact != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("contact=").append(contact);
    }
    if (id != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (extension != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (version != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("version=").append(version);
    }
    if (modifierExtension != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (endpoint != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("endpoint=").append(endpoint);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "MessageHeader_Source", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements MessageHeader_Source {
    @Nullable Optional<String> software = Optional.empty();
    boolean softwareIsSet;
    @Nullable Optional<String> name = Optional.empty();
    boolean nameIsSet;
    @Nullable Optional<ContactPoint> contact = Optional.empty();
    boolean contactIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<String> version = Optional.empty();
    boolean versionIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<Url> endpoint = Optional.empty();
    boolean endpointIsSet;
    @JsonProperty("software")
    public void setSoftware(Optional<String> software) {
      this.software = software;
      this.softwareIsSet = true;
    }
    @JsonProperty("name")
    public void setName(Optional<String> name) {
      this.name = name;
      this.nameIsSet = true;
    }
    @JsonProperty("contact")
    public void setContact(Optional<ContactPoint> contact) {
      this.contact = contact;
      this.contactIsSet = true;
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
    @JsonProperty("version")
    public void setVersion(Optional<String> version) {
      this.version = version;
      this.versionIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("endpoint")
    public void setEndpoint(Optional<Url> endpoint) {
      this.endpoint = endpoint;
      this.endpointIsSet = true;
    }
    @Override
    public Optional<String> software() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> name() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<ContactPoint> contact() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> version() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Url> endpoint() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableMessageHeader_Source fromJson(Json json) {
    ImmutableMessageHeader_Source.Builder builder = ImmutableMessageHeader_Source.builder();
    if (json.softwareIsSet) {
      builder.software(json.software);
    }
    if (json.nameIsSet) {
      builder.name(json.name);
    }
    if (json.contactIsSet) {
      builder.contact(json.contact);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.versionIsSet) {
      builder.version(json.version);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.endpointIsSet) {
      builder.endpoint(json.endpoint);
    }
    return (ImmutableMessageHeader_Source) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link MessageHeader_Source} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable MessageHeader_Source instance
   */
  public static MessageHeader_Source copyOf(MessageHeader_Source instance) {
    if (instance instanceof ImmutableMessageHeader_Source) {
      return (ImmutableMessageHeader_Source) instance;
    }
    return ImmutableMessageHeader_Source.builder()
        .software(instance.software())
        .name(instance.name())
        .contact(instance.contact())
        .id(instance.id())
        .extension(instance.extension())
        .version(instance.version())
        .modifierExtension(instance.modifierExtension())
        .endpoint(instance.endpoint())
        .build();
  }

  /**
   * Creates a builder for {@link MessageHeader_Source MessageHeader_Source}.
   * <pre>
   * ImmutableMessageHeader_Source.builder()
   *    .software(String) // optional {@link MessageHeader_Source#software() software}
   *    .name(String) // optional {@link MessageHeader_Source#name() name}
   *    .contact(com.fhir.types.fhir.ContactPoint) // optional {@link MessageHeader_Source#contact() contact}
   *    .id(String) // optional {@link MessageHeader_Source#id() id}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link MessageHeader_Source#extension() extension}
   *    .version(String) // optional {@link MessageHeader_Source#version() version}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link MessageHeader_Source#modifierExtension() modifierExtension}
   *    .endpoint(com.fhir.types.fhir.Url) // optional {@link MessageHeader_Source#endpoint() endpoint}
   *    .build();
   * </pre>
   * @return A new MessageHeader_Source builder
   */
  public static ImmutableMessageHeader_Source.Builder builder() {
    return new ImmutableMessageHeader_Source.Builder();
  }

  /**
   * Builds instances of type {@link MessageHeader_Source MessageHeader_Source}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "MessageHeader_Source", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_SOFTWARE = 0x1L;
    private static final long OPT_BIT_NAME = 0x2L;
    private static final long OPT_BIT_CONTACT = 0x4L;
    private static final long OPT_BIT_ID = 0x8L;
    private static final long OPT_BIT_EXTENSION = 0x10L;
    private static final long OPT_BIT_VERSION = 0x20L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x40L;
    private static final long OPT_BIT_ENDPOINT = 0x80L;
    private long optBits;

    private @Nullable String software;
    private @Nullable String name;
    private @Nullable ContactPoint contact;
    private @Nullable String id;
    private @Nullable List<Extension> extension;
    private @Nullable String version;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable Url endpoint;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link MessageHeader_Source#software() software} to software.
     * @param software The value for software
     * @return {@code this} builder for chained invocation
     */
    public final Builder software(String software) {
      checkNotIsSet(softwareIsSet(), "software");
      this.software = Objects.requireNonNull(software, "software");
      optBits |= OPT_BIT_SOFTWARE;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageHeader_Source#software() software} to software.
     * @param software The value for software
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("software")
    public final Builder software(Optional<String> software) {
      checkNotIsSet(softwareIsSet(), "software");
      this.software = software.orElse(null);
      optBits |= OPT_BIT_SOFTWARE;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageHeader_Source#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for chained invocation
     */
    public final Builder name(String name) {
      checkNotIsSet(nameIsSet(), "name");
      this.name = Objects.requireNonNull(name, "name");
      optBits |= OPT_BIT_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageHeader_Source#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("name")
    public final Builder name(Optional<String> name) {
      checkNotIsSet(nameIsSet(), "name");
      this.name = name.orElse(null);
      optBits |= OPT_BIT_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageHeader_Source#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for chained invocation
     */
    public final Builder contact(ContactPoint contact) {
      checkNotIsSet(contactIsSet(), "contact");
      this.contact = Objects.requireNonNull(contact, "contact");
      optBits |= OPT_BIT_CONTACT;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageHeader_Source#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("contact")
    public final Builder contact(Optional<? extends ContactPoint> contact) {
      checkNotIsSet(contactIsSet(), "contact");
      this.contact = contact.orElse(null);
      optBits |= OPT_BIT_CONTACT;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageHeader_Source#id() id} to id.
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
     * Initializes the optional value {@link MessageHeader_Source#id() id} to id.
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
     * Initializes the optional value {@link MessageHeader_Source#extension() extension} to extension.
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
     * Initializes the optional value {@link MessageHeader_Source#extension() extension} to extension.
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
     * Initializes the optional value {@link MessageHeader_Source#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for chained invocation
     */
    public final Builder version(String version) {
      checkNotIsSet(versionIsSet(), "version");
      this.version = Objects.requireNonNull(version, "version");
      optBits |= OPT_BIT_VERSION;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageHeader_Source#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("version")
    public final Builder version(Optional<String> version) {
      checkNotIsSet(versionIsSet(), "version");
      this.version = version.orElse(null);
      optBits |= OPT_BIT_VERSION;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageHeader_Source#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MessageHeader_Source#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MessageHeader_Source#endpoint() endpoint} to endpoint.
     * @param endpoint The value for endpoint
     * @return {@code this} builder for chained invocation
     */
    public final Builder endpoint(Url endpoint) {
      checkNotIsSet(endpointIsSet(), "endpoint");
      this.endpoint = Objects.requireNonNull(endpoint, "endpoint");
      optBits |= OPT_BIT_ENDPOINT;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageHeader_Source#endpoint() endpoint} to endpoint.
     * @param endpoint The value for endpoint
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("endpoint")
    public final Builder endpoint(Optional<? extends Url> endpoint) {
      checkNotIsSet(endpointIsSet(), "endpoint");
      this.endpoint = endpoint.orElse(null);
      optBits |= OPT_BIT_ENDPOINT;
      return this;
    }

    /**
     * Builds a new {@link MessageHeader_Source MessageHeader_Source}.
     * @return An immutable instance of MessageHeader_Source
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public MessageHeader_Source build() {
      return new ImmutableMessageHeader_Source(software, name, contact, id, extension, version, modifierExtension, endpoint);
    }

    private boolean softwareIsSet() {
      return (optBits & OPT_BIT_SOFTWARE) != 0;
    }

    private boolean nameIsSet() {
      return (optBits & OPT_BIT_NAME) != 0;
    }

    private boolean contactIsSet() {
      return (optBits & OPT_BIT_CONTACT) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean versionIsSet() {
      return (optBits & OPT_BIT_VERSION) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean endpointIsSet() {
      return (optBits & OPT_BIT_ENDPOINT) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of MessageHeader_Source is strict, attribute is already set: ".concat(name));
    }
  }
}
