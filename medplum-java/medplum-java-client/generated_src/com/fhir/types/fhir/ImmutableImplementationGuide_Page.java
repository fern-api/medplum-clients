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
 * Immutable implementation of {@link ImplementationGuide_Page}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableImplementationGuide_Page.builder()}.
 */
@Generated(from = "ImplementationGuide_Page", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableImplementationGuide_Page implements ImplementationGuide_Page {
  private final @Nullable String id;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable List<Extension> extension;
  private final @Nullable String nameUrl;
  private final @Nullable List<ImplementationGuide_Page> page;
  private final @Nullable String title;
  private final @Nullable Reference nameReference;
  private final @Nullable Implementationguide_PageGeneration generation;

  private ImmutableImplementationGuide_Page(
      @Nullable String id,
      @Nullable List<Extension> modifierExtension,
      @Nullable List<Extension> extension,
      @Nullable String nameUrl,
      @Nullable List<ImplementationGuide_Page> page,
      @Nullable String title,
      @Nullable Reference nameReference,
      @Nullable Implementationguide_PageGeneration generation) {
    this.id = id;
    this.modifierExtension = modifierExtension;
    this.extension = extension;
    this.nameUrl = nameUrl;
    this.page = page;
    this.title = title;
    this.nameReference = nameReference;
    this.generation = generation;
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
   * @return The value of the {@code extension} attribute
   */
  @JsonProperty("extension")
  @Override
  public Optional<List<Extension>> extension() {
    return Optional.ofNullable(extension);
  }

  /**
   * @return The value of the {@code nameUrl} attribute
   */
  @JsonProperty("nameUrl")
  @Override
  public Optional<String> nameUrl() {
    return Optional.ofNullable(nameUrl);
  }

  /**
   * @return The value of the {@code page} attribute
   */
  @JsonProperty("page")
  @Override
  public Optional<List<ImplementationGuide_Page>> page() {
    return Optional.ofNullable(page);
  }

  /**
   * @return The value of the {@code title} attribute
   */
  @JsonProperty("title")
  @Override
  public Optional<String> title() {
    return Optional.ofNullable(title);
  }

  /**
   * @return The value of the {@code nameReference} attribute
   */
  @JsonProperty("nameReference")
  @Override
  public Optional<Reference> nameReference() {
    return Optional.ofNullable(nameReference);
  }

  /**
   * @return The value of the {@code generation} attribute
   */
  @JsonProperty("generation")
  @Override
  public Optional<Implementationguide_PageGeneration> generation() {
    return Optional.ofNullable(generation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImplementationGuide_Page#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide_Page withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableImplementationGuide_Page(
        newValue,
        this.modifierExtension,
        this.extension,
        this.nameUrl,
        this.page,
        this.title,
        this.nameReference,
        this.generation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImplementationGuide_Page#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide_Page withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableImplementationGuide_Page(
        value,
        this.modifierExtension,
        this.extension,
        this.nameUrl,
        this.page,
        this.title,
        this.nameReference,
        this.generation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImplementationGuide_Page#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide_Page withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableImplementationGuide_Page(
        this.id,
        newValue,
        this.extension,
        this.nameUrl,
        this.page,
        this.title,
        this.nameReference,
        this.generation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImplementationGuide_Page#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImplementationGuide_Page withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableImplementationGuide_Page(
        this.id,
        value,
        this.extension,
        this.nameUrl,
        this.page,
        this.title,
        this.nameReference,
        this.generation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImplementationGuide_Page#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide_Page withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableImplementationGuide_Page(
        this.id,
        this.modifierExtension,
        newValue,
        this.nameUrl,
        this.page,
        this.title,
        this.nameReference,
        this.generation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImplementationGuide_Page#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImplementationGuide_Page withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableImplementationGuide_Page(
        this.id,
        this.modifierExtension,
        value,
        this.nameUrl,
        this.page,
        this.title,
        this.nameReference,
        this.generation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImplementationGuide_Page#nameUrl() nameUrl} attribute.
   * @param value The value for nameUrl
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide_Page withNameUrl(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "nameUrl");
    if (Objects.equals(this.nameUrl, newValue)) return this;
    return new ImmutableImplementationGuide_Page(
        this.id,
        this.modifierExtension,
        this.extension,
        newValue,
        this.page,
        this.title,
        this.nameReference,
        this.generation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImplementationGuide_Page#nameUrl() nameUrl} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for nameUrl
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide_Page withNameUrl(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.nameUrl, value)) return this;
    return new ImmutableImplementationGuide_Page(
        this.id,
        this.modifierExtension,
        this.extension,
        value,
        this.page,
        this.title,
        this.nameReference,
        this.generation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImplementationGuide_Page#page() page} attribute.
   * @param value The value for page
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide_Page withPage(List<ImplementationGuide_Page> value) {
    @Nullable List<ImplementationGuide_Page> newValue = Objects.requireNonNull(value, "page");
    if (this.page == newValue) return this;
    return new ImmutableImplementationGuide_Page(
        this.id,
        this.modifierExtension,
        this.extension,
        this.nameUrl,
        newValue,
        this.title,
        this.nameReference,
        this.generation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImplementationGuide_Page#page() page} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for page
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImplementationGuide_Page withPage(Optional<? extends List<ImplementationGuide_Page>> optional) {
    @Nullable List<ImplementationGuide_Page> value = optional.orElse(null);
    if (this.page == value) return this;
    return new ImmutableImplementationGuide_Page(
        this.id,
        this.modifierExtension,
        this.extension,
        this.nameUrl,
        value,
        this.title,
        this.nameReference,
        this.generation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImplementationGuide_Page#title() title} attribute.
   * @param value The value for title
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide_Page withTitle(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "title");
    if (Objects.equals(this.title, newValue)) return this;
    return new ImmutableImplementationGuide_Page(
        this.id,
        this.modifierExtension,
        this.extension,
        this.nameUrl,
        this.page,
        newValue,
        this.nameReference,
        this.generation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImplementationGuide_Page#title() title} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for title
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide_Page withTitle(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.title, value)) return this;
    return new ImmutableImplementationGuide_Page(
        this.id,
        this.modifierExtension,
        this.extension,
        this.nameUrl,
        this.page,
        value,
        this.nameReference,
        this.generation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImplementationGuide_Page#nameReference() nameReference} attribute.
   * @param value The value for nameReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide_Page withNameReference(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "nameReference");
    if (this.nameReference == newValue) return this;
    return new ImmutableImplementationGuide_Page(
        this.id,
        this.modifierExtension,
        this.extension,
        this.nameUrl,
        this.page,
        this.title,
        newValue,
        this.generation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImplementationGuide_Page#nameReference() nameReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for nameReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImplementationGuide_Page withNameReference(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.nameReference == value) return this;
    return new ImmutableImplementationGuide_Page(
        this.id,
        this.modifierExtension,
        this.extension,
        this.nameUrl,
        this.page,
        this.title,
        value,
        this.generation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImplementationGuide_Page#generation() generation} attribute.
   * @param value The value for generation
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide_Page withGeneration(Implementationguide_PageGeneration value) {
    @Nullable Implementationguide_PageGeneration newValue = Objects.requireNonNull(value, "generation");
    if (this.generation == newValue) return this;
    return new ImmutableImplementationGuide_Page(
        this.id,
        this.modifierExtension,
        this.extension,
        this.nameUrl,
        this.page,
        this.title,
        this.nameReference,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImplementationGuide_Page#generation() generation} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for generation
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImplementationGuide_Page withGeneration(Optional<? extends Implementationguide_PageGeneration> optional) {
    @Nullable Implementationguide_PageGeneration value = optional.orElse(null);
    if (this.generation == value) return this;
    return new ImmutableImplementationGuide_Page(
        this.id,
        this.modifierExtension,
        this.extension,
        this.nameUrl,
        this.page,
        this.title,
        this.nameReference,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableImplementationGuide_Page} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableImplementationGuide_Page
        && equalTo((ImmutableImplementationGuide_Page) another);
  }

  private boolean equalTo(ImmutableImplementationGuide_Page another) {
    return Objects.equals(id, another.id)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(extension, another.extension)
        && Objects.equals(nameUrl, another.nameUrl)
        && Objects.equals(page, another.page)
        && Objects.equals(title, another.title)
        && Objects.equals(nameReference, another.nameReference)
        && Objects.equals(generation, another.generation);
  }

  /**
   * Computes a hash code from attributes: {@code id}, {@code modifierExtension}, {@code extension}, {@code nameUrl}, {@code page}, {@code title}, {@code nameReference}, {@code generation}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(nameUrl);
    h += (h << 5) + Objects.hashCode(page);
    h += (h << 5) + Objects.hashCode(title);
    h += (h << 5) + Objects.hashCode(nameReference);
    h += (h << 5) + Objects.hashCode(generation);
    return h;
  }

  /**
   * Prints the immutable value {@code ImplementationGuide_Page} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("ImplementationGuide_Page{");
    if (id != null) {
      builder.append("id=").append(id);
    }
    if (modifierExtension != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (extension != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (nameUrl != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("nameUrl=").append(nameUrl);
    }
    if (page != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("page=").append(page);
    }
    if (title != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("title=").append(title);
    }
    if (nameReference != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("nameReference=").append(nameReference);
    }
    if (generation != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("generation=").append(generation);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "ImplementationGuide_Page", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements ImplementationGuide_Page {
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<String> nameUrl = Optional.empty();
    boolean nameUrlIsSet;
    @Nullable Optional<List<ImplementationGuide_Page>> page = Optional.empty();
    boolean pageIsSet;
    @Nullable Optional<String> title = Optional.empty();
    boolean titleIsSet;
    @Nullable Optional<Reference> nameReference = Optional.empty();
    boolean nameReferenceIsSet;
    @Nullable Optional<Implementationguide_PageGeneration> generation = Optional.empty();
    boolean generationIsSet;
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
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("nameUrl")
    public void setNameUrl(Optional<String> nameUrl) {
      this.nameUrl = nameUrl;
      this.nameUrlIsSet = true;
    }
    @JsonProperty("page")
    public void setPage(Optional<List<ImplementationGuide_Page>> page) {
      this.page = page;
      this.pageIsSet = true;
    }
    @JsonProperty("title")
    public void setTitle(Optional<String> title) {
      this.title = title;
      this.titleIsSet = true;
    }
    @JsonProperty("nameReference")
    public void setNameReference(Optional<Reference> nameReference) {
      this.nameReference = nameReference;
      this.nameReferenceIsSet = true;
    }
    @JsonProperty("generation")
    public void setGeneration(Optional<Implementationguide_PageGeneration> generation) {
      this.generation = generation;
      this.generationIsSet = true;
    }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> nameUrl() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ImplementationGuide_Page>> page() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> title() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> nameReference() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Implementationguide_PageGeneration> generation() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableImplementationGuide_Page fromJson(Json json) {
    ImmutableImplementationGuide_Page.Builder builder = ImmutableImplementationGuide_Page.builder();
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.nameUrlIsSet) {
      builder.nameUrl(json.nameUrl);
    }
    if (json.pageIsSet) {
      builder.page(json.page);
    }
    if (json.titleIsSet) {
      builder.title(json.title);
    }
    if (json.nameReferenceIsSet) {
      builder.nameReference(json.nameReference);
    }
    if (json.generationIsSet) {
      builder.generation(json.generation);
    }
    return (ImmutableImplementationGuide_Page) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ImplementationGuide_Page} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ImplementationGuide_Page instance
   */
  public static ImplementationGuide_Page copyOf(ImplementationGuide_Page instance) {
    if (instance instanceof ImmutableImplementationGuide_Page) {
      return (ImmutableImplementationGuide_Page) instance;
    }
    return ImmutableImplementationGuide_Page.builder()
        .id(instance.id())
        .modifierExtension(instance.modifierExtension())
        .extension(instance.extension())
        .nameUrl(instance.nameUrl())
        .page(instance.page())
        .title(instance.title())
        .nameReference(instance.nameReference())
        .generation(instance.generation())
        .build();
  }

  /**
   * Creates a builder for {@link ImplementationGuide_Page ImplementationGuide_Page}.
   * <pre>
   * ImmutableImplementationGuide_Page.builder()
   *    .id(String) // optional {@link ImplementationGuide_Page#id() id}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link ImplementationGuide_Page#modifierExtension() modifierExtension}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link ImplementationGuide_Page#extension() extension}
   *    .nameUrl(String) // optional {@link ImplementationGuide_Page#nameUrl() nameUrl}
   *    .page(List&amp;lt;com.fhir.types.fhir.ImplementationGuide_Page&amp;gt;) // optional {@link ImplementationGuide_Page#page() page}
   *    .title(String) // optional {@link ImplementationGuide_Page#title() title}
   *    .nameReference(com.fhir.types.fhir.Reference) // optional {@link ImplementationGuide_Page#nameReference() nameReference}
   *    .generation(Implementationguide_PageGeneration) // optional {@link ImplementationGuide_Page#generation() generation}
   *    .build();
   * </pre>
   * @return A new ImplementationGuide_Page builder
   */
  public static ImmutableImplementationGuide_Page.Builder builder() {
    return new ImmutableImplementationGuide_Page.Builder();
  }

  /**
   * Builds instances of type {@link ImplementationGuide_Page ImplementationGuide_Page}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "ImplementationGuide_Page", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_ID = 0x1L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x2L;
    private static final long OPT_BIT_EXTENSION = 0x4L;
    private static final long OPT_BIT_NAME_URL = 0x8L;
    private static final long OPT_BIT_PAGE = 0x10L;
    private static final long OPT_BIT_TITLE = 0x20L;
    private static final long OPT_BIT_NAME_REFERENCE = 0x40L;
    private static final long OPT_BIT_GENERATION = 0x80L;
    private long optBits;

    private @Nullable String id;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable List<Extension> extension;
    private @Nullable String nameUrl;
    private @Nullable List<ImplementationGuide_Page> page;
    private @Nullable String title;
    private @Nullable Reference nameReference;
    private @Nullable Implementationguide_PageGeneration generation;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link ImplementationGuide_Page#id() id} to id.
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
     * Initializes the optional value {@link ImplementationGuide_Page#id() id} to id.
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
     * Initializes the optional value {@link ImplementationGuide_Page#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ImplementationGuide_Page#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ImplementationGuide_Page#extension() extension} to extension.
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
     * Initializes the optional value {@link ImplementationGuide_Page#extension() extension} to extension.
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
     * Initializes the optional value {@link ImplementationGuide_Page#nameUrl() nameUrl} to nameUrl.
     * @param nameUrl The value for nameUrl
     * @return {@code this} builder for chained invocation
     */
    public final Builder nameUrl(String nameUrl) {
      checkNotIsSet(nameUrlIsSet(), "nameUrl");
      this.nameUrl = Objects.requireNonNull(nameUrl, "nameUrl");
      optBits |= OPT_BIT_NAME_URL;
      return this;
    }

    /**
     * Initializes the optional value {@link ImplementationGuide_Page#nameUrl() nameUrl} to nameUrl.
     * @param nameUrl The value for nameUrl
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("nameUrl")
    public final Builder nameUrl(Optional<String> nameUrl) {
      checkNotIsSet(nameUrlIsSet(), "nameUrl");
      this.nameUrl = nameUrl.orElse(null);
      optBits |= OPT_BIT_NAME_URL;
      return this;
    }

    /**
     * Initializes the optional value {@link ImplementationGuide_Page#page() page} to page.
     * @param page The value for page
     * @return {@code this} builder for chained invocation
     */
    public final Builder page(List<ImplementationGuide_Page> page) {
      checkNotIsSet(pageIsSet(), "page");
      this.page = Objects.requireNonNull(page, "page");
      optBits |= OPT_BIT_PAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link ImplementationGuide_Page#page() page} to page.
     * @param page The value for page
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("page")
    public final Builder page(Optional<? extends List<ImplementationGuide_Page>> page) {
      checkNotIsSet(pageIsSet(), "page");
      this.page = page.orElse(null);
      optBits |= OPT_BIT_PAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link ImplementationGuide_Page#title() title} to title.
     * @param title The value for title
     * @return {@code this} builder for chained invocation
     */
    public final Builder title(String title) {
      checkNotIsSet(titleIsSet(), "title");
      this.title = Objects.requireNonNull(title, "title");
      optBits |= OPT_BIT_TITLE;
      return this;
    }

    /**
     * Initializes the optional value {@link ImplementationGuide_Page#title() title} to title.
     * @param title The value for title
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("title")
    public final Builder title(Optional<String> title) {
      checkNotIsSet(titleIsSet(), "title");
      this.title = title.orElse(null);
      optBits |= OPT_BIT_TITLE;
      return this;
    }

    /**
     * Initializes the optional value {@link ImplementationGuide_Page#nameReference() nameReference} to nameReference.
     * @param nameReference The value for nameReference
     * @return {@code this} builder for chained invocation
     */
    public final Builder nameReference(Reference nameReference) {
      checkNotIsSet(nameReferenceIsSet(), "nameReference");
      this.nameReference = Objects.requireNonNull(nameReference, "nameReference");
      optBits |= OPT_BIT_NAME_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link ImplementationGuide_Page#nameReference() nameReference} to nameReference.
     * @param nameReference The value for nameReference
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("nameReference")
    public final Builder nameReference(Optional<? extends Reference> nameReference) {
      checkNotIsSet(nameReferenceIsSet(), "nameReference");
      this.nameReference = nameReference.orElse(null);
      optBits |= OPT_BIT_NAME_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link ImplementationGuide_Page#generation() generation} to generation.
     * @param generation The value for generation
     * @return {@code this} builder for chained invocation
     */
    public final Builder generation(Implementationguide_PageGeneration generation) {
      checkNotIsSet(generationIsSet(), "generation");
      this.generation = Objects.requireNonNull(generation, "generation");
      optBits |= OPT_BIT_GENERATION;
      return this;
    }

    /**
     * Initializes the optional value {@link ImplementationGuide_Page#generation() generation} to generation.
     * @param generation The value for generation
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("generation")
    public final Builder generation(Optional<? extends Implementationguide_PageGeneration> generation) {
      checkNotIsSet(generationIsSet(), "generation");
      this.generation = generation.orElse(null);
      optBits |= OPT_BIT_GENERATION;
      return this;
    }

    /**
     * Builds a new {@link ImplementationGuide_Page ImplementationGuide_Page}.
     * @return An immutable instance of ImplementationGuide_Page
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImplementationGuide_Page build() {
      return new ImmutableImplementationGuide_Page(id, modifierExtension, extension, nameUrl, page, title, nameReference, generation);
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean nameUrlIsSet() {
      return (optBits & OPT_BIT_NAME_URL) != 0;
    }

    private boolean pageIsSet() {
      return (optBits & OPT_BIT_PAGE) != 0;
    }

    private boolean titleIsSet() {
      return (optBits & OPT_BIT_TITLE) != 0;
    }

    private boolean nameReferenceIsSet() {
      return (optBits & OPT_BIT_NAME_REFERENCE) != 0;
    }

    private boolean generationIsSet() {
      return (optBits & OPT_BIT_GENERATION) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of ImplementationGuide_Page is strict, attribute is already set: ".concat(name));
    }
  }
}
