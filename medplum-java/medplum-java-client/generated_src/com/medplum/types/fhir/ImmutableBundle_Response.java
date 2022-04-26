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
 * Immutable implementation of {@link Bundle_Response}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableBundle_Response.builder()}.
 */
@Generated(from = "Bundle_Response", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableBundle_Response implements Bundle_Response {
  private final @Nullable Uri location;
  private final @Nullable ResourceList outcome;
  private final @Nullable List<Extension> extension;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable String status;
  private final @Nullable Instant lastModified;
  private final @Nullable String id;
  private final @Nullable String etag;

  private ImmutableBundle_Response(
      @Nullable Uri location,
      @Nullable ResourceList outcome,
      @Nullable List<Extension> extension,
      @Nullable List<Extension> modifierExtension,
      @Nullable String status,
      @Nullable Instant lastModified,
      @Nullable String id,
      @Nullable String etag) {
    this.location = location;
    this.outcome = outcome;
    this.extension = extension;
    this.modifierExtension = modifierExtension;
    this.status = status;
    this.lastModified = lastModified;
    this.id = id;
    this.etag = etag;
  }

  /**
   * @return The value of the {@code location} attribute
   */
  @JsonProperty("location")
  @Override
  public Optional<Uri> location() {
    return Optional.ofNullable(location);
  }

  /**
   * @return The value of the {@code outcome} attribute
   */
  @JsonProperty("outcome")
  @Override
  public Optional<ResourceList> outcome() {
    return Optional.ofNullable(outcome);
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @JsonProperty("modifierExtension")
  @Override
  public Optional<List<Extension>> modifierExtension() {
    return Optional.ofNullable(modifierExtension);
  }

  /**
   * @return The value of the {@code status} attribute
   */
  @JsonProperty("status")
  @Override
  public Optional<String> status() {
    return Optional.ofNullable(status);
  }

  /**
   * @return The value of the {@code lastModified} attribute
   */
  @JsonProperty("lastModified")
  @Override
  public Optional<Instant> lastModified() {
    return Optional.ofNullable(lastModified);
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
   * @return The value of the {@code etag} attribute
   */
  @JsonProperty("etag")
  @Override
  public Optional<String> etag() {
    return Optional.ofNullable(etag);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Bundle_Response#location() location} attribute.
   * @param value The value for location
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBundle_Response withLocation(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "location");
    if (this.location == newValue) return this;
    return new ImmutableBundle_Response(
        newValue,
        this.outcome,
        this.extension,
        this.modifierExtension,
        this.status,
        this.lastModified,
        this.id,
        this.etag);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Bundle_Response#location() location} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for location
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBundle_Response withLocation(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.location == value) return this;
    return new ImmutableBundle_Response(
        value,
        this.outcome,
        this.extension,
        this.modifierExtension,
        this.status,
        this.lastModified,
        this.id,
        this.etag);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Bundle_Response#outcome() outcome} attribute.
   * @param value The value for outcome
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBundle_Response withOutcome(ResourceList value) {
    @Nullable ResourceList newValue = Objects.requireNonNull(value, "outcome");
    if (this.outcome == newValue) return this;
    return new ImmutableBundle_Response(
        this.location,
        newValue,
        this.extension,
        this.modifierExtension,
        this.status,
        this.lastModified,
        this.id,
        this.etag);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Bundle_Response#outcome() outcome} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for outcome
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBundle_Response withOutcome(Optional<? extends ResourceList> optional) {
    @Nullable ResourceList value = optional.orElse(null);
    if (this.outcome == value) return this;
    return new ImmutableBundle_Response(
        this.location,
        value,
        this.extension,
        this.modifierExtension,
        this.status,
        this.lastModified,
        this.id,
        this.etag);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Bundle_Response#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBundle_Response withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableBundle_Response(
        this.location,
        this.outcome,
        newValue,
        this.modifierExtension,
        this.status,
        this.lastModified,
        this.id,
        this.etag);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Bundle_Response#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBundle_Response withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableBundle_Response(
        this.location,
        this.outcome,
        value,
        this.modifierExtension,
        this.status,
        this.lastModified,
        this.id,
        this.etag);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Bundle_Response#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBundle_Response withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableBundle_Response(
        this.location,
        this.outcome,
        this.extension,
        newValue,
        this.status,
        this.lastModified,
        this.id,
        this.etag);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Bundle_Response#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBundle_Response withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableBundle_Response(
        this.location,
        this.outcome,
        this.extension,
        value,
        this.status,
        this.lastModified,
        this.id,
        this.etag);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Bundle_Response#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBundle_Response withStatus(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "status");
    if (Objects.equals(this.status, newValue)) return this;
    return new ImmutableBundle_Response(
        this.location,
        this.outcome,
        this.extension,
        this.modifierExtension,
        newValue,
        this.lastModified,
        this.id,
        this.etag);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Bundle_Response#status() status} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBundle_Response withStatus(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.status, value)) return this;
    return new ImmutableBundle_Response(
        this.location,
        this.outcome,
        this.extension,
        this.modifierExtension,
        value,
        this.lastModified,
        this.id,
        this.etag);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Bundle_Response#lastModified() lastModified} attribute.
   * @param value The value for lastModified
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBundle_Response withLastModified(Instant value) {
    @Nullable Instant newValue = Objects.requireNonNull(value, "lastModified");
    if (this.lastModified == newValue) return this;
    return new ImmutableBundle_Response(
        this.location,
        this.outcome,
        this.extension,
        this.modifierExtension,
        this.status,
        newValue,
        this.id,
        this.etag);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Bundle_Response#lastModified() lastModified} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for lastModified
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBundle_Response withLastModified(Optional<? extends Instant> optional) {
    @Nullable Instant value = optional.orElse(null);
    if (this.lastModified == value) return this;
    return new ImmutableBundle_Response(
        this.location,
        this.outcome,
        this.extension,
        this.modifierExtension,
        this.status,
        value,
        this.id,
        this.etag);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Bundle_Response#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBundle_Response withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableBundle_Response(
        this.location,
        this.outcome,
        this.extension,
        this.modifierExtension,
        this.status,
        this.lastModified,
        newValue,
        this.etag);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Bundle_Response#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBundle_Response withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableBundle_Response(
        this.location,
        this.outcome,
        this.extension,
        this.modifierExtension,
        this.status,
        this.lastModified,
        value,
        this.etag);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Bundle_Response#etag() etag} attribute.
   * @param value The value for etag
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBundle_Response withEtag(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "etag");
    if (Objects.equals(this.etag, newValue)) return this;
    return new ImmutableBundle_Response(
        this.location,
        this.outcome,
        this.extension,
        this.modifierExtension,
        this.status,
        this.lastModified,
        this.id,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Bundle_Response#etag() etag} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for etag
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBundle_Response withEtag(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.etag, value)) return this;
    return new ImmutableBundle_Response(
        this.location,
        this.outcome,
        this.extension,
        this.modifierExtension,
        this.status,
        this.lastModified,
        this.id,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableBundle_Response} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableBundle_Response
        && equalTo((ImmutableBundle_Response) another);
  }

  private boolean equalTo(ImmutableBundle_Response another) {
    return Objects.equals(location, another.location)
        && Objects.equals(outcome, another.outcome)
        && Objects.equals(extension, another.extension)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(status, another.status)
        && Objects.equals(lastModified, another.lastModified)
        && Objects.equals(id, another.id)
        && Objects.equals(etag, another.etag);
  }

  /**
   * Computes a hash code from attributes: {@code location}, {@code outcome}, {@code extension}, {@code modifierExtension}, {@code status}, {@code lastModified}, {@code id}, {@code etag}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(location);
    h += (h << 5) + Objects.hashCode(outcome);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(status);
    h += (h << 5) + Objects.hashCode(lastModified);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(etag);
    return h;
  }

  /**
   * Prints the immutable value {@code Bundle_Response} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Bundle_Response{");
    if (location != null) {
      builder.append("location=").append(location);
    }
    if (outcome != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("outcome=").append(outcome);
    }
    if (extension != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (modifierExtension != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (status != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("status=").append(status);
    }
    if (lastModified != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("lastModified=").append(lastModified);
    }
    if (id != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (etag != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("etag=").append(etag);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "Bundle_Response", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Bundle_Response {
    @Nullable Optional<Uri> location = Optional.empty();
    boolean locationIsSet;
    @Nullable Optional<ResourceList> outcome = Optional.empty();
    boolean outcomeIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<String> status = Optional.empty();
    boolean statusIsSet;
    @Nullable Optional<Instant> lastModified = Optional.empty();
    boolean lastModifiedIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<String> etag = Optional.empty();
    boolean etagIsSet;
    @JsonProperty("location")
    public void setLocation(Optional<Uri> location) {
      this.location = location;
      this.locationIsSet = true;
    }
    @JsonProperty("outcome")
    public void setOutcome(Optional<ResourceList> outcome) {
      this.outcome = outcome;
      this.outcomeIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("status")
    public void setStatus(Optional<String> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @JsonProperty("lastModified")
    public void setLastModified(Optional<Instant> lastModified) {
      this.lastModified = lastModified;
      this.lastModifiedIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("etag")
    public void setEtag(Optional<String> etag) {
      this.etag = etag;
      this.etagIsSet = true;
    }
    @Override
    public Optional<Uri> location() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<ResourceList> outcome() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> status() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Instant> lastModified() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> etag() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableBundle_Response fromJson(Json json) {
    ImmutableBundle_Response.Builder builder = ImmutableBundle_Response.builder();
    if (json.locationIsSet) {
      builder.location(json.location);
    }
    if (json.outcomeIsSet) {
      builder.outcome(json.outcome);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.lastModifiedIsSet) {
      builder.lastModified(json.lastModified);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.etagIsSet) {
      builder.etag(json.etag);
    }
    return (ImmutableBundle_Response) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Bundle_Response} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Bundle_Response instance
   */
  public static Bundle_Response copyOf(Bundle_Response instance) {
    if (instance instanceof ImmutableBundle_Response) {
      return (ImmutableBundle_Response) instance;
    }
    return ImmutableBundle_Response.builder()
        .location(instance.location())
        .outcome(instance.outcome())
        .extension(instance.extension())
        .modifierExtension(instance.modifierExtension())
        .status(instance.status())
        .lastModified(instance.lastModified())
        .id(instance.id())
        .etag(instance.etag())
        .build();
  }

  /**
   * Creates a builder for {@link Bundle_Response Bundle_Response}.
   * <pre>
   * ImmutableBundle_Response.builder()
   *    .location(com.medplum.types.fhir.Uri) // optional {@link Bundle_Response#location() location}
   *    .outcome(com.medplum.types.fhir.ResourceList) // optional {@link Bundle_Response#outcome() outcome}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link Bundle_Response#extension() extension}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link Bundle_Response#modifierExtension() modifierExtension}
   *    .status(String) // optional {@link Bundle_Response#status() status}
   *    .lastModified(com.medplum.types.fhir.Instant) // optional {@link Bundle_Response#lastModified() lastModified}
   *    .id(String) // optional {@link Bundle_Response#id() id}
   *    .etag(String) // optional {@link Bundle_Response#etag() etag}
   *    .build();
   * </pre>
   * @return A new Bundle_Response builder
   */
  public static ImmutableBundle_Response.Builder builder() {
    return new ImmutableBundle_Response.Builder();
  }

  /**
   * Builds instances of type {@link Bundle_Response Bundle_Response}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Bundle_Response", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_LOCATION = 0x1L;
    private static final long OPT_BIT_OUTCOME = 0x2L;
    private static final long OPT_BIT_EXTENSION = 0x4L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x8L;
    private static final long OPT_BIT_STATUS = 0x10L;
    private static final long OPT_BIT_LAST_MODIFIED = 0x20L;
    private static final long OPT_BIT_ID = 0x40L;
    private static final long OPT_BIT_ETAG = 0x80L;
    private long optBits;

    private @Nullable Uri location;
    private @Nullable ResourceList outcome;
    private @Nullable List<Extension> extension;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable String status;
    private @Nullable Instant lastModified;
    private @Nullable String id;
    private @Nullable String etag;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Bundle_Response#location() location} to location.
     * @param location The value for location
     * @return {@code this} builder for chained invocation
     */
    public final Builder location(Uri location) {
      checkNotIsSet(locationIsSet(), "location");
      this.location = Objects.requireNonNull(location, "location");
      optBits |= OPT_BIT_LOCATION;
      return this;
    }

    /**
     * Initializes the optional value {@link Bundle_Response#location() location} to location.
     * @param location The value for location
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("location")
    public final Builder location(Optional<? extends Uri> location) {
      checkNotIsSet(locationIsSet(), "location");
      this.location = location.orElse(null);
      optBits |= OPT_BIT_LOCATION;
      return this;
    }

    /**
     * Initializes the optional value {@link Bundle_Response#outcome() outcome} to outcome.
     * @param outcome The value for outcome
     * @return {@code this} builder for chained invocation
     */
    public final Builder outcome(ResourceList outcome) {
      checkNotIsSet(outcomeIsSet(), "outcome");
      this.outcome = Objects.requireNonNull(outcome, "outcome");
      optBits |= OPT_BIT_OUTCOME;
      return this;
    }

    /**
     * Initializes the optional value {@link Bundle_Response#outcome() outcome} to outcome.
     * @param outcome The value for outcome
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("outcome")
    public final Builder outcome(Optional<? extends ResourceList> outcome) {
      checkNotIsSet(outcomeIsSet(), "outcome");
      this.outcome = outcome.orElse(null);
      optBits |= OPT_BIT_OUTCOME;
      return this;
    }

    /**
     * Initializes the optional value {@link Bundle_Response#extension() extension} to extension.
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
     * Initializes the optional value {@link Bundle_Response#extension() extension} to extension.
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
     * Initializes the optional value {@link Bundle_Response#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Bundle_Response#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Bundle_Response#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(String status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link Bundle_Response#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("status")
    public final Builder status(Optional<String> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link Bundle_Response#lastModified() lastModified} to lastModified.
     * @param lastModified The value for lastModified
     * @return {@code this} builder for chained invocation
     */
    public final Builder lastModified(Instant lastModified) {
      checkNotIsSet(lastModifiedIsSet(), "lastModified");
      this.lastModified = Objects.requireNonNull(lastModified, "lastModified");
      optBits |= OPT_BIT_LAST_MODIFIED;
      return this;
    }

    /**
     * Initializes the optional value {@link Bundle_Response#lastModified() lastModified} to lastModified.
     * @param lastModified The value for lastModified
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("lastModified")
    public final Builder lastModified(Optional<? extends Instant> lastModified) {
      checkNotIsSet(lastModifiedIsSet(), "lastModified");
      this.lastModified = lastModified.orElse(null);
      optBits |= OPT_BIT_LAST_MODIFIED;
      return this;
    }

    /**
     * Initializes the optional value {@link Bundle_Response#id() id} to id.
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
     * Initializes the optional value {@link Bundle_Response#id() id} to id.
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
     * Initializes the optional value {@link Bundle_Response#etag() etag} to etag.
     * @param etag The value for etag
     * @return {@code this} builder for chained invocation
     */
    public final Builder etag(String etag) {
      checkNotIsSet(etagIsSet(), "etag");
      this.etag = Objects.requireNonNull(etag, "etag");
      optBits |= OPT_BIT_ETAG;
      return this;
    }

    /**
     * Initializes the optional value {@link Bundle_Response#etag() etag} to etag.
     * @param etag The value for etag
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("etag")
    public final Builder etag(Optional<String> etag) {
      checkNotIsSet(etagIsSet(), "etag");
      this.etag = etag.orElse(null);
      optBits |= OPT_BIT_ETAG;
      return this;
    }

    /**
     * Builds a new {@link Bundle_Response Bundle_Response}.
     * @return An immutable instance of Bundle_Response
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Bundle_Response build() {
      return new ImmutableBundle_Response(location, outcome, extension, modifierExtension, status, lastModified, id, etag);
    }

    private boolean locationIsSet() {
      return (optBits & OPT_BIT_LOCATION) != 0;
    }

    private boolean outcomeIsSet() {
      return (optBits & OPT_BIT_OUTCOME) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean lastModifiedIsSet() {
      return (optBits & OPT_BIT_LAST_MODIFIED) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean etagIsSet() {
      return (optBits & OPT_BIT_ETAG) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Bundle_Response is strict, attribute is already set: ".concat(name));
    }
  }
}
