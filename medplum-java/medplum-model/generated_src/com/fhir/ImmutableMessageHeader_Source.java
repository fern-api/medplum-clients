//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link MessageHeader_Source}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableMessageHeader_Source.builder()}.
 */
@org.immutables.value.Generated(from = "MessageHeader_Source", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableMessageHeader_Source implements com.fhir.MessageHeader_Source {
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable java.lang.String software;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable java.lang.String id;
  private final @javax.annotation.Nullable java.lang.String version;
  private final @javax.annotation.Nullable java.lang.String name;
  private final @javax.annotation.Nullable com.fhir.ContactPoint contact;
  private final @javax.annotation.Nullable com.fhir.url endpoint;

  private ImmutableMessageHeader_Source(
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable java.lang.String software,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable java.lang.String id,
      @javax.annotation.Nullable java.lang.String version,
      @javax.annotation.Nullable java.lang.String name,
      @javax.annotation.Nullable com.fhir.ContactPoint contact,
      @javax.annotation.Nullable com.fhir.url endpoint) {
    this.modifierExtension = modifierExtension;
    this.software = software;
    this.extension = extension;
    this.id = id;
    this.version = version;
    this.name = name;
    this.contact = contact;
    this.endpoint = endpoint;
  }

  /**
   * @return The value of the {@code modifierExtension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() {
    return java.util.Optional.ofNullable(modifierExtension);
  }

  /**
   * @return The value of the {@code software} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("software")
  @Override
  public java.util.Optional<java.lang.String> software() {
    return java.util.Optional.ofNullable(software);
  }

  /**
   * @return The value of the {@code extension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("extension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> extension() {
    return java.util.Optional.ofNullable(extension);
  }

  /**
   * @return The value of the {@code id} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("id")
  @Override
  public java.util.Optional<java.lang.String> id() {
    return java.util.Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code version} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("version")
  @Override
  public java.util.Optional<java.lang.String> version() {
    return java.util.Optional.ofNullable(version);
  }

  /**
   * @return The value of the {@code name} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("name")
  @Override
  public java.util.Optional<java.lang.String> name() {
    return java.util.Optional.ofNullable(name);
  }

  /**
   * @return The value of the {@code contact} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("contact")
  @Override
  public java.util.Optional<com.fhir.ContactPoint> contact() {
    return java.util.Optional.ofNullable(contact);
  }

  /**
   * @return The value of the {@code endpoint} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("endpoint")
  @Override
  public java.util.Optional<com.fhir.url> endpoint() {
    return java.util.Optional.ofNullable(endpoint);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageHeader_Source#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageHeader_Source withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableMessageHeader_Source(
        newValue,
        this.software,
        this.extension,
        this.id,
        this.version,
        this.name,
        this.contact,
        this.endpoint);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageHeader_Source#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMessageHeader_Source withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableMessageHeader_Source(
        value,
        this.software,
        this.extension,
        this.id,
        this.version,
        this.name,
        this.contact,
        this.endpoint);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageHeader_Source#software() software} attribute.
   * @param value The value for software
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageHeader_Source withSoftware(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "software");
    if (java.util.Objects.equals(this.software, newValue)) return this;
    return new ImmutableMessageHeader_Source(
        this.modifierExtension,
        newValue,
        this.extension,
        this.id,
        this.version,
        this.name,
        this.contact,
        this.endpoint);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageHeader_Source#software() software} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for software
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageHeader_Source withSoftware(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.software, value)) return this;
    return new ImmutableMessageHeader_Source(
        this.modifierExtension,
        value,
        this.extension,
        this.id,
        this.version,
        this.name,
        this.contact,
        this.endpoint);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageHeader_Source#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageHeader_Source withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableMessageHeader_Source(
        this.modifierExtension,
        this.software,
        newValue,
        this.id,
        this.version,
        this.name,
        this.contact,
        this.endpoint);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageHeader_Source#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMessageHeader_Source withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableMessageHeader_Source(
        this.modifierExtension,
        this.software,
        value,
        this.id,
        this.version,
        this.name,
        this.contact,
        this.endpoint);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageHeader_Source#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageHeader_Source withId(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "id");
    if (java.util.Objects.equals(this.id, newValue)) return this;
    return new ImmutableMessageHeader_Source(
        this.modifierExtension,
        this.software,
        this.extension,
        newValue,
        this.version,
        this.name,
        this.contact,
        this.endpoint);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageHeader_Source#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageHeader_Source withId(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.id, value)) return this;
    return new ImmutableMessageHeader_Source(
        this.modifierExtension,
        this.software,
        this.extension,
        value,
        this.version,
        this.name,
        this.contact,
        this.endpoint);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageHeader_Source#version() version} attribute.
   * @param value The value for version
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageHeader_Source withVersion(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "version");
    if (java.util.Objects.equals(this.version, newValue)) return this;
    return new ImmutableMessageHeader_Source(
        this.modifierExtension,
        this.software,
        this.extension,
        this.id,
        newValue,
        this.name,
        this.contact,
        this.endpoint);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageHeader_Source#version() version} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for version
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageHeader_Source withVersion(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.version, value)) return this;
    return new ImmutableMessageHeader_Source(
        this.modifierExtension,
        this.software,
        this.extension,
        this.id,
        value,
        this.name,
        this.contact,
        this.endpoint);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageHeader_Source#name() name} attribute.
   * @param value The value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageHeader_Source withName(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "name");
    if (java.util.Objects.equals(this.name, newValue)) return this;
    return new ImmutableMessageHeader_Source(
        this.modifierExtension,
        this.software,
        this.extension,
        this.id,
        this.version,
        newValue,
        this.contact,
        this.endpoint);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageHeader_Source#name() name} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageHeader_Source withName(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.name, value)) return this;
    return new ImmutableMessageHeader_Source(
        this.modifierExtension,
        this.software,
        this.extension,
        this.id,
        this.version,
        value,
        this.contact,
        this.endpoint);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageHeader_Source#contact() contact} attribute.
   * @param value The value for contact
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageHeader_Source withContact(com.fhir.ContactPoint value) {
    @javax.annotation.Nullable com.fhir.ContactPoint newValue = java.util.Objects.requireNonNull(value, "contact");
    if (this.contact == newValue) return this;
    return new ImmutableMessageHeader_Source(
        this.modifierExtension,
        this.software,
        this.extension,
        this.id,
        this.version,
        this.name,
        newValue,
        this.endpoint);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageHeader_Source#contact() contact} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contact
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMessageHeader_Source withContact(java.util.Optional<? extends com.fhir.ContactPoint> optional) {
    @javax.annotation.Nullable com.fhir.ContactPoint value = optional.orElse(null);
    if (this.contact == value) return this;
    return new ImmutableMessageHeader_Source(
        this.modifierExtension,
        this.software,
        this.extension,
        this.id,
        this.version,
        this.name,
        value,
        this.endpoint);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MessageHeader_Source#endpoint() endpoint} attribute.
   * @param value The value for endpoint
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMessageHeader_Source withEndpoint(com.fhir.url value) {
    @javax.annotation.Nullable com.fhir.url newValue = java.util.Objects.requireNonNull(value, "endpoint");
    if (this.endpoint == newValue) return this;
    return new ImmutableMessageHeader_Source(
        this.modifierExtension,
        this.software,
        this.extension,
        this.id,
        this.version,
        this.name,
        this.contact,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MessageHeader_Source#endpoint() endpoint} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for endpoint
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMessageHeader_Source withEndpoint(java.util.Optional<? extends com.fhir.url> optional) {
    @javax.annotation.Nullable com.fhir.url value = optional.orElse(null);
    if (this.endpoint == value) return this;
    return new ImmutableMessageHeader_Source(
        this.modifierExtension,
        this.software,
        this.extension,
        this.id,
        this.version,
        this.name,
        this.contact,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableMessageHeader_Source} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableMessageHeader_Source
        && equalTo((ImmutableMessageHeader_Source) another);
  }

  private boolean equalTo(ImmutableMessageHeader_Source another) {
    return java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(software, another.software)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(version, another.version)
        && java.util.Objects.equals(name, another.name)
        && java.util.Objects.equals(contact, another.contact)
        && java.util.Objects.equals(endpoint, another.endpoint);
  }

  /**
   * Computes a hash code from attributes: {@code modifierExtension}, {@code software}, {@code extension}, {@code id}, {@code version}, {@code name}, {@code contact}, {@code endpoint}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(software);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(version);
    h += (h << 5) + java.util.Objects.hashCode(name);
    h += (h << 5) + java.util.Objects.hashCode(contact);
    h += (h << 5) + java.util.Objects.hashCode(endpoint);
    return h;
  }

  /**
   * Prints the immutable value {@code MessageHeader_Source} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("MessageHeader_Source{");
    if (modifierExtension != null) {
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (software != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("software=").append(software);
    }
    if (extension != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (id != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (version != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("version=").append(version);
    }
    if (name != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("name=").append(name);
    }
    if (contact != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("contact=").append(contact);
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
  @org.immutables.value.Generated(from = "MessageHeader_Source", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.MessageHeader_Source {
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> software = java.util.Optional.empty();
    boolean softwareIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> version = java.util.Optional.empty();
    boolean versionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> name = java.util.Optional.empty();
    boolean nameIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.ContactPoint> contact = java.util.Optional.empty();
    boolean contactIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.url> endpoint = java.util.Optional.empty();
    boolean endpointIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("software")
    public void setSoftware(java.util.Optional<java.lang.String> software) {
      this.software = software;
      this.softwareIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<java.lang.String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    public void setVersion(java.util.Optional<java.lang.String> version) {
      this.version = version;
      this.versionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    public void setName(java.util.Optional<java.lang.String> name) {
      this.name = name;
      this.nameIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("contact")
    public void setContact(java.util.Optional<com.fhir.ContactPoint> contact) {
      this.contact = contact;
      this.contactIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("endpoint")
    public void setEndpoint(java.util.Optional<com.fhir.url> endpoint) {
      this.endpoint = endpoint;
      this.endpointIsSet = true;
    }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> software() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> version() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> name() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.ContactPoint> contact() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.url> endpoint() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableMessageHeader_Source fromJson(Json json) {
    ImmutableMessageHeader_Source.Builder builder = ImmutableMessageHeader_Source.builder();
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.softwareIsSet) {
      builder.software(json.software);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.versionIsSet) {
      builder.version(json.version);
    }
    if (json.nameIsSet) {
      builder.name(json.name);
    }
    if (json.contactIsSet) {
      builder.contact(json.contact);
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
        .modifierExtension(instance.modifierExtension())
        .software(instance.software())
        .extension(instance.extension())
        .id(instance.id())
        .version(instance.version())
        .name(instance.name())
        .contact(instance.contact())
        .endpoint(instance.endpoint())
        .build();
  }

  /**
   * Creates a builder for {@link MessageHeader_Source MessageHeader_Source}.
   * <pre>
   * ImmutableMessageHeader_Source.builder()
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link MessageHeader_Source#modifierExtension() modifierExtension}
   *    .software(String) // optional {@link MessageHeader_Source#software() software}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link MessageHeader_Source#extension() extension}
   *    .id(String) // optional {@link MessageHeader_Source#id() id}
   *    .version(String) // optional {@link MessageHeader_Source#version() version}
   *    .name(String) // optional {@link MessageHeader_Source#name() name}
   *    .contact(com.fhir.ContactPoint) // optional {@link MessageHeader_Source#contact() contact}
   *    .endpoint(com.fhir.url) // optional {@link MessageHeader_Source#endpoint() endpoint}
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
  @org.immutables.value.Generated(from = "MessageHeader_Source", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x1L;
    private static final long OPT_BIT_SOFTWARE = 0x2L;
    private static final long OPT_BIT_EXTENSION = 0x4L;
    private static final long OPT_BIT_ID = 0x8L;
    private static final long OPT_BIT_VERSION = 0x10L;
    private static final long OPT_BIT_NAME = 0x20L;
    private static final long OPT_BIT_CONTACT = 0x40L;
    private static final long OPT_BIT_ENDPOINT = 0x80L;
    private long optBits;

    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable java.lang.String software;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable java.lang.String id;
    private @javax.annotation.Nullable java.lang.String version;
    private @javax.annotation.Nullable java.lang.String name;
    private @javax.annotation.Nullable com.fhir.ContactPoint contact;
    private @javax.annotation.Nullable com.fhir.url endpoint;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link MessageHeader_Source#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    public final Builder modifierExtension(java.util.List<com.fhir.Extension> modifierExtension) {
      checkNotIsSet(modifierExtensionIsSet(), "modifierExtension");
      this.modifierExtension = java.util.Objects.requireNonNull(modifierExtension, "modifierExtension");
      optBits |= OPT_BIT_MODIFIER_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageHeader_Source#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public final Builder modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension) {
      checkNotIsSet(modifierExtensionIsSet(), "modifierExtension");
      this.modifierExtension = modifierExtension.orElse(null);
      optBits |= OPT_BIT_MODIFIER_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageHeader_Source#software() software} to software.
     * @param software The value for software
     * @return {@code this} builder for chained invocation
     */
    public final Builder software(java.lang.String software) {
      checkNotIsSet(softwareIsSet(), "software");
      this.software = java.util.Objects.requireNonNull(software, "software");
      optBits |= OPT_BIT_SOFTWARE;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageHeader_Source#software() software} to software.
     * @param software The value for software
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("software")
    public final Builder software(java.util.Optional<java.lang.String> software) {
      checkNotIsSet(softwareIsSet(), "software");
      this.software = software.orElse(null);
      optBits |= OPT_BIT_SOFTWARE;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageHeader_Source#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    public final Builder extension(java.util.List<com.fhir.Extension> extension) {
      checkNotIsSet(extensionIsSet(), "extension");
      this.extension = java.util.Objects.requireNonNull(extension, "extension");
      optBits |= OPT_BIT_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageHeader_Source#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public final Builder extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension) {
      checkNotIsSet(extensionIsSet(), "extension");
      this.extension = extension.orElse(null);
      optBits |= OPT_BIT_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageHeader_Source#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(java.lang.String id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = java.util.Objects.requireNonNull(id, "id");
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageHeader_Source#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public final Builder id(java.util.Optional<java.lang.String> id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = id.orElse(null);
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageHeader_Source#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for chained invocation
     */
    public final Builder version(java.lang.String version) {
      checkNotIsSet(versionIsSet(), "version");
      this.version = java.util.Objects.requireNonNull(version, "version");
      optBits |= OPT_BIT_VERSION;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageHeader_Source#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    public final Builder version(java.util.Optional<java.lang.String> version) {
      checkNotIsSet(versionIsSet(), "version");
      this.version = version.orElse(null);
      optBits |= OPT_BIT_VERSION;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageHeader_Source#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for chained invocation
     */
    public final Builder name(java.lang.String name) {
      checkNotIsSet(nameIsSet(), "name");
      this.name = java.util.Objects.requireNonNull(name, "name");
      optBits |= OPT_BIT_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageHeader_Source#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    public final Builder name(java.util.Optional<java.lang.String> name) {
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
    public final Builder contact(com.fhir.ContactPoint contact) {
      checkNotIsSet(contactIsSet(), "contact");
      this.contact = java.util.Objects.requireNonNull(contact, "contact");
      optBits |= OPT_BIT_CONTACT;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageHeader_Source#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("contact")
    public final Builder contact(java.util.Optional<? extends com.fhir.ContactPoint> contact) {
      checkNotIsSet(contactIsSet(), "contact");
      this.contact = contact.orElse(null);
      optBits |= OPT_BIT_CONTACT;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageHeader_Source#endpoint() endpoint} to endpoint.
     * @param endpoint The value for endpoint
     * @return {@code this} builder for chained invocation
     */
    public final Builder endpoint(com.fhir.url endpoint) {
      checkNotIsSet(endpointIsSet(), "endpoint");
      this.endpoint = java.util.Objects.requireNonNull(endpoint, "endpoint");
      optBits |= OPT_BIT_ENDPOINT;
      return this;
    }

    /**
     * Initializes the optional value {@link MessageHeader_Source#endpoint() endpoint} to endpoint.
     * @param endpoint The value for endpoint
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("endpoint")
    public final Builder endpoint(java.util.Optional<? extends com.fhir.url> endpoint) {
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
    public com.fhir.MessageHeader_Source build() {
      return new ImmutableMessageHeader_Source(modifierExtension, software, extension, id, version, name, contact, endpoint);
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean softwareIsSet() {
      return (optBits & OPT_BIT_SOFTWARE) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean versionIsSet() {
      return (optBits & OPT_BIT_VERSION) != 0;
    }

    private boolean nameIsSet() {
      return (optBits & OPT_BIT_NAME) != 0;
    }

    private boolean contactIsSet() {
      return (optBits & OPT_BIT_CONTACT) != 0;
    }

    private boolean endpointIsSet() {
      return (optBits & OPT_BIT_ENDPOINT) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of MessageHeader_Source is strict, attribute is already set: ".concat(name));
    }
  }
}
