package com.fhir.types.fhir;

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
 * Immutable implementation of {@link Linkage_Item}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableLinkage_Item.builder()}.
 */
@Generated(from = "Linkage_Item", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableLinkage_Item implements Linkage_Item {
  private final @Nullable Linkage_ItemType type;
  private final @Nullable List<Extension> extension;
  private final Reference resource;
  private final @Nullable String id;
  private final @Nullable List<Extension> modifierExtension;

  private ImmutableLinkage_Item(
      @Nullable Linkage_ItemType type,
      @Nullable List<Extension> extension,
      Reference resource,
      @Nullable String id,
      @Nullable List<Extension> modifierExtension) {
    this.type = type;
    this.extension = extension;
    this.resource = resource;
    this.id = id;
    this.modifierExtension = modifierExtension;
  }

  /**
   * @return The value of the {@code type} attribute
   */
  @JsonProperty("type")
  @Override
  public Optional<Linkage_ItemType> type() {
    return Optional.ofNullable(type);
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
  public Reference resource() {
    return resource;
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Linkage_Item#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLinkage_Item withType(Linkage_ItemType value) {
    @Nullable Linkage_ItemType newValue = Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableLinkage_Item(newValue, this.extension, this.resource, this.id, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Linkage_Item#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableLinkage_Item withType(Optional<? extends Linkage_ItemType> optional) {
    @Nullable Linkage_ItemType value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableLinkage_Item(value, this.extension, this.resource, this.id, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Linkage_Item#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLinkage_Item withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableLinkage_Item(this.type, newValue, this.resource, this.id, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Linkage_Item#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableLinkage_Item withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableLinkage_Item(this.type, value, this.resource, this.id, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Linkage_Item#resource() resource} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resource
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableLinkage_Item withResource(Reference value) {
    if (this.resource == value) return this;
    Reference newValue = Objects.requireNonNull(value, "resource");
    return new ImmutableLinkage_Item(this.type, this.extension, newValue, this.id, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Linkage_Item#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLinkage_Item withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableLinkage_Item(this.type, this.extension, this.resource, newValue, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Linkage_Item#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLinkage_Item withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableLinkage_Item(this.type, this.extension, this.resource, value, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Linkage_Item#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableLinkage_Item withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableLinkage_Item(this.type, this.extension, this.resource, this.id, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Linkage_Item#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableLinkage_Item withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableLinkage_Item(this.type, this.extension, this.resource, this.id, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableLinkage_Item} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableLinkage_Item
        && equalTo((ImmutableLinkage_Item) another);
  }

  private boolean equalTo(ImmutableLinkage_Item another) {
    return Objects.equals(type, another.type)
        && Objects.equals(extension, another.extension)
        && resource.equals(another.resource)
        && Objects.equals(id, another.id)
        && Objects.equals(modifierExtension, another.modifierExtension);
  }

  /**
   * Computes a hash code from attributes: {@code type}, {@code extension}, {@code resource}, {@code id}, {@code modifierExtension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(type);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + resource.hashCode();
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    return h;
  }

  /**
   * Prints the immutable value {@code Linkage_Item} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Linkage_Item{");
    if (type != null) {
      builder.append("type=").append(type);
    }
    if (extension != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (builder.length() > 13) builder.append(", ");
    builder.append("resource=").append(resource);
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
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
  @Generated(from = "Linkage_Item", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Linkage_Item {
    @Nullable Optional<Linkage_ItemType> type = Optional.empty();
    boolean typeIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Reference resource;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @JsonProperty("type")
    public void setType(Optional<Linkage_ItemType> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("resource")
    public void setResource(Reference resource) {
      this.resource = resource;
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
    @Override
    public Optional<Linkage_ItemType> type() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Reference resource() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
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
  static ImmutableLinkage_Item fromJson(Json json) {
    ImmutableLinkage_Item.Builder builder = ((ImmutableLinkage_Item.Builder) ImmutableLinkage_Item.builder());
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.resource != null) {
      builder.resource(json.resource);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    return (ImmutableLinkage_Item) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Linkage_Item} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Linkage_Item instance
   */
  public static Linkage_Item copyOf(Linkage_Item instance) {
    if (instance instanceof ImmutableLinkage_Item) {
      return (ImmutableLinkage_Item) instance;
    }
    return ((ImmutableLinkage_Item.Builder) ImmutableLinkage_Item.builder())
        .type(instance.type())
        .extension(instance.extension())
        .resource(instance.resource())
        .id(instance.id())
        .modifierExtension(instance.modifierExtension())
        .build();
  }

  /**
   * Creates a builder for {@link Linkage_Item Linkage_Item}.
   * <pre>
   * ImmutableLinkage_Item.builder()
   *    .type(Linkage_ItemType) // optional {@link Linkage_Item#type() type}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link Linkage_Item#extension() extension}
   *    .resource(com.fhir.types.fhir.Reference) // required {@link Linkage_Item#resource() resource}
   *    .id(String) // optional {@link Linkage_Item#id() id}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link Linkage_Item#modifierExtension() modifierExtension}
   *    .build();
   * </pre>
   * @return A new Linkage_Item builder
   */
  public static ResourceBuildStage builder() {
    return new ImmutableLinkage_Item.Builder();
  }

  /**
   * Builds instances of type {@link Linkage_Item Linkage_Item}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Linkage_Item", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements ResourceBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE = 0x1L;
    private static final long OPT_BIT_TYPE = 0x1L;
    private static final long OPT_BIT_EXTENSION = 0x2L;
    private static final long OPT_BIT_ID = 0x4L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x8L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable Linkage_ItemType type;
    private @Nullable List<Extension> extension;
    private @Nullable Reference resource;
    private @Nullable String id;
    private @Nullable List<Extension> modifierExtension;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Linkage_Item#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    public final Builder type(Linkage_ItemType type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = Objects.requireNonNull(type, "type");
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Linkage_Item#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("type")
    public final Builder type(Optional<? extends Linkage_ItemType> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = type.orElse(null);
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Linkage_Item#extension() extension} to extension.
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
     * Initializes the optional value {@link Linkage_Item#extension() extension} to extension.
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
     * Initializes the value for the {@link Linkage_Item#resource() resource} attribute.
     * @param resource The value for resource 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("resource")
    public final Builder resource(Reference resource) {
      checkNotIsSet(resourceIsSet(), "resource");
      this.resource = Objects.requireNonNull(resource, "resource");
      initBits &= ~INIT_BIT_RESOURCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Linkage_Item#id() id} to id.
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
     * Initializes the optional value {@link Linkage_Item#id() id} to id.
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
     * Initializes the optional value {@link Linkage_Item#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Linkage_Item#modifierExtension() modifierExtension} to modifierExtension.
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
     * Builds a new {@link Linkage_Item Linkage_Item}.
     * @return An immutable instance of Linkage_Item
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Linkage_Item build() {
      checkRequiredAttributes();
      return new ImmutableLinkage_Item(type, extension, resource, id, modifierExtension);
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean resourceIsSet() {
      return (initBits & INIT_BIT_RESOURCE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Linkage_Item is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!resourceIsSet()) attributes.add("resource");
      return "Cannot build Linkage_Item, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "Linkage_Item", generator = "Immutables")
  public interface ResourceBuildStage {
    /**
     * Initializes the value for the {@link Linkage_Item#resource() resource} attribute.
     * @param resource The value for resource 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resource(Reference resource);
  }

  @Generated(from = "Linkage_Item", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link Linkage_Item#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    BuildFinal type(Linkage_ItemType type);

    /**
     * Initializes the optional value {@link Linkage_Item#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal type(Optional<? extends Linkage_ItemType> type);

    /**
     * Initializes the optional value {@link Linkage_Item#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link Linkage_Item#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link Linkage_Item#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(String id);

    /**
     * Initializes the optional value {@link Linkage_Item#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<String> id);

    /**
     * Initializes the optional value {@link Linkage_Item#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link Linkage_Item#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Builds a new {@link Linkage_Item Linkage_Item}.
     * @return An immutable instance of Linkage_Item
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    Linkage_Item build();
  }
}
