package com.medplum.types.fhir;

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
 * Immutable implementation of {@link Narrative}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableNarrative.builder()}.
 */
@Generated(from = "Narrative", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableNarrative implements Narrative {
  private final Xhtml div;
  private final @Nullable NarrativeStatus status;
  private final @Nullable List<Extension> extension;
  private final @Nullable String id;

  private ImmutableNarrative(
      Xhtml div,
      @Nullable NarrativeStatus status,
      @Nullable List<Extension> extension,
      @Nullable String id) {
    this.div = div;
    this.status = status;
    this.extension = extension;
    this.id = id;
  }

  /**
   * @return The value of the {@code div} attribute
   */
  @JsonProperty("div")
  @Override
  public Xhtml div() {
    return div;
  }

  /**
   * @return The value of the {@code status} attribute
   */
  @JsonProperty("status")
  @Override
  public Optional<NarrativeStatus> status() {
    return Optional.ofNullable(status);
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
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<String> id() {
    return Optional.ofNullable(id);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Narrative#div() div} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for div
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableNarrative withDiv(Xhtml value) {
    if (this.div == value) return this;
    Xhtml newValue = Objects.requireNonNull(value, "div");
    return new ImmutableNarrative(newValue, this.status, this.extension, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Narrative#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNarrative withStatus(NarrativeStatus value) {
    @Nullable NarrativeStatus newValue = Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableNarrative(this.div, newValue, this.extension, this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Narrative#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableNarrative withStatus(Optional<? extends NarrativeStatus> optional) {
    @Nullable NarrativeStatus value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableNarrative(this.div, value, this.extension, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Narrative#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNarrative withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableNarrative(this.div, this.status, newValue, this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Narrative#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableNarrative withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableNarrative(this.div, this.status, value, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Narrative#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNarrative withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableNarrative(this.div, this.status, this.extension, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Narrative#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableNarrative withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableNarrative(this.div, this.status, this.extension, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableNarrative} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableNarrative
        && equalTo((ImmutableNarrative) another);
  }

  private boolean equalTo(ImmutableNarrative another) {
    return div.equals(another.div)
        && Objects.equals(status, another.status)
        && Objects.equals(extension, another.extension)
        && Objects.equals(id, another.id);
  }

  /**
   * Computes a hash code from attributes: {@code div}, {@code status}, {@code extension}, {@code id}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + div.hashCode();
    h += (h << 5) + Objects.hashCode(status);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(id);
    return h;
  }

  /**
   * Prints the immutable value {@code Narrative} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Narrative{");
    builder.append("div=").append(div);
    if (status != null) {
      builder.append(", ");
      builder.append("status=").append(status);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "Narrative", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Narrative {
    @Nullable Xhtml div;
    @Nullable Optional<NarrativeStatus> status = Optional.empty();
    boolean statusIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @JsonProperty("div")
    public void setDiv(Xhtml div) {
      this.div = div;
    }
    @JsonProperty("status")
    public void setStatus(Optional<NarrativeStatus> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @Override
    public Xhtml div() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<NarrativeStatus> status() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableNarrative fromJson(Json json) {
    ImmutableNarrative.Builder builder = ((ImmutableNarrative.Builder) ImmutableNarrative.builder());
    if (json.div != null) {
      builder.div(json.div);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.idIsSet) {
      builder.id(json.id);
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
        .div(instance.div())
        .status(instance.status())
        .extension(instance.extension())
        .id(instance.id())
        .build();
  }

  /**
   * Creates a builder for {@link Narrative Narrative}.
   * <pre>
   * ImmutableNarrative.builder()
   *    .div(com.medplum.types.fhir.Xhtml) // required {@link Narrative#div() div}
   *    .status(com.medplum.types.fhir.NarrativeStatus) // optional {@link Narrative#status() status}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link Narrative#extension() extension}
   *    .id(String) // optional {@link Narrative#id() id}
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
  @Generated(from = "Narrative", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements DivBuildStage, BuildFinal {
    private static final long INIT_BIT_DIV = 0x1L;
    private static final long OPT_BIT_STATUS = 0x1L;
    private static final long OPT_BIT_EXTENSION = 0x2L;
    private static final long OPT_BIT_ID = 0x4L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable Xhtml div;
    private @Nullable NarrativeStatus status;
    private @Nullable List<Extension> extension;
    private @Nullable String id;

    private Builder() {
    }

    /**
     * Initializes the value for the {@link Narrative#div() div} attribute.
     * @param div The value for div 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("div")
    public final Builder div(Xhtml div) {
      checkNotIsSet(divIsSet(), "div");
      this.div = Objects.requireNonNull(div, "div");
      initBits &= ~INIT_BIT_DIV;
      return this;
    }

    /**
     * Initializes the optional value {@link Narrative#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(NarrativeStatus status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link Narrative#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("status")
    public final Builder status(Optional<? extends NarrativeStatus> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link Narrative#extension() extension} to extension.
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
     * Initializes the optional value {@link Narrative#extension() extension} to extension.
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
     * Initializes the optional value {@link Narrative#id() id} to id.
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
     * Initializes the optional value {@link Narrative#id() id} to id.
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
     * Builds a new {@link Narrative Narrative}.
     * @return An immutable instance of Narrative
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Narrative build() {
      checkRequiredAttributes();
      return new ImmutableNarrative(div, status, extension, id);
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean divIsSet() {
      return (initBits & INIT_BIT_DIV) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Narrative is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!divIsSet()) attributes.add("div");
      return "Cannot build Narrative, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "Narrative", generator = "Immutables")
  public interface DivBuildStage {
    /**
     * Initializes the value for the {@link Narrative#div() div} attribute.
     * @param div The value for div 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal div(Xhtml div);
  }

  @Generated(from = "Narrative", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link Narrative#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(NarrativeStatus status);

    /**
     * Initializes the optional value {@link Narrative#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(Optional<? extends NarrativeStatus> status);

    /**
     * Initializes the optional value {@link Narrative#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link Narrative#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link Narrative#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(String id);

    /**
     * Initializes the optional value {@link Narrative#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<String> id);

    /**
     * Builds a new {@link Narrative Narrative}.
     * @return An immutable instance of Narrative
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    Narrative build();
  }
}
