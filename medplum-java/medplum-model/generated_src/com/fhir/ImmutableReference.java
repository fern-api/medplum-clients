//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link Reference}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableReference.builder()}.
 */
@org.immutables.value.Generated(from = "Reference", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableReference implements com.fhir.Reference {
  private final @javax.annotation.Nullable java.lang.String id;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable com.fhir.uri type;
  private final @javax.annotation.Nullable java.lang.String display;
  private final @javax.annotation.Nullable java.lang.String reference;
  private final @javax.annotation.Nullable com.fhir.Identifier identifier;
  private final @javax.annotation.Nullable com.fhir.ResourceList resource;

  private ImmutableReference(
      @javax.annotation.Nullable java.lang.String id,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable com.fhir.uri type,
      @javax.annotation.Nullable java.lang.String display,
      @javax.annotation.Nullable java.lang.String reference,
      @javax.annotation.Nullable com.fhir.Identifier identifier,
      @javax.annotation.Nullable com.fhir.ResourceList resource) {
    this.id = id;
    this.extension = extension;
    this.type = type;
    this.display = display;
    this.reference = reference;
    this.identifier = identifier;
    this.resource = resource;
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
   * @return The value of the {@code extension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("extension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> extension() {
    return java.util.Optional.ofNullable(extension);
  }

  /**
   * @return The value of the {@code type} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("type")
  @Override
  public java.util.Optional<com.fhir.uri> type() {
    return java.util.Optional.ofNullable(type);
  }

  /**
   * @return The value of the {@code display} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("display")
  @Override
  public java.util.Optional<java.lang.String> display() {
    return java.util.Optional.ofNullable(display);
  }

  /**
   * @return The value of the {@code reference} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("reference")
  @Override
  public java.util.Optional<java.lang.String> reference() {
    return java.util.Optional.ofNullable(reference);
  }

  /**
   * @return The value of the {@code identifier} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("identifier")
  @Override
  public java.util.Optional<com.fhir.Identifier> identifier() {
    return java.util.Optional.ofNullable(identifier);
  }

  /**
   * @return The value of the {@code resource} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("resource")
  @Override
  public java.util.Optional<com.fhir.ResourceList> resource() {
    return java.util.Optional.ofNullable(resource);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Reference#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableReference withId(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "id");
    if (java.util.Objects.equals(this.id, newValue)) return this;
    return new ImmutableReference(
        newValue,
        this.extension,
        this.type,
        this.display,
        this.reference,
        this.identifier,
        this.resource);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Reference#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableReference withId(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.id, value)) return this;
    return new ImmutableReference(value, this.extension, this.type, this.display, this.reference, this.identifier, this.resource);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Reference#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableReference withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableReference(this.id, newValue, this.type, this.display, this.reference, this.identifier, this.resource);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Reference#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableReference withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableReference(this.id, value, this.type, this.display, this.reference, this.identifier, this.resource);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Reference#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableReference withType(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableReference(this.id, this.extension, newValue, this.display, this.reference, this.identifier, this.resource);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Reference#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableReference withType(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableReference(this.id, this.extension, value, this.display, this.reference, this.identifier, this.resource);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Reference#display() display} attribute.
   * @param value The value for display
   * @return A modified copy of {@code this} object
   */
  public final ImmutableReference withDisplay(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "display");
    if (java.util.Objects.equals(this.display, newValue)) return this;
    return new ImmutableReference(this.id, this.extension, this.type, newValue, this.reference, this.identifier, this.resource);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Reference#display() display} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for display
   * @return A modified copy of {@code this} object
   */
  public final ImmutableReference withDisplay(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.display, value)) return this;
    return new ImmutableReference(this.id, this.extension, this.type, value, this.reference, this.identifier, this.resource);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Reference#reference() reference} attribute.
   * @param value The value for reference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableReference withReference(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "reference");
    if (java.util.Objects.equals(this.reference, newValue)) return this;
    return new ImmutableReference(this.id, this.extension, this.type, this.display, newValue, this.identifier, this.resource);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Reference#reference() reference} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableReference withReference(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.reference, value)) return this;
    return new ImmutableReference(this.id, this.extension, this.type, this.display, value, this.identifier, this.resource);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Reference#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableReference withIdentifier(com.fhir.Identifier value) {
    @javax.annotation.Nullable com.fhir.Identifier newValue = java.util.Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableReference(this.id, this.extension, this.type, this.display, this.reference, newValue, this.resource);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Reference#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableReference withIdentifier(java.util.Optional<? extends com.fhir.Identifier> optional) {
    @javax.annotation.Nullable com.fhir.Identifier value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableReference(this.id, this.extension, this.type, this.display, this.reference, value, this.resource);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Reference#resource() resource} attribute.
   * @param value The value for resource
   * @return A modified copy of {@code this} object
   */
  public final ImmutableReference withResource(com.fhir.ResourceList value) {
    @javax.annotation.Nullable com.fhir.ResourceList newValue = java.util.Objects.requireNonNull(value, "resource");
    if (this.resource == newValue) return this;
    return new ImmutableReference(this.id, this.extension, this.type, this.display, this.reference, this.identifier, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Reference#resource() resource} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for resource
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableReference withResource(java.util.Optional<? extends com.fhir.ResourceList> optional) {
    @javax.annotation.Nullable com.fhir.ResourceList value = optional.orElse(null);
    if (this.resource == value) return this;
    return new ImmutableReference(this.id, this.extension, this.type, this.display, this.reference, this.identifier, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableReference} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableReference
        && equalTo((ImmutableReference) another);
  }

  private boolean equalTo(ImmutableReference another) {
    return java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(type, another.type)
        && java.util.Objects.equals(display, another.display)
        && java.util.Objects.equals(reference, another.reference)
        && java.util.Objects.equals(identifier, another.identifier)
        && java.util.Objects.equals(resource, another.resource);
  }

  /**
   * Computes a hash code from attributes: {@code id}, {@code extension}, {@code type}, {@code display}, {@code reference}, {@code identifier}, {@code resource}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(type);
    h += (h << 5) + java.util.Objects.hashCode(display);
    h += (h << 5) + java.util.Objects.hashCode(reference);
    h += (h << 5) + java.util.Objects.hashCode(identifier);
    h += (h << 5) + java.util.Objects.hashCode(resource);
    return h;
  }

  /**
   * Prints the immutable value {@code Reference} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("Reference{");
    if (id != null) {
      builder.append("id=").append(id);
    }
    if (extension != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (type != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("type=").append(type);
    }
    if (display != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("display=").append(display);
    }
    if (reference != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("reference=").append(reference);
    }
    if (identifier != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (resource != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("resource=").append(resource);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "Reference", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.Reference {
    @javax.annotation.Nullable java.util.Optional<java.lang.String> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> type = java.util.Optional.empty();
    boolean typeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> display = java.util.Optional.empty();
    boolean displayIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> reference = java.util.Optional.empty();
    boolean referenceIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Identifier> identifier = java.util.Optional.empty();
    boolean identifierIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.ResourceList> resource = java.util.Optional.empty();
    boolean resourceIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<java.lang.String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    public void setType(java.util.Optional<com.fhir.uri> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("display")
    public void setDisplay(java.util.Optional<java.lang.String> display) {
      this.display = display;
      this.displayIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("reference")
    public void setReference(java.util.Optional<java.lang.String> reference) {
      this.reference = reference;
      this.referenceIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    public void setIdentifier(java.util.Optional<com.fhir.Identifier> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("resource")
    public void setResource(java.util.Optional<com.fhir.ResourceList> resource) {
      this.resource = resource;
      this.resourceIsSet = true;
    }
    @Override
    public java.util.Optional<java.lang.String> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> type() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> display() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> reference() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Identifier> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.ResourceList> resource() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableReference fromJson(Json json) {
    ImmutableReference.Builder builder = ImmutableReference.builder();
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.displayIsSet) {
      builder.display(json.display);
    }
    if (json.referenceIsSet) {
      builder.reference(json.reference);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.resourceIsSet) {
      builder.resource(json.resource);
    }
    return (ImmutableReference) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Reference} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Reference instance
   */
  public static Reference copyOf(Reference instance) {
    if (instance instanceof ImmutableReference) {
      return (ImmutableReference) instance;
    }
    return ImmutableReference.builder()
        .id(instance.id())
        .extension(instance.extension())
        .type(instance.type())
        .display(instance.display())
        .reference(instance.reference())
        .identifier(instance.identifier())
        .resource(instance.resource())
        .build();
  }

  /**
   * Creates a builder for {@link Reference Reference}.
   * <pre>
   * ImmutableReference.builder()
   *    .id(String) // optional {@link Reference#id() id}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Reference#extension() extension}
   *    .type(com.fhir.uri) // optional {@link Reference#type() type}
   *    .display(String) // optional {@link Reference#display() display}
   *    .reference(String) // optional {@link Reference#reference() reference}
   *    .identifier(com.fhir.Identifier) // optional {@link Reference#identifier() identifier}
   *    .resource(com.fhir.ResourceList) // optional {@link Reference#resource() resource}
   *    .build();
   * </pre>
   * @return A new Reference builder
   */
  public static ImmutableReference.Builder builder() {
    return new ImmutableReference.Builder();
  }

  /**
   * Builds instances of type {@link Reference Reference}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "Reference", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_ID = 0x1L;
    private static final long OPT_BIT_EXTENSION = 0x2L;
    private static final long OPT_BIT_TYPE = 0x4L;
    private static final long OPT_BIT_DISPLAY = 0x8L;
    private static final long OPT_BIT_REFERENCE = 0x10L;
    private static final long OPT_BIT_IDENTIFIER = 0x20L;
    private static final long OPT_BIT_RESOURCE = 0x40L;
    private long optBits;

    private @javax.annotation.Nullable java.lang.String id;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable com.fhir.uri type;
    private @javax.annotation.Nullable java.lang.String display;
    private @javax.annotation.Nullable java.lang.String reference;
    private @javax.annotation.Nullable com.fhir.Identifier identifier;
    private @javax.annotation.Nullable com.fhir.ResourceList resource;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Reference#id() id} to id.
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
     * Initializes the optional value {@link Reference#id() id} to id.
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
     * Initializes the optional value {@link Reference#extension() extension} to extension.
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
     * Initializes the optional value {@link Reference#extension() extension} to extension.
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
     * Initializes the optional value {@link Reference#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    public final Builder type(com.fhir.uri type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = java.util.Objects.requireNonNull(type, "type");
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Reference#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    public final Builder type(java.util.Optional<? extends com.fhir.uri> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = type.orElse(null);
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Reference#display() display} to display.
     * @param display The value for display
     * @return {@code this} builder for chained invocation
     */
    public final Builder display(java.lang.String display) {
      checkNotIsSet(displayIsSet(), "display");
      this.display = java.util.Objects.requireNonNull(display, "display");
      optBits |= OPT_BIT_DISPLAY;
      return this;
    }

    /**
     * Initializes the optional value {@link Reference#display() display} to display.
     * @param display The value for display
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("display")
    public final Builder display(java.util.Optional<java.lang.String> display) {
      checkNotIsSet(displayIsSet(), "display");
      this.display = display.orElse(null);
      optBits |= OPT_BIT_DISPLAY;
      return this;
    }

    /**
     * Initializes the optional value {@link Reference#reference() reference} to reference.
     * @param reference The value for reference
     * @return {@code this} builder for chained invocation
     */
    public final Builder reference(java.lang.String reference) {
      checkNotIsSet(referenceIsSet(), "reference");
      this.reference = java.util.Objects.requireNonNull(reference, "reference");
      optBits |= OPT_BIT_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Reference#reference() reference} to reference.
     * @param reference The value for reference
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("reference")
    public final Builder reference(java.util.Optional<java.lang.String> reference) {
      checkNotIsSet(referenceIsSet(), "reference");
      this.reference = reference.orElse(null);
      optBits |= OPT_BIT_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Reference#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    public final Builder identifier(com.fhir.Identifier identifier) {
      checkNotIsSet(identifierIsSet(), "identifier");
      this.identifier = java.util.Objects.requireNonNull(identifier, "identifier");
      optBits |= OPT_BIT_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link Reference#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    public final Builder identifier(java.util.Optional<? extends com.fhir.Identifier> identifier) {
      checkNotIsSet(identifierIsSet(), "identifier");
      this.identifier = identifier.orElse(null);
      optBits |= OPT_BIT_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link Reference#resource() resource} to resource.
     * @param resource The value for resource
     * @return {@code this} builder for chained invocation
     */
    public final Builder resource(com.fhir.ResourceList resource) {
      checkNotIsSet(resourceIsSet(), "resource");
      this.resource = java.util.Objects.requireNonNull(resource, "resource");
      optBits |= OPT_BIT_RESOURCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Reference#resource() resource} to resource.
     * @param resource The value for resource
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resource")
    public final Builder resource(java.util.Optional<? extends com.fhir.ResourceList> resource) {
      checkNotIsSet(resourceIsSet(), "resource");
      this.resource = resource.orElse(null);
      optBits |= OPT_BIT_RESOURCE;
      return this;
    }

    /**
     * Builds a new {@link Reference Reference}.
     * @return An immutable instance of Reference
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.Reference build() {
      return new ImmutableReference(id, extension, type, display, reference, identifier, resource);
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean displayIsSet() {
      return (optBits & OPT_BIT_DISPLAY) != 0;
    }

    private boolean referenceIsSet() {
      return (optBits & OPT_BIT_REFERENCE) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean resourceIsSet() {
      return (optBits & OPT_BIT_RESOURCE) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of Reference is strict, attribute is already set: ".concat(name));
    }
  }
}
