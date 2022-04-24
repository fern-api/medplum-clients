//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link Narrative}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableNarrative.builder()}.
 */
@org.immutables.value.Generated(from = "Narrative", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableNarrative implements com.fhir.Narrative {
  private final @javax.annotation.Nullable java.lang.String id;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final com.fhir.xhtml div;
  private final @javax.annotation.Nullable com.fhir.NarrativeStatus status;

  private ImmutableNarrative(
      @javax.annotation.Nullable java.lang.String id,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      com.fhir.xhtml div,
      @javax.annotation.Nullable com.fhir.NarrativeStatus status) {
    this.id = id;
    this.extension = extension;
    this.div = div;
    this.status = status;
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
   * @return The value of the {@code div} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("div")
  @Override
  public com.fhir.xhtml div() {
    return div;
  }

  /**
   * @return The value of the {@code status} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("status")
  @Override
  public java.util.Optional<com.fhir.NarrativeStatus> status() {
    return java.util.Optional.ofNullable(status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Narrative#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNarrative withId(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "id");
    if (java.util.Objects.equals(this.id, newValue)) return this;
    return new ImmutableNarrative(newValue, this.extension, this.div, this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Narrative#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNarrative withId(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.id, value)) return this;
    return new ImmutableNarrative(value, this.extension, this.div, this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Narrative#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNarrative withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableNarrative(this.id, newValue, this.div, this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Narrative#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableNarrative withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableNarrative(this.id, value, this.div, this.status);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Narrative#div() div} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for div
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableNarrative withDiv(com.fhir.xhtml value) {
    if (this.div == value) return this;
    com.fhir.xhtml newValue = java.util.Objects.requireNonNull(value, "div");
    return new ImmutableNarrative(this.id, this.extension, newValue, this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Narrative#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNarrative withStatus(com.fhir.NarrativeStatus value) {
    @javax.annotation.Nullable com.fhir.NarrativeStatus newValue = java.util.Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableNarrative(this.id, this.extension, this.div, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Narrative#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableNarrative withStatus(java.util.Optional<? extends com.fhir.NarrativeStatus> optional) {
    @javax.annotation.Nullable com.fhir.NarrativeStatus value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableNarrative(this.id, this.extension, this.div, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableNarrative} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableNarrative
        && equalTo((ImmutableNarrative) another);
  }

  private boolean equalTo(ImmutableNarrative another) {
    return java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(extension, another.extension)
        && div.equals(another.div)
        && java.util.Objects.equals(status, another.status);
  }

  /**
   * Computes a hash code from attributes: {@code id}, {@code extension}, {@code div}, {@code status}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + div.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(status);
    return h;
  }

  /**
   * Prints the immutable value {@code Narrative} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("Narrative{");
    if (id != null) {
      builder.append("id=").append(id);
    }
    if (extension != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (builder.length() > 10) builder.append(", ");
    builder.append("div=").append(div);
    if (status != null) {
      builder.append(", ");
      builder.append("status=").append(status);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "Narrative", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.Narrative {
    @javax.annotation.Nullable java.util.Optional<java.lang.String> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable com.fhir.xhtml div;
    @javax.annotation.Nullable java.util.Optional<com.fhir.NarrativeStatus> status = java.util.Optional.empty();
    boolean statusIsSet;
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
    @com.fasterxml.jackson.annotation.JsonProperty("div")
    public void setDiv(com.fhir.xhtml div) {
      this.div = div;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public void setStatus(java.util.Optional<com.fhir.NarrativeStatus> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @Override
    public java.util.Optional<java.lang.String> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public com.fhir.xhtml div() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.NarrativeStatus> status() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableNarrative fromJson(Json json) {
    ImmutableNarrative.Builder builder = ((ImmutableNarrative.Builder) ImmutableNarrative.builder());
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.div != null) {
      builder.div(json.div);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    return (ImmutableNarrative) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Narrative} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Narrative instance
   */
  public static Narrative copyOf(Narrative instance) {
    if (instance instanceof ImmutableNarrative) {
      return (ImmutableNarrative) instance;
    }
    return ((ImmutableNarrative.Builder) ImmutableNarrative.builder())
        .id(instance.id())
        .extension(instance.extension())
        .div(instance.div())
        .status(instance.status())
        .build();
  }

  /**
   * Creates a builder for {@link Narrative Narrative}.
   * <pre>
   * ImmutableNarrative.builder()
   *    .id(String) // optional {@link Narrative#id() id}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Narrative#extension() extension}
   *    .div(com.fhir.xhtml) // required {@link Narrative#div() div}
   *    .status(com.fhir.NarrativeStatus) // optional {@link Narrative#status() status}
   *    .build();
   * </pre>
   * @return A new Narrative builder
   */
  public static DivBuildStage builder() {
    return new ImmutableNarrative.Builder();
  }

  /**
   * Builds instances of type {@link Narrative Narrative}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "Narrative", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements DivBuildStage, BuildFinal {
    private static final long INIT_BIT_DIV = 0x1L;
    private static final long OPT_BIT_ID = 0x1L;
    private static final long OPT_BIT_EXTENSION = 0x2L;
    private static final long OPT_BIT_STATUS = 0x4L;
    private long initBits = 0x1L;
    private long optBits;

    private @javax.annotation.Nullable java.lang.String id;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable com.fhir.xhtml div;
    private @javax.annotation.Nullable com.fhir.NarrativeStatus status;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Narrative#id() id} to id.
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
     * Initializes the optional value {@link Narrative#id() id} to id.
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
     * Initializes the optional value {@link Narrative#extension() extension} to extension.
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
     * Initializes the optional value {@link Narrative#extension() extension} to extension.
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
     * Initializes the value for the {@link Narrative#div() div} attribute.
     * @param div The value for div 
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("div")
    public final Builder div(com.fhir.xhtml div) {
      checkNotIsSet(divIsSet(), "div");
      this.div = java.util.Objects.requireNonNull(div, "div");
      initBits &= ~INIT_BIT_DIV;
      return this;
    }

    /**
     * Initializes the optional value {@link Narrative#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(com.fhir.NarrativeStatus status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = java.util.Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link Narrative#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public final Builder status(java.util.Optional<? extends com.fhir.NarrativeStatus> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Builds a new {@link Narrative Narrative}.
     * @return An immutable instance of Narrative
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.Narrative build() {
      checkRequiredAttributes();
      return new ImmutableNarrative(id, extension, div, status);
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean divIsSet() {
      return (initBits & INIT_BIT_DIV) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of Narrative is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!divIsSet()) attributes.add("div");
      return "Cannot build Narrative, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "Narrative", generator = "Immutables")
  public interface DivBuildStage {
    /**
     * Initializes the value for the {@link Narrative#div() div} attribute.
     * @param div The value for div 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal div(com.fhir.xhtml div);
  }

  @org.immutables.value.Generated(from = "Narrative", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link Narrative#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(java.lang.String id);

    /**
     * Initializes the optional value {@link Narrative#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<java.lang.String> id);

    /**
     * Initializes the optional value {@link Narrative#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link Narrative#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link Narrative#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(com.fhir.NarrativeStatus status);

    /**
     * Initializes the optional value {@link Narrative#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(java.util.Optional<? extends com.fhir.NarrativeStatus> status);

    /**
     * Builds a new {@link Narrative Narrative}.
     * @return An immutable instance of Narrative
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    Narrative build();
  }
}
