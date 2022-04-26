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
 * Immutable implementation of {@link RelatedArtifact}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableRelatedArtifact.builder()}.
 */
@Generated(from = "RelatedArtifact", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableRelatedArtifact implements RelatedArtifact {
  private final @Nullable String id;
  private final @Nullable Attachment document;
  private final @Nullable String display;
  private final @Nullable Canonical resource;
  private final @Nullable List<Extension> extension;
  private final @Nullable String label;
  private final @Nullable RelatedartifactType type;
  private final @Nullable Markdown citation;
  private final @Nullable Url url;

  private ImmutableRelatedArtifact(
      @Nullable String id,
      @Nullable Attachment document,
      @Nullable String display,
      @Nullable Canonical resource,
      @Nullable List<Extension> extension,
      @Nullable String label,
      @Nullable RelatedartifactType type,
      @Nullable Markdown citation,
      @Nullable Url url) {
    this.id = id;
    this.document = document;
    this.display = display;
    this.resource = resource;
    this.extension = extension;
    this.label = label;
    this.type = type;
    this.citation = citation;
    this.url = url;
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
   * @return The value of the {@code document} attribute
   */
  @JsonProperty("document")
  @Override
  public Optional<Attachment> document() {
    return Optional.ofNullable(document);
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
   * @return The value of the {@code resource} attribute
   */
  @JsonProperty("resource")
  @Override
  public Optional<Canonical> resource() {
    return Optional.ofNullable(resource);
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
   * @return The value of the {@code label} attribute
   */
  @JsonProperty("label")
  @Override
  public Optional<String> label() {
    return Optional.ofNullable(label);
  }

  /**
   * @return The value of the {@code type} attribute
   */
  @JsonProperty("type")
  @Override
  public Optional<RelatedartifactType> type() {
    return Optional.ofNullable(type);
  }

  /**
   * @return The value of the {@code citation} attribute
   */
  @JsonProperty("citation")
  @Override
  public Optional<Markdown> citation() {
    return Optional.ofNullable(citation);
  }

  /**
   * @return The value of the {@code url} attribute
   */
  @JsonProperty("url")
  @Override
  public Optional<Url> url() {
    return Optional.ofNullable(url);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RelatedArtifact#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRelatedArtifact withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableRelatedArtifact(
        newValue,
        this.document,
        this.display,
        this.resource,
        this.extension,
        this.label,
        this.type,
        this.citation,
        this.url);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RelatedArtifact#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRelatedArtifact withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableRelatedArtifact(
        value,
        this.document,
        this.display,
        this.resource,
        this.extension,
        this.label,
        this.type,
        this.citation,
        this.url);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RelatedArtifact#document() document} attribute.
   * @param value The value for document
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRelatedArtifact withDocument(Attachment value) {
    @Nullable Attachment newValue = Objects.requireNonNull(value, "document");
    if (this.document == newValue) return this;
    return new ImmutableRelatedArtifact(
        this.id,
        newValue,
        this.display,
        this.resource,
        this.extension,
        this.label,
        this.type,
        this.citation,
        this.url);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RelatedArtifact#document() document} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for document
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRelatedArtifact withDocument(Optional<? extends Attachment> optional) {
    @Nullable Attachment value = optional.orElse(null);
    if (this.document == value) return this;
    return new ImmutableRelatedArtifact(
        this.id,
        value,
        this.display,
        this.resource,
        this.extension,
        this.label,
        this.type,
        this.citation,
        this.url);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RelatedArtifact#display() display} attribute.
   * @param value The value for display
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRelatedArtifact withDisplay(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "display");
    if (Objects.equals(this.display, newValue)) return this;
    return new ImmutableRelatedArtifact(
        this.id,
        this.document,
        newValue,
        this.resource,
        this.extension,
        this.label,
        this.type,
        this.citation,
        this.url);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RelatedArtifact#display() display} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for display
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRelatedArtifact withDisplay(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.display, value)) return this;
    return new ImmutableRelatedArtifact(
        this.id,
        this.document,
        value,
        this.resource,
        this.extension,
        this.label,
        this.type,
        this.citation,
        this.url);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RelatedArtifact#resource() resource} attribute.
   * @param value The value for resource
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRelatedArtifact withResource(Canonical value) {
    @Nullable Canonical newValue = Objects.requireNonNull(value, "resource");
    if (this.resource == newValue) return this;
    return new ImmutableRelatedArtifact(
        this.id,
        this.document,
        this.display,
        newValue,
        this.extension,
        this.label,
        this.type,
        this.citation,
        this.url);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RelatedArtifact#resource() resource} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for resource
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRelatedArtifact withResource(Optional<? extends Canonical> optional) {
    @Nullable Canonical value = optional.orElse(null);
    if (this.resource == value) return this;
    return new ImmutableRelatedArtifact(
        this.id,
        this.document,
        this.display,
        value,
        this.extension,
        this.label,
        this.type,
        this.citation,
        this.url);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RelatedArtifact#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRelatedArtifact withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableRelatedArtifact(
        this.id,
        this.document,
        this.display,
        this.resource,
        newValue,
        this.label,
        this.type,
        this.citation,
        this.url);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RelatedArtifact#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRelatedArtifact withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableRelatedArtifact(
        this.id,
        this.document,
        this.display,
        this.resource,
        value,
        this.label,
        this.type,
        this.citation,
        this.url);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RelatedArtifact#label() label} attribute.
   * @param value The value for label
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRelatedArtifact withLabel(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "label");
    if (Objects.equals(this.label, newValue)) return this;
    return new ImmutableRelatedArtifact(
        this.id,
        this.document,
        this.display,
        this.resource,
        this.extension,
        newValue,
        this.type,
        this.citation,
        this.url);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RelatedArtifact#label() label} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for label
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRelatedArtifact withLabel(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.label, value)) return this;
    return new ImmutableRelatedArtifact(
        this.id,
        this.document,
        this.display,
        this.resource,
        this.extension,
        value,
        this.type,
        this.citation,
        this.url);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RelatedArtifact#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRelatedArtifact withType(RelatedartifactType value) {
    @Nullable RelatedartifactType newValue = Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableRelatedArtifact(
        this.id,
        this.document,
        this.display,
        this.resource,
        this.extension,
        this.label,
        newValue,
        this.citation,
        this.url);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RelatedArtifact#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRelatedArtifact withType(Optional<? extends RelatedartifactType> optional) {
    @Nullable RelatedartifactType value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableRelatedArtifact(
        this.id,
        this.document,
        this.display,
        this.resource,
        this.extension,
        this.label,
        value,
        this.citation,
        this.url);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RelatedArtifact#citation() citation} attribute.
   * @param value The value for citation
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRelatedArtifact withCitation(Markdown value) {
    @Nullable Markdown newValue = Objects.requireNonNull(value, "citation");
    if (this.citation == newValue) return this;
    return new ImmutableRelatedArtifact(
        this.id,
        this.document,
        this.display,
        this.resource,
        this.extension,
        this.label,
        this.type,
        newValue,
        this.url);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RelatedArtifact#citation() citation} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for citation
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRelatedArtifact withCitation(Optional<? extends Markdown> optional) {
    @Nullable Markdown value = optional.orElse(null);
    if (this.citation == value) return this;
    return new ImmutableRelatedArtifact(
        this.id,
        this.document,
        this.display,
        this.resource,
        this.extension,
        this.label,
        this.type,
        value,
        this.url);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RelatedArtifact#url() url} attribute.
   * @param value The value for url
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRelatedArtifact withUrl(Url value) {
    @Nullable Url newValue = Objects.requireNonNull(value, "url");
    if (this.url == newValue) return this;
    return new ImmutableRelatedArtifact(
        this.id,
        this.document,
        this.display,
        this.resource,
        this.extension,
        this.label,
        this.type,
        this.citation,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RelatedArtifact#url() url} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for url
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRelatedArtifact withUrl(Optional<? extends Url> optional) {
    @Nullable Url value = optional.orElse(null);
    if (this.url == value) return this;
    return new ImmutableRelatedArtifact(
        this.id,
        this.document,
        this.display,
        this.resource,
        this.extension,
        this.label,
        this.type,
        this.citation,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableRelatedArtifact} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableRelatedArtifact
        && equalTo((ImmutableRelatedArtifact) another);
  }

  private boolean equalTo(ImmutableRelatedArtifact another) {
    return Objects.equals(id, another.id)
        && Objects.equals(document, another.document)
        && Objects.equals(display, another.display)
        && Objects.equals(resource, another.resource)
        && Objects.equals(extension, another.extension)
        && Objects.equals(label, another.label)
        && Objects.equals(type, another.type)
        && Objects.equals(citation, another.citation)
        && Objects.equals(url, another.url);
  }

  /**
   * Computes a hash code from attributes: {@code id}, {@code document}, {@code display}, {@code resource}, {@code extension}, {@code label}, {@code type}, {@code citation}, {@code url}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(document);
    h += (h << 5) + Objects.hashCode(display);
    h += (h << 5) + Objects.hashCode(resource);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(label);
    h += (h << 5) + Objects.hashCode(type);
    h += (h << 5) + Objects.hashCode(citation);
    h += (h << 5) + Objects.hashCode(url);
    return h;
  }

  /**
   * Prints the immutable value {@code RelatedArtifact} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("RelatedArtifact{");
    if (id != null) {
      builder.append("id=").append(id);
    }
    if (document != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("document=").append(document);
    }
    if (display != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("display=").append(display);
    }
    if (resource != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("resource=").append(resource);
    }
    if (extension != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (label != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("label=").append(label);
    }
    if (type != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("type=").append(type);
    }
    if (citation != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("citation=").append(citation);
    }
    if (url != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("url=").append(url);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "RelatedArtifact", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements RelatedArtifact {
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<Attachment> document = Optional.empty();
    boolean documentIsSet;
    @Nullable Optional<String> display = Optional.empty();
    boolean displayIsSet;
    @Nullable Optional<Canonical> resource = Optional.empty();
    boolean resourceIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<String> label = Optional.empty();
    boolean labelIsSet;
    @Nullable Optional<RelatedartifactType> type = Optional.empty();
    boolean typeIsSet;
    @Nullable Optional<Markdown> citation = Optional.empty();
    boolean citationIsSet;
    @Nullable Optional<Url> url = Optional.empty();
    boolean urlIsSet;
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("document")
    public void setDocument(Optional<Attachment> document) {
      this.document = document;
      this.documentIsSet = true;
    }
    @JsonProperty("display")
    public void setDisplay(Optional<String> display) {
      this.display = display;
      this.displayIsSet = true;
    }
    @JsonProperty("resource")
    public void setResource(Optional<Canonical> resource) {
      this.resource = resource;
      this.resourceIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("label")
    public void setLabel(Optional<String> label) {
      this.label = label;
      this.labelIsSet = true;
    }
    @JsonProperty("type")
    public void setType(Optional<RelatedartifactType> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @JsonProperty("citation")
    public void setCitation(Optional<Markdown> citation) {
      this.citation = citation;
      this.citationIsSet = true;
    }
    @JsonProperty("url")
    public void setUrl(Optional<Url> url) {
      this.url = url;
      this.urlIsSet = true;
    }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Attachment> document() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> display() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Canonical> resource() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> label() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<RelatedartifactType> type() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Markdown> citation() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Url> url() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableRelatedArtifact fromJson(Json json) {
    ImmutableRelatedArtifact.Builder builder = ImmutableRelatedArtifact.builder();
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.documentIsSet) {
      builder.document(json.document);
    }
    if (json.displayIsSet) {
      builder.display(json.display);
    }
    if (json.resourceIsSet) {
      builder.resource(json.resource);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.labelIsSet) {
      builder.label(json.label);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.citationIsSet) {
      builder.citation(json.citation);
    }
    if (json.urlIsSet) {
      builder.url(json.url);
    }
    return (ImmutableRelatedArtifact) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link RelatedArtifact} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable RelatedArtifact instance
   */
  public static RelatedArtifact copyOf(RelatedArtifact instance) {
    if (instance instanceof ImmutableRelatedArtifact) {
      return (ImmutableRelatedArtifact) instance;
    }
    return ImmutableRelatedArtifact.builder()
        .id(instance.id())
        .document(instance.document())
        .display(instance.display())
        .resource(instance.resource())
        .extension(instance.extension())
        .label(instance.label())
        .type(instance.type())
        .citation(instance.citation())
        .url(instance.url())
        .build();
  }

  /**
   * Creates a builder for {@link RelatedArtifact RelatedArtifact}.
   * <pre>
   * ImmutableRelatedArtifact.builder()
   *    .id(String) // optional {@link RelatedArtifact#id() id}
   *    .document(com.medplum.types.fhir.Attachment) // optional {@link RelatedArtifact#document() document}
   *    .display(String) // optional {@link RelatedArtifact#display() display}
   *    .resource(com.medplum.types.fhir.Canonical) // optional {@link RelatedArtifact#resource() resource}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link RelatedArtifact#extension() extension}
   *    .label(String) // optional {@link RelatedArtifact#label() label}
   *    .type(com.medplum.types.fhir.RelatedartifactType) // optional {@link RelatedArtifact#type() type}
   *    .citation(com.medplum.types.fhir.Markdown) // optional {@link RelatedArtifact#citation() citation}
   *    .url(com.medplum.types.fhir.Url) // optional {@link RelatedArtifact#url() url}
   *    .build();
   * </pre>
   * @return A new RelatedArtifact builder
   */
  public static ImmutableRelatedArtifact.Builder builder() {
    return new ImmutableRelatedArtifact.Builder();
  }

  /**
   * Builds instances of type {@link RelatedArtifact RelatedArtifact}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "RelatedArtifact", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_ID = 0x1L;
    private static final long OPT_BIT_DOCUMENT = 0x2L;
    private static final long OPT_BIT_DISPLAY = 0x4L;
    private static final long OPT_BIT_RESOURCE = 0x8L;
    private static final long OPT_BIT_EXTENSION = 0x10L;
    private static final long OPT_BIT_LABEL = 0x20L;
    private static final long OPT_BIT_TYPE = 0x40L;
    private static final long OPT_BIT_CITATION = 0x80L;
    private static final long OPT_BIT_URL = 0x100L;
    private long optBits;

    private @Nullable String id;
    private @Nullable Attachment document;
    private @Nullable String display;
    private @Nullable Canonical resource;
    private @Nullable List<Extension> extension;
    private @Nullable String label;
    private @Nullable RelatedartifactType type;
    private @Nullable Markdown citation;
    private @Nullable Url url;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link RelatedArtifact#id() id} to id.
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
     * Initializes the optional value {@link RelatedArtifact#id() id} to id.
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
     * Initializes the optional value {@link RelatedArtifact#document() document} to document.
     * @param document The value for document
     * @return {@code this} builder for chained invocation
     */
    public final Builder document(Attachment document) {
      checkNotIsSet(documentIsSet(), "document");
      this.document = Objects.requireNonNull(document, "document");
      optBits |= OPT_BIT_DOCUMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link RelatedArtifact#document() document} to document.
     * @param document The value for document
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("document")
    public final Builder document(Optional<? extends Attachment> document) {
      checkNotIsSet(documentIsSet(), "document");
      this.document = document.orElse(null);
      optBits |= OPT_BIT_DOCUMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link RelatedArtifact#display() display} to display.
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
     * Initializes the optional value {@link RelatedArtifact#display() display} to display.
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
     * Initializes the optional value {@link RelatedArtifact#resource() resource} to resource.
     * @param resource The value for resource
     * @return {@code this} builder for chained invocation
     */
    public final Builder resource(Canonical resource) {
      checkNotIsSet(resourceIsSet(), "resource");
      this.resource = Objects.requireNonNull(resource, "resource");
      optBits |= OPT_BIT_RESOURCE;
      return this;
    }

    /**
     * Initializes the optional value {@link RelatedArtifact#resource() resource} to resource.
     * @param resource The value for resource
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("resource")
    public final Builder resource(Optional<? extends Canonical> resource) {
      checkNotIsSet(resourceIsSet(), "resource");
      this.resource = resource.orElse(null);
      optBits |= OPT_BIT_RESOURCE;
      return this;
    }

    /**
     * Initializes the optional value {@link RelatedArtifact#extension() extension} to extension.
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
     * Initializes the optional value {@link RelatedArtifact#extension() extension} to extension.
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
     * Initializes the optional value {@link RelatedArtifact#label() label} to label.
     * @param label The value for label
     * @return {@code this} builder for chained invocation
     */
    public final Builder label(String label) {
      checkNotIsSet(labelIsSet(), "label");
      this.label = Objects.requireNonNull(label, "label");
      optBits |= OPT_BIT_LABEL;
      return this;
    }

    /**
     * Initializes the optional value {@link RelatedArtifact#label() label} to label.
     * @param label The value for label
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("label")
    public final Builder label(Optional<String> label) {
      checkNotIsSet(labelIsSet(), "label");
      this.label = label.orElse(null);
      optBits |= OPT_BIT_LABEL;
      return this;
    }

    /**
     * Initializes the optional value {@link RelatedArtifact#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    public final Builder type(RelatedartifactType type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = Objects.requireNonNull(type, "type");
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link RelatedArtifact#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("type")
    public final Builder type(Optional<? extends RelatedartifactType> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = type.orElse(null);
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link RelatedArtifact#citation() citation} to citation.
     * @param citation The value for citation
     * @return {@code this} builder for chained invocation
     */
    public final Builder citation(Markdown citation) {
      checkNotIsSet(citationIsSet(), "citation");
      this.citation = Objects.requireNonNull(citation, "citation");
      optBits |= OPT_BIT_CITATION;
      return this;
    }

    /**
     * Initializes the optional value {@link RelatedArtifact#citation() citation} to citation.
     * @param citation The value for citation
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("citation")
    public final Builder citation(Optional<? extends Markdown> citation) {
      checkNotIsSet(citationIsSet(), "citation");
      this.citation = citation.orElse(null);
      optBits |= OPT_BIT_CITATION;
      return this;
    }

    /**
     * Initializes the optional value {@link RelatedArtifact#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for chained invocation
     */
    public final Builder url(Url url) {
      checkNotIsSet(urlIsSet(), "url");
      this.url = Objects.requireNonNull(url, "url");
      optBits |= OPT_BIT_URL;
      return this;
    }

    /**
     * Initializes the optional value {@link RelatedArtifact#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("url")
    public final Builder url(Optional<? extends Url> url) {
      checkNotIsSet(urlIsSet(), "url");
      this.url = url.orElse(null);
      optBits |= OPT_BIT_URL;
      return this;
    }

    /**
     * Builds a new {@link RelatedArtifact RelatedArtifact}.
     * @return An immutable instance of RelatedArtifact
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public RelatedArtifact build() {
      return new ImmutableRelatedArtifact(id, document, display, resource, extension, label, type, citation, url);
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean documentIsSet() {
      return (optBits & OPT_BIT_DOCUMENT) != 0;
    }

    private boolean displayIsSet() {
      return (optBits & OPT_BIT_DISPLAY) != 0;
    }

    private boolean resourceIsSet() {
      return (optBits & OPT_BIT_RESOURCE) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean labelIsSet() {
      return (optBits & OPT_BIT_LABEL) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean citationIsSet() {
      return (optBits & OPT_BIT_CITATION) != 0;
    }

    private boolean urlIsSet() {
      return (optBits & OPT_BIT_URL) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of RelatedArtifact is strict, attribute is already set: ".concat(name));
    }
  }
}
