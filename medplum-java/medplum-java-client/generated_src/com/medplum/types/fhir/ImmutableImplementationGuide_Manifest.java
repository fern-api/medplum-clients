package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link ImplementationGuide_Manifest}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableImplementationGuide_Manifest.builder()}.
 */
@Generated(from = "ImplementationGuide_Manifest", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableImplementationGuide_Manifest
    implements ImplementationGuide_Manifest {
  private final @Nullable List<Extension> extension;
  private final @Nullable List<ImplementationGuide_Page1> page;
  private final @Nullable String id;
  private final @Nullable List<Extension> modifierExtension;
  private final List<ImplementationGuide_Resource1> resource;
  private final @Nullable List<String> image;
  private final @Nullable List<String> other;
  private final @Nullable Url rendering;

  private ImmutableImplementationGuide_Manifest(
      @Nullable List<Extension> extension,
      @Nullable List<ImplementationGuide_Page1> page,
      @Nullable String id,
      @Nullable List<Extension> modifierExtension,
      List<ImplementationGuide_Resource1> resource,
      @Nullable List<String> image,
      @Nullable List<String> other,
      @Nullable Url rendering) {
    this.extension = extension;
    this.page = page;
    this.id = id;
    this.modifierExtension = modifierExtension;
    this.resource = resource;
    this.image = image;
    this.other = other;
    this.rendering = rendering;
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
   * @return The value of the {@code page} attribute
   */
  @JsonProperty("page")
  @Override
  public Optional<List<ImplementationGuide_Page1>> page() {
    return Optional.ofNullable(page);
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
   * @return The value of the {@code resource} attribute
   */
  @JsonProperty("resource")
  @Override
  public List<ImplementationGuide_Resource1> resource() {
    return resource;
  }

  /**
   * @return The value of the {@code image} attribute
   */
  @JsonProperty("image")
  @Override
  public Optional<List<String>> image() {
    return Optional.ofNullable(image);
  }

  /**
   * @return The value of the {@code other} attribute
   */
  @JsonProperty("other")
  @Override
  public Optional<List<String>> other() {
    return Optional.ofNullable(other);
  }

  /**
   * @return The value of the {@code rendering} attribute
   */
  @JsonProperty("rendering")
  @Override
  public Optional<Url> rendering() {
    return Optional.ofNullable(rendering);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImplementationGuide_Manifest#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide_Manifest withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableImplementationGuide_Manifest(
        newValue,
        this.page,
        this.id,
        this.modifierExtension,
        this.resource,
        this.image,
        this.other,
        this.rendering);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImplementationGuide_Manifest#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImplementationGuide_Manifest withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableImplementationGuide_Manifest(
        value,
        this.page,
        this.id,
        this.modifierExtension,
        this.resource,
        this.image,
        this.other,
        this.rendering);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImplementationGuide_Manifest#page() page} attribute.
   * @param value The value for page
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide_Manifest withPage(List<ImplementationGuide_Page1> value) {
    @Nullable List<ImplementationGuide_Page1> newValue = Objects.requireNonNull(value, "page");
    if (this.page == newValue) return this;
    return new ImmutableImplementationGuide_Manifest(
        this.extension,
        newValue,
        this.id,
        this.modifierExtension,
        this.resource,
        this.image,
        this.other,
        this.rendering);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImplementationGuide_Manifest#page() page} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for page
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImplementationGuide_Manifest withPage(Optional<? extends List<ImplementationGuide_Page1>> optional) {
    @Nullable List<ImplementationGuide_Page1> value = optional.orElse(null);
    if (this.page == value) return this;
    return new ImmutableImplementationGuide_Manifest(
        this.extension,
        value,
        this.id,
        this.modifierExtension,
        this.resource,
        this.image,
        this.other,
        this.rendering);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImplementationGuide_Manifest#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide_Manifest withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableImplementationGuide_Manifest(
        this.extension,
        this.page,
        newValue,
        this.modifierExtension,
        this.resource,
        this.image,
        this.other,
        this.rendering);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImplementationGuide_Manifest#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide_Manifest withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableImplementationGuide_Manifest(
        this.extension,
        this.page,
        value,
        this.modifierExtension,
        this.resource,
        this.image,
        this.other,
        this.rendering);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImplementationGuide_Manifest#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide_Manifest withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableImplementationGuide_Manifest(
        this.extension,
        this.page,
        this.id,
        newValue,
        this.resource,
        this.image,
        this.other,
        this.rendering);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImplementationGuide_Manifest#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImplementationGuide_Manifest withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableImplementationGuide_Manifest(
        this.extension,
        this.page,
        this.id,
        value,
        this.resource,
        this.image,
        this.other,
        this.rendering);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link ImplementationGuide_Manifest#resource() resource}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide_Manifest withResource(ImplementationGuide_Resource1... elements) {
    List<ImplementationGuide_Resource1> newValue = createUnmodifiableList(false, createSafeList(Arrays.asList(elements), true, false));
    return new ImmutableImplementationGuide_Manifest(
        this.extension,
        this.page,
        this.id,
        this.modifierExtension,
        newValue,
        this.image,
        this.other,
        this.rendering);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link ImplementationGuide_Manifest#resource() resource}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of resource elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide_Manifest withResource(Iterable<? extends ImplementationGuide_Resource1> elements) {
    if (this.resource == elements) return this;
    List<ImplementationGuide_Resource1> newValue = createUnmodifiableList(false, createSafeList(elements, true, false));
    return new ImmutableImplementationGuide_Manifest(
        this.extension,
        this.page,
        this.id,
        this.modifierExtension,
        newValue,
        this.image,
        this.other,
        this.rendering);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImplementationGuide_Manifest#image() image} attribute.
   * @param value The value for image
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide_Manifest withImage(List<String> value) {
    @Nullable List<String> newValue = Objects.requireNonNull(value, "image");
    if (this.image == newValue) return this;
    return new ImmutableImplementationGuide_Manifest(
        this.extension,
        this.page,
        this.id,
        this.modifierExtension,
        this.resource,
        newValue,
        this.other,
        this.rendering);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImplementationGuide_Manifest#image() image} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for image
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImplementationGuide_Manifest withImage(Optional<? extends List<String>> optional) {
    @Nullable List<String> value = optional.orElse(null);
    if (this.image == value) return this;
    return new ImmutableImplementationGuide_Manifest(
        this.extension,
        this.page,
        this.id,
        this.modifierExtension,
        this.resource,
        value,
        this.other,
        this.rendering);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImplementationGuide_Manifest#other() other} attribute.
   * @param value The value for other
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide_Manifest withOther(List<String> value) {
    @Nullable List<String> newValue = Objects.requireNonNull(value, "other");
    if (this.other == newValue) return this;
    return new ImmutableImplementationGuide_Manifest(
        this.extension,
        this.page,
        this.id,
        this.modifierExtension,
        this.resource,
        this.image,
        newValue,
        this.rendering);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImplementationGuide_Manifest#other() other} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for other
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImplementationGuide_Manifest withOther(Optional<? extends List<String>> optional) {
    @Nullable List<String> value = optional.orElse(null);
    if (this.other == value) return this;
    return new ImmutableImplementationGuide_Manifest(
        this.extension,
        this.page,
        this.id,
        this.modifierExtension,
        this.resource,
        this.image,
        value,
        this.rendering);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImplementationGuide_Manifest#rendering() rendering} attribute.
   * @param value The value for rendering
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide_Manifest withRendering(Url value) {
    @Nullable Url newValue = Objects.requireNonNull(value, "rendering");
    if (this.rendering == newValue) return this;
    return new ImmutableImplementationGuide_Manifest(
        this.extension,
        this.page,
        this.id,
        this.modifierExtension,
        this.resource,
        this.image,
        this.other,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImplementationGuide_Manifest#rendering() rendering} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for rendering
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImplementationGuide_Manifest withRendering(Optional<? extends Url> optional) {
    @Nullable Url value = optional.orElse(null);
    if (this.rendering == value) return this;
    return new ImmutableImplementationGuide_Manifest(
        this.extension,
        this.page,
        this.id,
        this.modifierExtension,
        this.resource,
        this.image,
        this.other,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableImplementationGuide_Manifest} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableImplementationGuide_Manifest
        && equalTo((ImmutableImplementationGuide_Manifest) another);
  }

  private boolean equalTo(ImmutableImplementationGuide_Manifest another) {
    return Objects.equals(extension, another.extension)
        && Objects.equals(page, another.page)
        && Objects.equals(id, another.id)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && resource.equals(another.resource)
        && Objects.equals(image, another.image)
        && Objects.equals(other, another.other)
        && Objects.equals(rendering, another.rendering);
  }

  /**
   * Computes a hash code from attributes: {@code extension}, {@code page}, {@code id}, {@code modifierExtension}, {@code resource}, {@code image}, {@code other}, {@code rendering}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(page);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + resource.hashCode();
    h += (h << 5) + Objects.hashCode(image);
    h += (h << 5) + Objects.hashCode(other);
    h += (h << 5) + Objects.hashCode(rendering);
    return h;
  }

  /**
   * Prints the immutable value {@code ImplementationGuide_Manifest} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("ImplementationGuide_Manifest{");
    if (extension != null) {
      builder.append("extension=").append(extension);
    }
    if (page != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("page=").append(page);
    }
    if (id != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (modifierExtension != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (builder.length() > 29) builder.append(", ");
    builder.append("resource=").append(resource);
    if (image != null) {
      builder.append(", ");
      builder.append("image=").append(image);
    }
    if (other != null) {
      builder.append(", ");
      builder.append("other=").append(other);
    }
    if (rendering != null) {
      builder.append(", ");
      builder.append("rendering=").append(rendering);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "ImplementationGuide_Manifest", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements ImplementationGuide_Manifest {
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<ImplementationGuide_Page1>> page = Optional.empty();
    boolean pageIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable List<ImplementationGuide_Resource1> resource = Collections.emptyList();
    @Nullable Optional<List<String>> image = Optional.empty();
    boolean imageIsSet;
    @Nullable Optional<List<String>> other = Optional.empty();
    boolean otherIsSet;
    @Nullable Optional<Url> rendering = Optional.empty();
    boolean renderingIsSet;
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("page")
    public void setPage(Optional<List<ImplementationGuide_Page1>> page) {
      this.page = page;
      this.pageIsSet = true;
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
    @JsonProperty("resource")
    public void setResource(List<ImplementationGuide_Resource1> resource) {
      this.resource = resource;
    }
    @JsonProperty("image")
    public void setImage(Optional<List<String>> image) {
      this.image = image;
      this.imageIsSet = true;
    }
    @JsonProperty("other")
    public void setOther(Optional<List<String>> other) {
      this.other = other;
      this.otherIsSet = true;
    }
    @JsonProperty("rendering")
    public void setRendering(Optional<Url> rendering) {
      this.rendering = rendering;
      this.renderingIsSet = true;
    }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ImplementationGuide_Page1>> page() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public List<ImplementationGuide_Resource1> resource() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<String>> image() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<String>> other() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Url> rendering() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableImplementationGuide_Manifest fromJson(Json json) {
    ImmutableImplementationGuide_Manifest.Builder builder = ImmutableImplementationGuide_Manifest.builder();
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.pageIsSet) {
      builder.page(json.page);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.resource != null) {
      builder.addAllResource(json.resource);
    }
    if (json.imageIsSet) {
      builder.image(json.image);
    }
    if (json.otherIsSet) {
      builder.other(json.other);
    }
    if (json.renderingIsSet) {
      builder.rendering(json.rendering);
    }
    return (ImmutableImplementationGuide_Manifest) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ImplementationGuide_Manifest} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ImplementationGuide_Manifest instance
   */
  public static ImplementationGuide_Manifest copyOf(ImplementationGuide_Manifest instance) {
    if (instance instanceof ImmutableImplementationGuide_Manifest) {
      return (ImmutableImplementationGuide_Manifest) instance;
    }
    return ImmutableImplementationGuide_Manifest.builder()
        .extension(instance.extension())
        .page(instance.page())
        .id(instance.id())
        .modifierExtension(instance.modifierExtension())
        .addAllResource(instance.resource())
        .image(instance.image())
        .other(instance.other())
        .rendering(instance.rendering())
        .build();
  }

  /**
   * Creates a builder for {@link ImplementationGuide_Manifest ImplementationGuide_Manifest}.
   * <pre>
   * ImmutableImplementationGuide_Manifest.builder()
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link ImplementationGuide_Manifest#extension() extension}
   *    .page(List&amp;lt;com.medplum.types.fhir.ImplementationGuide_Page1&amp;gt;) // optional {@link ImplementationGuide_Manifest#page() page}
   *    .id(String) // optional {@link ImplementationGuide_Manifest#id() id}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link ImplementationGuide_Manifest#modifierExtension() modifierExtension}
   *    .addResource|addAllResource(com.medplum.types.fhir.ImplementationGuide_Resource1) // {@link ImplementationGuide_Manifest#resource() resource} elements
   *    .image(List&amp;lt;String&amp;gt;) // optional {@link ImplementationGuide_Manifest#image() image}
   *    .other(List&amp;lt;String&amp;gt;) // optional {@link ImplementationGuide_Manifest#other() other}
   *    .rendering(com.medplum.types.fhir.Url) // optional {@link ImplementationGuide_Manifest#rendering() rendering}
   *    .build();
   * </pre>
   * @return A new ImplementationGuide_Manifest builder
   */
  public static ImmutableImplementationGuide_Manifest.Builder builder() {
    return new ImmutableImplementationGuide_Manifest.Builder();
  }

  /**
   * Builds instances of type {@link ImplementationGuide_Manifest ImplementationGuide_Manifest}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "ImplementationGuide_Manifest", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_EXTENSION = 0x1L;
    private static final long OPT_BIT_PAGE = 0x2L;
    private static final long OPT_BIT_ID = 0x4L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x8L;
    private static final long OPT_BIT_IMAGE = 0x10L;
    private static final long OPT_BIT_OTHER = 0x20L;
    private static final long OPT_BIT_RENDERING = 0x40L;
    private long optBits;

    private @Nullable List<Extension> extension;
    private @Nullable List<ImplementationGuide_Page1> page;
    private @Nullable String id;
    private @Nullable List<Extension> modifierExtension;
    private final List<ImplementationGuide_Resource1> resource = new ArrayList<ImplementationGuide_Resource1>();
    private @Nullable List<String> image;
    private @Nullable List<String> other;
    private @Nullable Url rendering;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link ImplementationGuide_Manifest#extension() extension} to extension.
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
     * Initializes the optional value {@link ImplementationGuide_Manifest#extension() extension} to extension.
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
     * Initializes the optional value {@link ImplementationGuide_Manifest#page() page} to page.
     * @param page The value for page
     * @return {@code this} builder for chained invocation
     */
    public final Builder page(List<ImplementationGuide_Page1> page) {
      checkNotIsSet(pageIsSet(), "page");
      this.page = Objects.requireNonNull(page, "page");
      optBits |= OPT_BIT_PAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link ImplementationGuide_Manifest#page() page} to page.
     * @param page The value for page
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("page")
    public final Builder page(Optional<? extends List<ImplementationGuide_Page1>> page) {
      checkNotIsSet(pageIsSet(), "page");
      this.page = page.orElse(null);
      optBits |= OPT_BIT_PAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link ImplementationGuide_Manifest#id() id} to id.
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
     * Initializes the optional value {@link ImplementationGuide_Manifest#id() id} to id.
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
     * Initializes the optional value {@link ImplementationGuide_Manifest#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ImplementationGuide_Manifest#modifierExtension() modifierExtension} to modifierExtension.
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
     * Adds one element to {@link ImplementationGuide_Manifest#resource() resource} list.
     * @param element A resource element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addResource(ImplementationGuide_Resource1 element) {
      this.resource.add(Objects.requireNonNull(element, "resource element"));
      return this;
    }

    /**
     * Adds elements to {@link ImplementationGuide_Manifest#resource() resource} list.
     * @param elements An array of resource elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addResource(ImplementationGuide_Resource1... elements) {
      for (ImplementationGuide_Resource1 element : elements) {
        this.resource.add(Objects.requireNonNull(element, "resource element"));
      }
      return this;
    }


    /**
     * Adds elements to {@link ImplementationGuide_Manifest#resource() resource} list.
     * @param elements An iterable of resource elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllResource(Iterable<? extends ImplementationGuide_Resource1> elements) {
      for (ImplementationGuide_Resource1 element : elements) {
        this.resource.add(Objects.requireNonNull(element, "resource element"));
      }
      return this;
    }

    /**
     * Initializes the optional value {@link ImplementationGuide_Manifest#image() image} to image.
     * @param image The value for image
     * @return {@code this} builder for chained invocation
     */
    public final Builder image(List<String> image) {
      checkNotIsSet(imageIsSet(), "image");
      this.image = Objects.requireNonNull(image, "image");
      optBits |= OPT_BIT_IMAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link ImplementationGuide_Manifest#image() image} to image.
     * @param image The value for image
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("image")
    public final Builder image(Optional<? extends List<String>> image) {
      checkNotIsSet(imageIsSet(), "image");
      this.image = image.orElse(null);
      optBits |= OPT_BIT_IMAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link ImplementationGuide_Manifest#other() other} to other.
     * @param other The value for other
     * @return {@code this} builder for chained invocation
     */
    public final Builder other(List<String> other) {
      checkNotIsSet(otherIsSet(), "other");
      this.other = Objects.requireNonNull(other, "other");
      optBits |= OPT_BIT_OTHER;
      return this;
    }

    /**
     * Initializes the optional value {@link ImplementationGuide_Manifest#other() other} to other.
     * @param other The value for other
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("other")
    public final Builder other(Optional<? extends List<String>> other) {
      checkNotIsSet(otherIsSet(), "other");
      this.other = other.orElse(null);
      optBits |= OPT_BIT_OTHER;
      return this;
    }

    /**
     * Initializes the optional value {@link ImplementationGuide_Manifest#rendering() rendering} to rendering.
     * @param rendering The value for rendering
     * @return {@code this} builder for chained invocation
     */
    public final Builder rendering(Url rendering) {
      checkNotIsSet(renderingIsSet(), "rendering");
      this.rendering = Objects.requireNonNull(rendering, "rendering");
      optBits |= OPT_BIT_RENDERING;
      return this;
    }

    /**
     * Initializes the optional value {@link ImplementationGuide_Manifest#rendering() rendering} to rendering.
     * @param rendering The value for rendering
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("rendering")
    public final Builder rendering(Optional<? extends Url> rendering) {
      checkNotIsSet(renderingIsSet(), "rendering");
      this.rendering = rendering.orElse(null);
      optBits |= OPT_BIT_RENDERING;
      return this;
    }

    /**
     * Builds a new {@link ImplementationGuide_Manifest ImplementationGuide_Manifest}.
     * @return An immutable instance of ImplementationGuide_Manifest
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImplementationGuide_Manifest build() {
      return new ImmutableImplementationGuide_Manifest(
          extension,
          page,
          id,
          modifierExtension,
          createUnmodifiableList(true, resource),
          image,
          other,
          rendering);
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean pageIsSet() {
      return (optBits & OPT_BIT_PAGE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean imageIsSet() {
      return (optBits & OPT_BIT_IMAGE) != 0;
    }

    private boolean otherIsSet() {
      return (optBits & OPT_BIT_OTHER) != 0;
    }

    private boolean renderingIsSet() {
      return (optBits & OPT_BIT_RENDERING) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of ImplementationGuide_Manifest is strict, attribute is already set: ".concat(name));
    }
  }

  private static <T> List<T> createSafeList(Iterable<? extends T> iterable, boolean checkNulls, boolean skipNulls) {
    ArrayList<T> list;
    if (iterable instanceof Collection<?>) {
      int size = ((Collection<?>) iterable).size();
      if (size == 0) return Collections.emptyList();
      list = new ArrayList<>();
    } else {
      list = new ArrayList<>();
    }
    for (T element : iterable) {
      if (skipNulls && element == null) continue;
      if (checkNulls) Objects.requireNonNull(element, "element");
      list.add(element);
    }
    return list;
  }

  private static <T> List<T> createUnmodifiableList(boolean clone, List<T> list) {
    switch(list.size()) {
    case 0: return Collections.emptyList();
    case 1: return Collections.singletonList(list.get(0));
    default:
      if (clone) {
        return Collections.unmodifiableList(new ArrayList<>(list));
      } else {
        if (list instanceof ArrayList<?>) {
          ((ArrayList<?>) list).trimToSize();
        }
        return Collections.unmodifiableList(list);
      }
    }
  }
}
