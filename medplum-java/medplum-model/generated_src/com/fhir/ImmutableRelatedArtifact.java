//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link RelatedArtifact}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableRelatedArtifact.builder()}.
 */
@org.immutables.value.Generated(from = "RelatedArtifact", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableRelatedArtifact implements com.fhir.RelatedArtifact {
  private final @javax.annotation.Nullable com.fhir.RelatedartifactType type;
  private final @javax.annotation.Nullable java.lang.String display;
  private final @javax.annotation.Nullable com.fhir.url url;
  private final @javax.annotation.Nullable com.fhir.markdown citation;
  private final @javax.annotation.Nullable com.fhir.canonical resource;
  private final @javax.annotation.Nullable java.lang.String id;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable java.lang.String label;
  private final @javax.annotation.Nullable com.fhir.Attachment document;

  private ImmutableRelatedArtifact(
      @javax.annotation.Nullable com.fhir.RelatedartifactType type,
      @javax.annotation.Nullable java.lang.String display,
      @javax.annotation.Nullable com.fhir.url url,
      @javax.annotation.Nullable com.fhir.markdown citation,
      @javax.annotation.Nullable com.fhir.canonical resource,
      @javax.annotation.Nullable java.lang.String id,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable java.lang.String label,
      @javax.annotation.Nullable com.fhir.Attachment document) {
    this.type = type;
    this.display = display;
    this.url = url;
    this.citation = citation;
    this.resource = resource;
    this.id = id;
    this.extension = extension;
    this.label = label;
    this.document = document;
  }

  /**
   * @return The value of the {@code type} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("type")
  @Override
  public java.util.Optional<com.fhir.RelatedartifactType> type() {
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
   * @return The value of the {@code url} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("url")
  @Override
  public java.util.Optional<com.fhir.url> url() {
    return java.util.Optional.ofNullable(url);
  }

  /**
   * @return The value of the {@code citation} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("citation")
  @Override
  public java.util.Optional<com.fhir.markdown> citation() {
    return java.util.Optional.ofNullable(citation);
  }

  /**
   * @return The value of the {@code resource} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("resource")
  @Override
  public java.util.Optional<com.fhir.canonical> resource() {
    return java.util.Optional.ofNullable(resource);
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
   * @return The value of the {@code label} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("label")
  @Override
  public java.util.Optional<java.lang.String> label() {
    return java.util.Optional.ofNullable(label);
  }

  /**
   * @return The value of the {@code document} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("document")
  @Override
  public java.util.Optional<com.fhir.Attachment> document() {
    return java.util.Optional.ofNullable(document);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RelatedArtifact#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRelatedArtifact withType(com.fhir.RelatedartifactType value) {
    @javax.annotation.Nullable com.fhir.RelatedartifactType newValue = java.util.Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableRelatedArtifact(
        newValue,
        this.display,
        this.url,
        this.citation,
        this.resource,
        this.id,
        this.extension,
        this.label,
        this.document);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RelatedArtifact#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRelatedArtifact withType(java.util.Optional<? extends com.fhir.RelatedartifactType> optional) {
    @javax.annotation.Nullable com.fhir.RelatedartifactType value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableRelatedArtifact(
        value,
        this.display,
        this.url,
        this.citation,
        this.resource,
        this.id,
        this.extension,
        this.label,
        this.document);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RelatedArtifact#display() display} attribute.
   * @param value The value for display
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRelatedArtifact withDisplay(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "display");
    if (java.util.Objects.equals(this.display, newValue)) return this;
    return new ImmutableRelatedArtifact(
        this.type,
        newValue,
        this.url,
        this.citation,
        this.resource,
        this.id,
        this.extension,
        this.label,
        this.document);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RelatedArtifact#display() display} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for display
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRelatedArtifact withDisplay(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.display, value)) return this;
    return new ImmutableRelatedArtifact(
        this.type,
        value,
        this.url,
        this.citation,
        this.resource,
        this.id,
        this.extension,
        this.label,
        this.document);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RelatedArtifact#url() url} attribute.
   * @param value The value for url
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRelatedArtifact withUrl(com.fhir.url value) {
    @javax.annotation.Nullable com.fhir.url newValue = java.util.Objects.requireNonNull(value, "url");
    if (this.url == newValue) return this;
    return new ImmutableRelatedArtifact(
        this.type,
        this.display,
        newValue,
        this.citation,
        this.resource,
        this.id,
        this.extension,
        this.label,
        this.document);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RelatedArtifact#url() url} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for url
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRelatedArtifact withUrl(java.util.Optional<? extends com.fhir.url> optional) {
    @javax.annotation.Nullable com.fhir.url value = optional.orElse(null);
    if (this.url == value) return this;
    return new ImmutableRelatedArtifact(
        this.type,
        this.display,
        value,
        this.citation,
        this.resource,
        this.id,
        this.extension,
        this.label,
        this.document);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RelatedArtifact#citation() citation} attribute.
   * @param value The value for citation
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRelatedArtifact withCitation(com.fhir.markdown value) {
    @javax.annotation.Nullable com.fhir.markdown newValue = java.util.Objects.requireNonNull(value, "citation");
    if (this.citation == newValue) return this;
    return new ImmutableRelatedArtifact(
        this.type,
        this.display,
        this.url,
        newValue,
        this.resource,
        this.id,
        this.extension,
        this.label,
        this.document);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RelatedArtifact#citation() citation} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for citation
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRelatedArtifact withCitation(java.util.Optional<? extends com.fhir.markdown> optional) {
    @javax.annotation.Nullable com.fhir.markdown value = optional.orElse(null);
    if (this.citation == value) return this;
    return new ImmutableRelatedArtifact(
        this.type,
        this.display,
        this.url,
        value,
        this.resource,
        this.id,
        this.extension,
        this.label,
        this.document);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RelatedArtifact#resource() resource} attribute.
   * @param value The value for resource
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRelatedArtifact withResource(com.fhir.canonical value) {
    @javax.annotation.Nullable com.fhir.canonical newValue = java.util.Objects.requireNonNull(value, "resource");
    if (this.resource == newValue) return this;
    return new ImmutableRelatedArtifact(
        this.type,
        this.display,
        this.url,
        this.citation,
        newValue,
        this.id,
        this.extension,
        this.label,
        this.document);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RelatedArtifact#resource() resource} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for resource
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRelatedArtifact withResource(java.util.Optional<? extends com.fhir.canonical> optional) {
    @javax.annotation.Nullable com.fhir.canonical value = optional.orElse(null);
    if (this.resource == value) return this;
    return new ImmutableRelatedArtifact(
        this.type,
        this.display,
        this.url,
        this.citation,
        value,
        this.id,
        this.extension,
        this.label,
        this.document);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RelatedArtifact#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRelatedArtifact withId(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "id");
    if (java.util.Objects.equals(this.id, newValue)) return this;
    return new ImmutableRelatedArtifact(
        this.type,
        this.display,
        this.url,
        this.citation,
        this.resource,
        newValue,
        this.extension,
        this.label,
        this.document);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RelatedArtifact#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRelatedArtifact withId(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.id, value)) return this;
    return new ImmutableRelatedArtifact(
        this.type,
        this.display,
        this.url,
        this.citation,
        this.resource,
        value,
        this.extension,
        this.label,
        this.document);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RelatedArtifact#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRelatedArtifact withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableRelatedArtifact(
        this.type,
        this.display,
        this.url,
        this.citation,
        this.resource,
        this.id,
        newValue,
        this.label,
        this.document);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RelatedArtifact#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRelatedArtifact withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableRelatedArtifact(
        this.type,
        this.display,
        this.url,
        this.citation,
        this.resource,
        this.id,
        value,
        this.label,
        this.document);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RelatedArtifact#label() label} attribute.
   * @param value The value for label
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRelatedArtifact withLabel(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "label");
    if (java.util.Objects.equals(this.label, newValue)) return this;
    return new ImmutableRelatedArtifact(
        this.type,
        this.display,
        this.url,
        this.citation,
        this.resource,
        this.id,
        this.extension,
        newValue,
        this.document);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RelatedArtifact#label() label} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for label
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRelatedArtifact withLabel(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.label, value)) return this;
    return new ImmutableRelatedArtifact(
        this.type,
        this.display,
        this.url,
        this.citation,
        this.resource,
        this.id,
        this.extension,
        value,
        this.document);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link RelatedArtifact#document() document} attribute.
   * @param value The value for document
   * @return A modified copy of {@code this} object
   */
  public final ImmutableRelatedArtifact withDocument(com.fhir.Attachment value) {
    @javax.annotation.Nullable com.fhir.Attachment newValue = java.util.Objects.requireNonNull(value, "document");
    if (this.document == newValue) return this;
    return new ImmutableRelatedArtifact(
        this.type,
        this.display,
        this.url,
        this.citation,
        this.resource,
        this.id,
        this.extension,
        this.label,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link RelatedArtifact#document() document} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for document
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableRelatedArtifact withDocument(java.util.Optional<? extends com.fhir.Attachment> optional) {
    @javax.annotation.Nullable com.fhir.Attachment value = optional.orElse(null);
    if (this.document == value) return this;
    return new ImmutableRelatedArtifact(
        this.type,
        this.display,
        this.url,
        this.citation,
        this.resource,
        this.id,
        this.extension,
        this.label,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableRelatedArtifact} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableRelatedArtifact
        && equalTo((ImmutableRelatedArtifact) another);
  }

  private boolean equalTo(ImmutableRelatedArtifact another) {
    return java.util.Objects.equals(type, another.type)
        && java.util.Objects.equals(display, another.display)
        && java.util.Objects.equals(url, another.url)
        && java.util.Objects.equals(citation, another.citation)
        && java.util.Objects.equals(resource, another.resource)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(label, another.label)
        && java.util.Objects.equals(document, another.document);
  }

  /**
   * Computes a hash code from attributes: {@code type}, {@code display}, {@code url}, {@code citation}, {@code resource}, {@code id}, {@code extension}, {@code label}, {@code document}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(type);
    h += (h << 5) + java.util.Objects.hashCode(display);
    h += (h << 5) + java.util.Objects.hashCode(url);
    h += (h << 5) + java.util.Objects.hashCode(citation);
    h += (h << 5) + java.util.Objects.hashCode(resource);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(label);
    h += (h << 5) + java.util.Objects.hashCode(document);
    return h;
  }

  /**
   * Prints the immutable value {@code RelatedArtifact} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("RelatedArtifact{");
    if (type != null) {
      builder.append("type=").append(type);
    }
    if (display != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("display=").append(display);
    }
    if (url != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("url=").append(url);
    }
    if (citation != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("citation=").append(citation);
    }
    if (resource != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("resource=").append(resource);
    }
    if (id != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (extension != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (label != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("label=").append(label);
    }
    if (document != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("document=").append(document);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "RelatedArtifact", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.RelatedArtifact {
    @javax.annotation.Nullable java.util.Optional<com.fhir.RelatedartifactType> type = java.util.Optional.empty();
    boolean typeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> display = java.util.Optional.empty();
    boolean displayIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.url> url = java.util.Optional.empty();
    boolean urlIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.markdown> citation = java.util.Optional.empty();
    boolean citationIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.canonical> resource = java.util.Optional.empty();
    boolean resourceIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> label = java.util.Optional.empty();
    boolean labelIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Attachment> document = java.util.Optional.empty();
    boolean documentIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    public void setType(java.util.Optional<com.fhir.RelatedartifactType> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("display")
    public void setDisplay(java.util.Optional<java.lang.String> display) {
      this.display = display;
      this.displayIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("url")
    public void setUrl(java.util.Optional<com.fhir.url> url) {
      this.url = url;
      this.urlIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("citation")
    public void setCitation(java.util.Optional<com.fhir.markdown> citation) {
      this.citation = citation;
      this.citationIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("resource")
    public void setResource(java.util.Optional<com.fhir.canonical> resource) {
      this.resource = resource;
      this.resourceIsSet = true;
    }
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
    @com.fasterxml.jackson.annotation.JsonProperty("label")
    public void setLabel(java.util.Optional<java.lang.String> label) {
      this.label = label;
      this.labelIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("document")
    public void setDocument(java.util.Optional<com.fhir.Attachment> document) {
      this.document = document;
      this.documentIsSet = true;
    }
    @Override
    public java.util.Optional<com.fhir.RelatedartifactType> type() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> display() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.url> url() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.markdown> citation() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.canonical> resource() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> label() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Attachment> document() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableRelatedArtifact fromJson(Json json) {
    ImmutableRelatedArtifact.Builder builder = ImmutableRelatedArtifact.builder();
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.displayIsSet) {
      builder.display(json.display);
    }
    if (json.urlIsSet) {
      builder.url(json.url);
    }
    if (json.citationIsSet) {
      builder.citation(json.citation);
    }
    if (json.resourceIsSet) {
      builder.resource(json.resource);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.labelIsSet) {
      builder.label(json.label);
    }
    if (json.documentIsSet) {
      builder.document(json.document);
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
        .type(instance.type())
        .display(instance.display())
        .url(instance.url())
        .citation(instance.citation())
        .resource(instance.resource())
        .id(instance.id())
        .extension(instance.extension())
        .label(instance.label())
        .document(instance.document())
        .build();
  }

  /**
   * Creates a builder for {@link RelatedArtifact RelatedArtifact}.
   * <pre>
   * ImmutableRelatedArtifact.builder()
   *    .type(com.fhir.RelatedartifactType) // optional {@link RelatedArtifact#type() type}
   *    .display(String) // optional {@link RelatedArtifact#display() display}
   *    .url(com.fhir.url) // optional {@link RelatedArtifact#url() url}
   *    .citation(com.fhir.markdown) // optional {@link RelatedArtifact#citation() citation}
   *    .resource(com.fhir.canonical) // optional {@link RelatedArtifact#resource() resource}
   *    .id(String) // optional {@link RelatedArtifact#id() id}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link RelatedArtifact#extension() extension}
   *    .label(String) // optional {@link RelatedArtifact#label() label}
   *    .document(com.fhir.Attachment) // optional {@link RelatedArtifact#document() document}
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
  @org.immutables.value.Generated(from = "RelatedArtifact", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_TYPE = 0x1L;
    private static final long OPT_BIT_DISPLAY = 0x2L;
    private static final long OPT_BIT_URL = 0x4L;
    private static final long OPT_BIT_CITATION = 0x8L;
    private static final long OPT_BIT_RESOURCE = 0x10L;
    private static final long OPT_BIT_ID = 0x20L;
    private static final long OPT_BIT_EXTENSION = 0x40L;
    private static final long OPT_BIT_LABEL = 0x80L;
    private static final long OPT_BIT_DOCUMENT = 0x100L;
    private long optBits;

    private @javax.annotation.Nullable com.fhir.RelatedartifactType type;
    private @javax.annotation.Nullable java.lang.String display;
    private @javax.annotation.Nullable com.fhir.url url;
    private @javax.annotation.Nullable com.fhir.markdown citation;
    private @javax.annotation.Nullable com.fhir.canonical resource;
    private @javax.annotation.Nullable java.lang.String id;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable java.lang.String label;
    private @javax.annotation.Nullable com.fhir.Attachment document;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link RelatedArtifact#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    public final Builder type(com.fhir.RelatedartifactType type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = java.util.Objects.requireNonNull(type, "type");
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link RelatedArtifact#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    public final Builder type(java.util.Optional<? extends com.fhir.RelatedartifactType> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = type.orElse(null);
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link RelatedArtifact#display() display} to display.
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
     * Initializes the optional value {@link RelatedArtifact#display() display} to display.
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
     * Initializes the optional value {@link RelatedArtifact#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for chained invocation
     */
    public final Builder url(com.fhir.url url) {
      checkNotIsSet(urlIsSet(), "url");
      this.url = java.util.Objects.requireNonNull(url, "url");
      optBits |= OPT_BIT_URL;
      return this;
    }

    /**
     * Initializes the optional value {@link RelatedArtifact#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("url")
    public final Builder url(java.util.Optional<? extends com.fhir.url> url) {
      checkNotIsSet(urlIsSet(), "url");
      this.url = url.orElse(null);
      optBits |= OPT_BIT_URL;
      return this;
    }

    /**
     * Initializes the optional value {@link RelatedArtifact#citation() citation} to citation.
     * @param citation The value for citation
     * @return {@code this} builder for chained invocation
     */
    public final Builder citation(com.fhir.markdown citation) {
      checkNotIsSet(citationIsSet(), "citation");
      this.citation = java.util.Objects.requireNonNull(citation, "citation");
      optBits |= OPT_BIT_CITATION;
      return this;
    }

    /**
     * Initializes the optional value {@link RelatedArtifact#citation() citation} to citation.
     * @param citation The value for citation
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("citation")
    public final Builder citation(java.util.Optional<? extends com.fhir.markdown> citation) {
      checkNotIsSet(citationIsSet(), "citation");
      this.citation = citation.orElse(null);
      optBits |= OPT_BIT_CITATION;
      return this;
    }

    /**
     * Initializes the optional value {@link RelatedArtifact#resource() resource} to resource.
     * @param resource The value for resource
     * @return {@code this} builder for chained invocation
     */
    public final Builder resource(com.fhir.canonical resource) {
      checkNotIsSet(resourceIsSet(), "resource");
      this.resource = java.util.Objects.requireNonNull(resource, "resource");
      optBits |= OPT_BIT_RESOURCE;
      return this;
    }

    /**
     * Initializes the optional value {@link RelatedArtifact#resource() resource} to resource.
     * @param resource The value for resource
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resource")
    public final Builder resource(java.util.Optional<? extends com.fhir.canonical> resource) {
      checkNotIsSet(resourceIsSet(), "resource");
      this.resource = resource.orElse(null);
      optBits |= OPT_BIT_RESOURCE;
      return this;
    }

    /**
     * Initializes the optional value {@link RelatedArtifact#id() id} to id.
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
     * Initializes the optional value {@link RelatedArtifact#id() id} to id.
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
     * Initializes the optional value {@link RelatedArtifact#extension() extension} to extension.
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
     * Initializes the optional value {@link RelatedArtifact#extension() extension} to extension.
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
     * Initializes the optional value {@link RelatedArtifact#label() label} to label.
     * @param label The value for label
     * @return {@code this} builder for chained invocation
     */
    public final Builder label(java.lang.String label) {
      checkNotIsSet(labelIsSet(), "label");
      this.label = java.util.Objects.requireNonNull(label, "label");
      optBits |= OPT_BIT_LABEL;
      return this;
    }

    /**
     * Initializes the optional value {@link RelatedArtifact#label() label} to label.
     * @param label The value for label
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("label")
    public final Builder label(java.util.Optional<java.lang.String> label) {
      checkNotIsSet(labelIsSet(), "label");
      this.label = label.orElse(null);
      optBits |= OPT_BIT_LABEL;
      return this;
    }

    /**
     * Initializes the optional value {@link RelatedArtifact#document() document} to document.
     * @param document The value for document
     * @return {@code this} builder for chained invocation
     */
    public final Builder document(com.fhir.Attachment document) {
      checkNotIsSet(documentIsSet(), "document");
      this.document = java.util.Objects.requireNonNull(document, "document");
      optBits |= OPT_BIT_DOCUMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link RelatedArtifact#document() document} to document.
     * @param document The value for document
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("document")
    public final Builder document(java.util.Optional<? extends com.fhir.Attachment> document) {
      checkNotIsSet(documentIsSet(), "document");
      this.document = document.orElse(null);
      optBits |= OPT_BIT_DOCUMENT;
      return this;
    }

    /**
     * Builds a new {@link RelatedArtifact RelatedArtifact}.
     * @return An immutable instance of RelatedArtifact
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.RelatedArtifact build() {
      return new ImmutableRelatedArtifact(type, display, url, citation, resource, id, extension, label, document);
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean displayIsSet() {
      return (optBits & OPT_BIT_DISPLAY) != 0;
    }

    private boolean urlIsSet() {
      return (optBits & OPT_BIT_URL) != 0;
    }

    private boolean citationIsSet() {
      return (optBits & OPT_BIT_CITATION) != 0;
    }

    private boolean resourceIsSet() {
      return (optBits & OPT_BIT_RESOURCE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean labelIsSet() {
      return (optBits & OPT_BIT_LABEL) != 0;
    }

    private boolean documentIsSet() {
      return (optBits & OPT_BIT_DOCUMENT) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of RelatedArtifact is strict, attribute is already set: ".concat(name));
    }
  }
}
