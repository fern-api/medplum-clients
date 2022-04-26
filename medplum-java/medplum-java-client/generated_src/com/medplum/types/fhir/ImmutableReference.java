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
 * Immutable implementation of {@link Reference}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableReference.builder()}.
 */
@Generated(from = "Reference", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableReference implements Reference {
  private final @Nullable Uri type;
  private final @Nullable Identifier identifier;
  private final @Nullable String display;
  private final @Nullable List<Extension> extension;
  private final @Nullable ResourceList resource;
  private final @Nullable String id;
  private final @Nullable String reference;

  private ImmutableReference(
      @Nullable Uri type,
      @Nullable Identifier identifier,
      @Nullable String display,
      @Nullable List<Extension> extension,
      @Nullable ResourceList resource,
      @Nullable String id,
      @Nullable String reference) {
    this.type = type;
    this.identifier = identifier;
    this.display = display;
    this.extension = extension;
    this.resource = resource;
    this.id = id;
    this.reference = reference;
  }

  /**
   * @return The value of the {@code type} attribute
   */
  @JsonProperty("type")
  @Override
  public Optional<Uri> type() {
    return Optional.ofNullable(type);
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
   * @return The value of the {@code display} attribute
   */
  @JsonProperty("display")
  @Override
  public Optional<String> display() {
    return Optional.ofNullable(display);
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
   * @return The value of the {@code resource} attribute
   */
  @JsonProperty("resource")
  @Override
  public Optional<ResourceList> resource() {
    return Optional.ofNullable(resource);
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
   * @return The value of the {@code reference} attribute
   */
  @JsonProperty("reference")
  @Override
  public Optional<String> reference() {
    return Optional.ofNullable(reference);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Reference#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableReference withType(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableReference(newValue, this.identifier, this.display, this.extension, this.resource, this.id, this.reference);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Reference#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableReference withType(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableReference(value, this.identifier, this.display, this.extension, this.resource, this.id, this.reference);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Reference#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableReference withIdentifier(Identifier value) {
    @Nullable Identifier newValue = Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableReference(this.type, newValue, this.display, this.extension, this.resource, this.id, this.reference);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Reference#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableReference withIdentifier(Optional<? extends Identifier> optional) {
    @Nullable Identifier value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableReference(this.type, value, this.display, this.extension, this.resource, this.id, this.reference);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Reference#display() display} attribute.
   * @param value The value for display
   * @return A modified copy of {@code this} object
   */
  public final ImmutableReference withDisplay(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "display");
    if (Objects.equals(this.display, newValue)) return this;
    return new ImmutableReference(this.type, this.identifier, newValue, this.extension, this.resource, this.id, this.reference);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Reference#display() display} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for display
   * @return A modified copy of {@code this} object
   */
  public final ImmutableReference withDisplay(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.display, value)) return this;
    return new ImmutableReference(this.type, this.identifier, value, this.extension, this.resource, this.id, this.reference);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Reference#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableReference withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableReference(this.type, this.identifier, this.display, newValue, this.resource, this.id, this.reference);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Reference#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableReference withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableReference(this.type, this.identifier, this.display, value, this.resource, this.id, this.reference);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Reference#resource() resource} attribute.
   * @param value The value for resource
   * @return A modified copy of {@code this} object
   */
  public final ImmutableReference withResource(ResourceList value) {
    @Nullable ResourceList newValue = Objects.requireNonNull(value, "resource");
    if (this.resource == newValue) return this;
    return new ImmutableReference(this.type, this.identifier, this.display, this.extension, newValue, this.id, this.reference);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Reference#resource() resource} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for resource
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableReference withResource(Optional<? extends ResourceList> optional) {
    @Nullable ResourceList value = optional.orElse(null);
    if (this.resource == value) return this;
    return new ImmutableReference(this.type, this.identifier, this.display, this.extension, value, this.id, this.reference);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Reference#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableReference withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableReference(
        this.type,
        this.identifier,
        this.display,
        this.extension,
        this.resource,
        newValue,
        this.reference);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Reference#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableReference withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableReference(this.type, this.identifier, this.display, this.extension, this.resource, value, this.reference);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Reference#reference() reference} attribute.
   * @param value The value for reference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableReference withReference(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "reference");
    if (Objects.equals(this.reference, newValue)) return this;
    return new ImmutableReference(this.type, this.identifier, this.display, this.extension, this.resource, this.id, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Reference#reference() reference} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableReference withReference(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.reference, value)) return this;
    return new ImmutableReference(this.type, this.identifier, this.display, this.extension, this.resource, this.id, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableReference} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableReference
        && equalTo((ImmutableReference) another);
  }

  private boolean equalTo(ImmutableReference another) {
    return Objects.equals(type, another.type)
        && Objects.equals(identifier, another.identifier)
        && Objects.equals(display, another.display)
        && Objects.equals(extension, another.extension)
        && Objects.equals(resource, another.resource)
        && Objects.equals(id, another.id)
        && Objects.equals(reference, another.reference);
  }

  /**
   * Computes a hash code from attributes: {@code type}, {@code identifier}, {@code display}, {@code extension}, {@code resource}, {@code id}, {@code reference}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(type);
    h += (h << 5) + Objects.hashCode(identifier);
    h += (h << 5) + Objects.hashCode(display);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(resource);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(reference);
    return h;
  }

  /**
   * Prints the immutable value {@code Reference} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Reference{");
    if (type != null) {
      builder.append("type=").append(type);
    }
    if (identifier != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (display != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("display=").append(display);
    }
    if (extension != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (resource != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("resource=").append(resource);
    }
    if (id != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (reference != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("reference=").append(reference);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "Reference", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Reference {
    @Nullable Optional<Uri> type = Optional.empty();
    boolean typeIsSet;
    @Nullable Optional<Identifier> identifier = Optional.empty();
    boolean identifierIsSet;
    @Nullable Optional<String> display = Optional.empty();
    boolean displayIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<ResourceList> resource = Optional.empty();
    boolean resourceIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<String> reference = Optional.empty();
    boolean referenceIsSet;
    @JsonProperty("type")
    public void setType(Optional<Uri> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @JsonProperty("identifier")
    public void setIdentifier(Optional<Identifier> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @JsonProperty("display")
    public void setDisplay(Optional<String> display) {
      this.display = display;
      this.displayIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("resource")
    public void setResource(Optional<ResourceList> resource) {
      this.resource = resource;
      this.resourceIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("reference")
    public void setReference(Optional<String> reference) {
      this.reference = reference;
      this.referenceIsSet = true;
    }
    @Override
    public Optional<Uri> type() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Identifier> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> display() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<ResourceList> resource() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> reference() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableReference fromJson(Json json) {
    ImmutableReference.Builder builder = ImmutableReference.builder();
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.displayIsSet) {
      builder.display(json.display);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.resourceIsSet) {
      builder.resource(json.resource);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.referenceIsSet) {
      builder.reference(json.reference);
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
        .type(instance.type())
        .identifier(instance.identifier())
        .display(instance.display())
        .extension(instance.extension())
        .resource(instance.resource())
        .id(instance.id())
        .reference(instance.reference())
        .build();
  }

  /**
   * Creates a builder for {@link Reference Reference}.
   * <pre>
   * ImmutableReference.builder()
   *    .type(com.medplum.types.fhir.Uri) // optional {@link Reference#type() type}
   *    .identifier(com.medplum.types.fhir.Identifier) // optional {@link Reference#identifier() identifier}
   *    .display(String) // optional {@link Reference#display() display}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link Reference#extension() extension}
   *    .resource(com.medplum.types.fhir.ResourceList) // optional {@link Reference#resource() resource}
   *    .id(String) // optional {@link Reference#id() id}
   *    .reference(String) // optional {@link Reference#reference() reference}
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
  @Generated(from = "Reference", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_TYPE = 0x1L;
    private static final long OPT_BIT_IDENTIFIER = 0x2L;
    private static final long OPT_BIT_DISPLAY = 0x4L;
    private static final long OPT_BIT_EXTENSION = 0x8L;
    private static final long OPT_BIT_RESOURCE = 0x10L;
    private static final long OPT_BIT_ID = 0x20L;
    private static final long OPT_BIT_REFERENCE = 0x40L;
    private long optBits;

    private @Nullable Uri type;
    private @Nullable Identifier identifier;
    private @Nullable String display;
    private @Nullable List<Extension> extension;
    private @Nullable ResourceList resource;
    private @Nullable String id;
    private @Nullable String reference;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Reference#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    public final Builder type(Uri type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = Objects.requireNonNull(type, "type");
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Reference#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("type")
    public final Builder type(Optional<? extends Uri> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = type.orElse(null);
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Reference#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link Reference#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link Reference#display() display} to display.
     * @param display The value for display
     * @return {@code this} builder for chained invocation
     */
    public final Builder display(String display) {
      checkNotIsSet(displayIsSet(), "display");
      this.display = Objects.requireNonNull(display, "display");
      optBits |= OPT_BIT_DISPLAY;
      return this;
    }

    /**
     * Initializes the optional value {@link Reference#display() display} to display.
     * @param display The value for display
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("display")
    public final Builder display(Optional<String> display) {
      checkNotIsSet(displayIsSet(), "display");
      this.display = display.orElse(null);
      optBits |= OPT_BIT_DISPLAY;
      return this;
    }

    /**
     * Initializes the optional value {@link Reference#extension() extension} to extension.
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
     * Initializes the optional value {@link Reference#extension() extension} to extension.
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
     * Initializes the optional value {@link Reference#resource() resource} to resource.
     * @param resource The value for resource
     * @return {@code this} builder for chained invocation
     */
    public final Builder resource(ResourceList resource) {
      checkNotIsSet(resourceIsSet(), "resource");
      this.resource = Objects.requireNonNull(resource, "resource");
      optBits |= OPT_BIT_RESOURCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Reference#resource() resource} to resource.
     * @param resource The value for resource
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("resource")
    public final Builder resource(Optional<? extends ResourceList> resource) {
      checkNotIsSet(resourceIsSet(), "resource");
      this.resource = resource.orElse(null);
      optBits |= OPT_BIT_RESOURCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Reference#id() id} to id.
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
     * Initializes the optional value {@link Reference#id() id} to id.
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
     * Initializes the optional value {@link Reference#reference() reference} to reference.
     * @param reference The value for reference
     * @return {@code this} builder for chained invocation
     */
    public final Builder reference(String reference) {
      checkNotIsSet(referenceIsSet(), "reference");
      this.reference = Objects.requireNonNull(reference, "reference");
      optBits |= OPT_BIT_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Reference#reference() reference} to reference.
     * @param reference The value for reference
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("reference")
    public final Builder reference(Optional<String> reference) {
      checkNotIsSet(referenceIsSet(), "reference");
      this.reference = reference.orElse(null);
      optBits |= OPT_BIT_REFERENCE;
      return this;
    }

    /**
     * Builds a new {@link Reference Reference}.
     * @return An immutable instance of Reference
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Reference build() {
      return new ImmutableReference(type, identifier, display, extension, resource, id, reference);
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean displayIsSet() {
      return (optBits & OPT_BIT_DISPLAY) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean resourceIsSet() {
      return (optBits & OPT_BIT_RESOURCE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean referenceIsSet() {
      return (optBits & OPT_BIT_REFERENCE) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Reference is strict, attribute is already set: ".concat(name));
    }
  }
}
