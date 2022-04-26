package com.medplum;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link AuthHeader}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableAuthHeader.builder()}.
 * Use the static factory method to create immutable instances:
 * {@code ImmutableAuthHeader.of()}.
 */
@Generated(from = "AuthHeader", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
final class ImmutableAuthHeader extends AuthHeader {
  private final String authHeader;

  private ImmutableAuthHeader(String authHeader) {
    this.authHeader = Objects.requireNonNull(authHeader, "authHeader");
  }

  private ImmutableAuthHeader(ImmutableAuthHeader original, String authHeader) {
    this.authHeader = authHeader;
  }

  /**
   * @return The value of the {@code authHeader} attribute
   */
  @Override
  public String authHeader() {
    return authHeader;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AuthHeader#authHeader() authHeader} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for authHeader
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAuthHeader withAuthHeader(String value) {
    String newValue = Objects.requireNonNull(value, "authHeader");
    if (this.authHeader.equals(newValue)) return this;
    return new ImmutableAuthHeader(this, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableAuthHeader} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableAuthHeader
        && equalTo((ImmutableAuthHeader) another);
  }

  private boolean equalTo(ImmutableAuthHeader another) {
    return authHeader.equals(another.authHeader);
  }

  /**
   * Computes a hash code from attributes: {@code authHeader}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + authHeader.hashCode();
    return h;
  }

  /**
   * Construct a new immutable {@code AuthHeader} instance.
   * @param authHeader The value for the {@code authHeader} attribute
   * @return An immutable AuthHeader instance
   */
  public static AuthHeader of(String authHeader) {
    return new ImmutableAuthHeader(authHeader);
  }

  /**
   * Creates an immutable copy of a {@link AuthHeader} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable AuthHeader instance
   */
  public static AuthHeader copyOf(AuthHeader instance) {
    if (instance instanceof ImmutableAuthHeader) {
      return (ImmutableAuthHeader) instance;
    }
    return ImmutableAuthHeader.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link AuthHeader AuthHeader}.
   * <pre>
   * ImmutableAuthHeader.builder()
   *    .authHeader(String) // required {@link AuthHeader#authHeader() authHeader}
   *    .build();
   * </pre>
   * @return A new AuthHeader builder
   */
  public static ImmutableAuthHeader.Builder builder() {
    return new ImmutableAuthHeader.Builder();
  }

  /**
   * Builds instances of type {@link AuthHeader AuthHeader}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "AuthHeader", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_AUTH_HEADER = 0x1L;
    private long initBits = 0x1L;

    private @Nullable String authHeader;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code AuthHeader} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(AuthHeader instance) {
      Objects.requireNonNull(instance, "instance");
      authHeader(instance.authHeader());
      return this;
    }

    /**
     * Initializes the value for the {@link AuthHeader#authHeader() authHeader} attribute.
     * @param authHeader The value for authHeader 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder authHeader(String authHeader) {
      this.authHeader = Objects.requireNonNull(authHeader, "authHeader");
      initBits &= ~INIT_BIT_AUTH_HEADER;
      return this;
    }

    /**
     * Builds a new {@link AuthHeader AuthHeader}.
     * @return An immutable instance of AuthHeader
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public AuthHeader build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableAuthHeader(null, authHeader);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if ((initBits & INIT_BIT_AUTH_HEADER) != 0) attributes.add("authHeader");
      return "Cannot build AuthHeader, some of required attributes are not set " + attributes;
    }
  }
}
